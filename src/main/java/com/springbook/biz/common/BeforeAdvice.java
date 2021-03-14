package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

//비즈니스 메서드가 실행되기 전에 수행될 기능
//@Service
//@Aspect//Before Advice 클래스가 컴포넌트 스캔되어 애스팩트 객체로 인식되도록
public class BeforeAdvice {
	
	//allPointcut() 참조 메서드를 추가하여 포인트컷을 선언
	//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	//public void allPointcut() {}
	
	//allPointcut()으로 지정한 메서드가 호출 될 때, beforeLog() 메서드가 Before 형태로 동작하도록 설정
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {
		//getSignature 메서드를 이용하면, 클라이언트가 호출한 메서드 이름을 출력 할 수 있다
		String method = jp.getSignature().getName();
		//getArgs()메서드를 통해 인자 목록을 Object배열로 얻어낼 수 있다
		Object[] args = jp.getArgs();
		
		System.out.println("[사전 처리] " + method + "() 메서드 ARGS 정보 : " + args[0].toString());
	}
}
