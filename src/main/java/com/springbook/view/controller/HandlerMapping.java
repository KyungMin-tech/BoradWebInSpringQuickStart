package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.board.DeleteBoardController;
import com.springbook.view.board.GetBoardController;
import com.springbook.view.board.GetBoardListController;
import com.springbook.view.board.InsertBoardController;
import com.springbook.view.board.UpdateBoardController;
import com.springbook.view.user.LoginController;
import com.springbook.view.user.LogoutController;

public class HandlerMapping {
	private Map<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());//login.do와 매핑이 되어 있다
		mappings.put("/getBoardList.do", new GetBoardListController());// 글 상세 보기 구현
		mappings.put("/getBoard.do", new GetBoardController());//글목록 화면에서 제목을 클릭했을 때 상세 화면이 출력되는지 확인
		mappings.put("/insertBoard.do", new InsertBoardController());// 글 등록 구현
		mappings.put("/updateBoard.do", new UpdateBoardController());//글 수정 구현
		mappings.put("/deleteBoard.do", new DeleteBoardController());//글 삭제 구현
		mappings.put("/logout.do", new LogoutController()); // 로그아웃 구현
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}

	
}
