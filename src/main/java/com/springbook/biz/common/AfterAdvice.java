package com.springbook.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//예외 발생 여부에 상관없이 무조건 수행되는 어드바이스를 등록할때 
//@Service
//@Aspect
public class AfterAdvice {
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	//public void allPointcut() {}
	
	//finallyLog() 메서드가 After Advice 형태로 동작 하도록
	//finallyLog() 메서드에 바인드 변수가 없으므로 @After 설정은 @Before처럼 포인트컷 메서드만 참조하면 된다
	@After("PointcutCommon.allPointcut()")
	public void finallyLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작");
	}
}
