package day01.class05;

public class BeanFactory {
	//Factory 패턴이 적용된 클래스
	//getBean 메서드는 매개변수로 받은 beanName에 해당하는 객체를 생성하여 리턴
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
