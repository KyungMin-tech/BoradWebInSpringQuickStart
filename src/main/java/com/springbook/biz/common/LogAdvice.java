package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//BoardService ������Ʈ�� ��� ����Ͻ� �޼��尡 ����Ǳ� ������ �������� ó���� ������ printLog()
//�޼���� ����
//@Service
//@Aspect // Apect = Pointcut + Advice //Aspect�� ������ �ֽ���Ʈ ��ü���� �ݵ�� ����Ʈ�ư� �����̽��� �����ϴ� ������ �־�� �Ѵ�
public class LogAdvice {
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void allPointcut() {}
//	
//	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
//	public void getPointcut() {}
	
	//allPointcut() ���� �޼���� ������ ����Ͻ� �޼��尡 ȣ�� �� ��, 
	//�����̽� �޼����� printLog() �޼��尡 Before ���·� �����ϵ��� ����
	@Before("PointcutCommon.allPointcut()")
	public void printLog() {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
}
