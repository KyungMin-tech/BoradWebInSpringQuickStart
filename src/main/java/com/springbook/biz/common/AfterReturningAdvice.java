package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

//����Ͻ� �޼��尡 ����ǰ� ���� ����� ����� �����̽� Ŭ������ ����
//@Service
//@Aspect
public class AfterReturningAdvice {
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	//public void getPointcut() {}
	
	//afterLog() �޼��尡 After Returning ���·� �����ϵ���
	//@Before���� �ٸ��� pointcut �Ӽ��� �̿��Ͽ� ����Ʈ���� �����ϴµ�,
	//After Returning �����̽��� ����Ͻ� �޼��� ���� ����� �޾Ƴ��� ���ؼ� ���ε� ������ �����ؾ� �ϱ� ����
	@AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " �α���(Admin)");
			}
		}
		System.out.println("[����ó��] " + method + 
				"() �޼��� ���ϰ� : " + returnObj.toString());
	}
}
