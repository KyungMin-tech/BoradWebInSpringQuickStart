package day01.class05;

public class BeanFactory {
	//Factory ������ ����� Ŭ����
	//getBean �޼���� �Ű������� ���� beanName�� �ش��ϴ� ��ü�� �����Ͽ� ����
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
