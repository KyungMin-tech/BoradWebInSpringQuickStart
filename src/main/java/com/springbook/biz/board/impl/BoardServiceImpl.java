package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	// BoardService �������̽��� ��� �߻� �޼��带 ������(Overriding)�Ͽ� �����ؾ� �Ѵ�.
	// Ŭ���� ����ο� ��ü ������ ���� @Service�� ����Ǿ� ������, Ŭ���̾�Ʈ ���α׷����� boardService���
	// �̸����� ��ü�� ��û�� ���ֵ��� �Ƶ�� ����

	// �����ͺ��̽� ������ ���Ե� ����Ͻ� ���� ó���� ���ؼ� BoardDAO Ÿ���� ��ü�� ��������� ������ �ִ�
	// ���⿡ �������� �����ϱ� ���ؼ� ���� ���� @Autowired�� �����ߴ�
	@Autowired
	private BoardDAOSpring boardDAO;

	@Override
	public void insertBoard(BoardVO vo) {
//		if (vo.getSeq() == 0) {// After Throwing�����̽��� ����Ͻ� �޼��忡�� ���ܰ� �߻��Ҷ� �����ϹǷ� ���ܰ��߻��ϴ� �ڵ� �߰�
//			throw new IllegalArgumentException("0�� ���� ����� �� �����ϴ�.");
//		}
		boardDAO.insertBoard(vo); //100�� �� ��� ����
		//boardDAO.insertBoard(vo); //Exception�߻�
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
