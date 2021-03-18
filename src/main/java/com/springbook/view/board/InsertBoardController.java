package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class InsertBoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {// 글 등록 구현
		System.out.println("글 등록 처리");
		
		//1. 사용자 입력 정보 추출
		//request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		//2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(vo);
		
		//3. 화면 네비게이션
		// 글 등록 작업을 처리한 후에 getBoardList.do 문자열을 리턴
		//글 등록에 성공하면 등록된 글이 포함된 글 목록을 다시 검색해야 해서 getBoardList.do문자열을 리턴 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:getBoardList.do");//ModelAndView객체에 getBoardList.do를 view이름으로 설정하고 리턴
		return mav;//글 등록기능을 처리하고 나면 반드시 ModelAndView 객체를 리턴해야 한다.
	}

}
