package com.springbook.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class GetBoardListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {// 글목록 검색 구현
		System.out.println("글 목록 검색 처리");
		
		//1. 사용자 입력 정보 추출(검색 기능은 나중에 구현)
		//2. DB 연동 처리
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
//		//3. 검색 결과를 세션에 저장하고 목록 화면으로 이동한다.
//		HttpSession session = request.getSession();
//		session.setAttribute("boardList", boardList);
//		return "getBoardList";//JSP이름 확장자 없이 리턴하는데, ViewResolver를 이용하여 View 이름을 완성하기 때문에 생략 
		
		//검색 결과는 세션이 아닌 HttpServletRequest 객체에 저장하는 것
		//HttpServletRequest는 클라이언트의 요청에 생성 됐다가 응답 메시지가 클라이언트로 전송되면 자동으로 삭제되는 일회성 객체
		//검색 결과는 세션이 아닌HttpServletRequest 객체에 저장하여 공유 
		
		//3. 검색 결과와 화면 정보를 ModelAndView에 저장하여 리턴한다.
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList); // Model 정보 저장
		mav.setViewName("getBoardList"); // view 정보저장
		return mav;
	}

}
