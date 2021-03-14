package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//BoardService 컴포넌트의 모든 비즈니스 메서드가 실행되기 직전에 고통으로 처리할 로직을 printLog()
//메서드로 구현
//@Service
//@Aspect // Apect = Pointcut + Advice //Aspect가 설정된 애스팩트 객체에는 반드시 포인트컷과 어드바이스를 결합하는 설정이 있어야 한다
public class LogAdvice {
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void allPointcut() {}
//	
//	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
//	public void getPointcut() {}
	
	//allPointcut() 참조 메서드로 지정한 비즈니스 메서드가 호출 될 때, 
	//어드바이스 메서드인 printLog() 메서드가 Before 형태로 동작하도록 설정
	@Before("PointcutCommon.allPointcut()")
	public void printLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
}
