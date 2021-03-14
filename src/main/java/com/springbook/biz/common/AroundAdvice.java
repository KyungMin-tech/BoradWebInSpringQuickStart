package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//클라이언트의 메서드 호출을 사로채는 어드바이스 
//클라이언트가 호출한 비즈니스 메서드가 실행되기 전에 사전 처리 로직을 수행할 수 있으며, 
//비즈니스 메서드가 모두 실행되고 나서 사후 로직을  수행할 수 있다
//@Service
//@Aspect
public class AroundAdvice {
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	//public void allPointcut() {}
	
	//aroundLog() 메서드를 Around 어드바이스로 동작시키기 위해서
	//aroundLog() 메서드도 바인드 변수가 없으므로 포인트컷 메서드만 참조하면 된다.
	//Around 어드바이스에서만 JoinPoint가 아닌 ProcceedingJohnPoint 객체를 매개변수로 받는다
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("[BEFOR]: 비즈니스 메서드 수행 전에 처리할 내용...");
//		Object returnObj = pjp.proceed();//Before 어드바이스와 동일하게 동작
//		//pjp.proceed() 메서드 호출 뒤에 작성된 코드는 After 어드바이스와 동일하게 동작
//		System.out.println("[AFTER]: 비즈니스 메서드 수행 후에 처리할 내용...");
//		return returnObj;
		
		String method = pjp.getSignature().getName();
		
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		
		Object obj = pjp.proceed();
		
		stopwatch.stop();
		System.out.println(method + "() 메서드 수행에 걸린 시간 : " 
				+ stopwatch.getTotalTimeMillis() + "(ms)초");
		return obj;
	}
}
