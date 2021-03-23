package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

	@RequestMapping("/logout.do") // 클라이언트로 /logout.do 요청시 아래 메서드 수행
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리");
		session.invalidate();
		return "login.jsp";
	}

}
