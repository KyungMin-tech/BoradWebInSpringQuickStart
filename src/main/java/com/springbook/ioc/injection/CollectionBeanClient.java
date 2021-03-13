package com.springbook.ioc.injection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//타입에 따른 의존성 주입
//Set컬렉션의 경우 같은 데이터를 중복해서 저장하지 않는다.
//Map컬렉션에서 사용된 <key> 엘리먼트는 Map객체의 key값을 설정할때 사용하며,
//<value>엘리먼트는 Map객체의 value를 설정할때 사용한다
//의존성 주입은 나중에 SpringMVC내용을 다룰 때 
public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
//		Map<String, String> addressList = bean.getAddressList();
//		for(String key : addressList.keySet()) {
//			System.out.println(String.format("키 : %s, 값 : %s", key, addressList.get(key)));
//		}
		Properties addressList = bean.getAddressList();
		for(String key : addressList.stringPropertyNames()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, addressList.get(key)));
		}
		factory.close();
	}
}
