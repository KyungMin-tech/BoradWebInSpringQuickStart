package com.springbook.view.controller;

public class ViewResolver {
	//Controller가 리턴한 View 이름에 접두사(prepix)와 접미사(sufficx)를 결합하여 
	//최종으로 실행될 View경로와 파일명을 완성
	//ViewResolver도 DIspatcherServlet의 init() 메서드 호출될 때 생성
	public String prefix;
	public String suffix;
	
	//setPrefix와 setSuffix메서드로 접두사와 접미사를 초기화한다
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	//viewName앞에 prefix를 결합하고 viewName뒤에 suffix를 결합하여 리턴한다
	public String getView(String viewname) {
		return prefix + viewname + suffix;
	}
	
	
}
