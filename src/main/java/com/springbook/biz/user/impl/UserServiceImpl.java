package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	//UserServiceImpl 클래스의 비즈니스 메서드를 구현할 때, 멤버변수로 선언된 UserDAO 객체를 이용하여 DB연동처리
	@Autowired
	private UserDAO userDAO;	
	
	//Setter 인젝션 처리를 위한 Setter메서드를 추가
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
