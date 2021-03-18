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
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {// �۸�� �˻� ����
		System.out.println("�� ��� �˻� ó��");
		
		//1. ����� �Է� ���� ����(�˻� ����� ���߿� ����)
		//2. DB ���� ó��
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
//		//3. �˻� ����� ���ǿ� �����ϰ� ��� ȭ������ �̵��Ѵ�.
//		HttpSession session = request.getSession();
//		session.setAttribute("boardList", boardList);
//		return "getBoardList";//JSP�̸� Ȯ���� ���� �����ϴµ�, ViewResolver�� �̿��Ͽ� View �̸��� �ϼ��ϱ� ������ ���� 
		
		//�˻� ����� ������ �ƴ� HttpServletRequest ��ü�� �����ϴ� ��
		//HttpServletRequest�� Ŭ���̾�Ʈ�� ��û�� ���� �ƴٰ� ���� �޽����� Ŭ���̾�Ʈ�� ���۵Ǹ� �ڵ����� �����Ǵ� ��ȸ�� ��ü
		//�˻� ����� ������ �ƴ�HttpServletRequest ��ü�� �����Ͽ� ���� 
		
		//3. �˻� ����� ȭ�� ������ ModelAndView�� �����Ͽ� �����Ѵ�.
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList); // Model ���� ����
		mav.setViewName("getBoardList"); // view ��������
		return mav;
	}

}
