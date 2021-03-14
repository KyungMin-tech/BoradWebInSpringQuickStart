package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//���ܰ� �߻��ϴ� ������ ����
//@Service
//@Aspect
public class AfterThrowingAdvice {
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	//public void allPointcut() {}
	
	//exceptionLog()�޼��尡 After Throwing ���·� �����ϵ��� 
	//@AfterReturning�� ���������� ����Ʈ���� ����
	//@AfterThrowing ���� ����Ͻ� �޼��忡�� �߻��� ���� ��ü�� �޾Ƴ� ���ε� ������ �����ؾ� �ϱ� ����
	@AfterThrowing(pointcut = "PointcutCommon.allPointcut()", throwing = "exceptObj")
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();		
		System.out.println(method + "() �޼��� ���� �� ���� �߻�!");
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("�������� ���� �ԷµǾ����ϴ�.");
		}else if(exceptObj instanceof NumberFormatException) {
			System.out.println("���� ������ ���� �ƴմϴ�.");
		}else if(exceptObj instanceof Exception) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}
}
