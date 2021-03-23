package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println("로그인 화면으로 이동...");
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST) //클라이언트의 /login.do 요청이 있을시 아래 메서드 수행
	public String login(UserVO vo, UserDAO userdDAO, HttpSession session) {
		System.out.println("로그인 인증 처리...");
		if(vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		UserVO user = userdDAO.getUser(vo);
		if(user != null) {//로그인 성공과 실패에 관한 리턴
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}else
			return "login.jsp";
	}

}
