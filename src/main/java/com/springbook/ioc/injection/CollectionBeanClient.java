package com.springbook.ioc.injection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//Ÿ�Կ� ���� ������ ����
//Set�÷����� ��� ���� �����͸� �ߺ��ؼ� �������� �ʴ´�.
//Map�÷��ǿ��� ���� <key> ������Ʈ�� Map��ü�� key���� �����Ҷ� ����ϸ�,
//<value>������Ʈ�� Map��ü�� value�� �����Ҷ� ����Ѵ�
//������ ������ ���߿� SpringMVC������ �ٷ� �� 
public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
//		Map<String, String> addressList = bean.getAddressList();
//		for(String key : addressList.keySet()) {
//			System.out.println(String.format("Ű : %s, �� : %s", key, addressList.get(key)));
//		}
		Properties addressList = bean.getAddressList();
		for(String key : addressList.stringPropertyNames()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, addressList.get(key)));
		}
		factory.close();
	}
}
