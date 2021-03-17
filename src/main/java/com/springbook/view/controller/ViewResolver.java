package com.springbook.view.controller;

public class ViewResolver {
	//Controller�� ������ View �̸��� ���λ�(prepix)�� ���̻�(sufficx)�� �����Ͽ� 
	//�������� ����� View��ο� ���ϸ��� �ϼ�
	//ViewResolver�� DIspatcherServlet�� init() �޼��� ȣ��� �� ����
	public String prefix;
	public String suffix;
	
	//setPrefix�� setSuffix�޼���� ���λ�� ���̻縦 �ʱ�ȭ�Ѵ�
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	//viewName�տ� prefix�� �����ϰ� viewName�ڿ� suffix�� �����Ͽ� �����Ѵ�
	public String getView(String viewname) {
		return prefix + viewname + suffix;
	}
	
	
}
