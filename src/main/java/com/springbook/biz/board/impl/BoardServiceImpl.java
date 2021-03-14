package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	//BoardService 인터페이스의 모든 추상 메서드를 재정의(Overriding)하여 구현해야 한다.
	//클래스 선언부에 객체 생성을 위한 @Service가 선언되어 있으며, 클라이언트 프로그램에서 boardService라는 
	//이름으로 객체를 요청할 수있도록 아디디도 설정
	
	//데이터베이스 연동이 포함된 비즈니스 로직 처리를 위해서 BoardDAO 타입의 객체를 멤버변수로 가지고 있다 
	//여기에 의존성을 주입하기 위해서 변수 위에 @Autowired를 설정했다
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}

}
