package com.springbook.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//���� �߻� ���ο� ������� ������ ����Ǵ� �����̽��� ����Ҷ� 
//@Service
//@Aspect
public class AfterAdvice {
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	//public void allPointcut() {}
	
	//finallyLog() �޼��尡 After Advice ���·� ���� �ϵ���
	//finallyLog() �޼��忡 ���ε� ������ �����Ƿ� @After ������ @Beforeó�� ����Ʈ�� �޼��常 �����ϸ� �ȴ�
	@After("PointcutCommon.allPointcut()")
	public void finallyLog() {
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ������ ����");
	}
}
