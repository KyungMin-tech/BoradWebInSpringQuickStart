package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//예외가 발생하는 시점에 동작
//@Service
//@Aspect
public class AfterThrowingAdvice {
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	//public void allPointcut() {}
	
	//exceptionLog()메서드가 After Throwing 형태로 동작하도록 
	//@AfterReturning과 마찬가지로 포인트컷을 참조
	//@AfterThrowing 역시 비즈니스 메서드에서 발생됭 예외 객체를 받아낼 바인드 변수를 지정해야 하기 때문
	@AfterThrowing(pointcut = "PointcutCommon.allPointcut()", throwing = "exceptObj")
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();		
		System.out.println(method + "() 메서드 수행 중 예외 발생!");
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("부적합한 값이 입력되었습니다.");
		}else if(exceptObj instanceof NumberFormatException) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		}else if(exceptObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
	}
}
