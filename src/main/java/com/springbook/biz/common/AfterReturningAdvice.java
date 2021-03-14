package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

//비즈니스 메서드가 실행되고 나서 수행될 기능을 어드바이스 클래스로 구현
//@Service
//@Aspect
public class AfterReturningAdvice {
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	//public void getPointcut() {}
	
	//afterLog() 메서드가 After Returning 형태로 동작하도록
	//@Before과는 다르게 pointcut 속성을 이용하여 포인트컷을 참조하는데,
	//After Returning 어드바이스가 비즈니스 메서드 수행 결과를 받아내기 위해서 바인드 변수를 지정해야 하기 때문
	@AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " 로그인(Admin)");
			}
		}
		System.out.println("[사후처리] " + method + 
				"() 메서드 리턴값 : " + returnObj.toString());
	}
}
