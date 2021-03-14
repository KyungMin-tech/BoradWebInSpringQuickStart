package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//Ŭ���̾�Ʈ�� �޼��� ȣ���� ���ä�� �����̽� 
//Ŭ���̾�Ʈ�� ȣ���� ����Ͻ� �޼��尡 ����Ǳ� ���� ���� ó�� ������ ������ �� ������, 
//����Ͻ� �޼��尡 ��� ����ǰ� ���� ���� ������  ������ �� �ִ�
//@Service
//@Aspect
public class AroundAdvice {
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	//public void allPointcut() {}
	
	//aroundLog() �޼��带 Around �����̽��� ���۽�Ű�� ���ؼ�
	//aroundLog() �޼��嵵 ���ε� ������ �����Ƿ� ����Ʈ�� �޼��常 �����ϸ� �ȴ�.
	//Around �����̽������� JoinPoint�� �ƴ� ProcceedingJohnPoint ��ü�� �Ű������� �޴´�
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("[BEFOR]: ����Ͻ� �޼��� ���� ���� ó���� ����...");
//		Object returnObj = pjp.proceed();//Before �����̽��� �����ϰ� ����
//		//pjp.proceed() �޼��� ȣ�� �ڿ� �ۼ��� �ڵ�� After �����̽��� �����ϰ� ����
//		System.out.println("[AFTER]: ����Ͻ� �޼��� ���� �Ŀ� ó���� ����...");
//		return returnObj;
		
		String method = pjp.getSignature().getName();
		
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		
		Object obj = pjp.proceed();
		
		stopwatch.stop();
		System.out.println(method + "() �޼��� ���࿡ �ɸ� �ð� : " 
				+ stopwatch.getTotalTimeMillis() + "(ms)��");
		return obj;
	}
}
