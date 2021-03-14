package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

//����Ͻ� �޼��尡 ����Ǳ� ���� ����� ���
//@Service
//@Aspect//Before Advice Ŭ������ ������Ʈ ��ĵ�Ǿ� �ֽ���Ʈ ��ü�� �νĵǵ���
public class BeforeAdvice {
	
	//allPointcut() ���� �޼��带 �߰��Ͽ� ����Ʈ���� ����
	//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	//public void allPointcut() {}
	
	//allPointcut()���� ������ �޼��尡 ȣ�� �� ��, beforeLog() �޼��尡 Before ���·� �����ϵ��� ����
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {
		//getSignature �޼��带 �̿��ϸ�, Ŭ���̾�Ʈ�� ȣ���� �޼��� �̸��� ��� �� �� �ִ�
		String method = jp.getSignature().getName();
		//getArgs()�޼��带 ���� ���� ����� Object�迭�� �� �� �ִ�
		Object[] args = jp.getArgs();
		
		System.out.println("[���� ó��] " + method + "() �޼��� ARGS ���� : " + args[0].toString());
	}
}
