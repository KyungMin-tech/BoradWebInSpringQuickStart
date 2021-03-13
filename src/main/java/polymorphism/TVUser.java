package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// SamsungTV 객체를 생성하여 메서드를 호출
		/*
		 * SamsungTV tv = new SamsungTV(); tv.powerOn(); tv.volumeUp(); tv.volumeDown();
		 * tv.powerOff();
		 */

		// LgTV를 시청하는 프로그램으로 수정
		/*
		 * LgTV tv = new LgTV(); tv.turnOn(); tv.soundUp(); tv.soundDown();
		 * tv.turnOff();
		 */
		/*
		 * ① 삼성TV와 엘지TV는 메서드 신호가 다르므로 TVUser코드 대부분을 수정해야 TV를 교체 할 수 있다. 현재 상태에서는 두
		 * TV클래스가 같은 메서드를 가지게끔 강제할 어떤 수단이 없다. TVUser와 같은 클라이언트 프로그램이 하나가 아니라 여러 개라면
		 * 유지보수는 더욱더 힘들 것이며, TV교체를 결정하기가 쉽지 않을 것이다.
		 */
		/*
		 * TV tv = new SamsungTV(); tv.powerOn(); tv.volumeUp(); tv.volumeDown();
		 * tv.powerOff();
		 */
		/*
		 * ② TVUser 클래스는 TV 인터페이스 타입의 변수로 SamsungTV객체를 참조하고 있다. 이렇게 묵시적 형변환(Promotion)을
		 * 이용하여 객체를 참조하면 SamsungTV를 LgTV 객체로 변경할때, 참조하는 객체만 변경하면 되므로 객체를 쉽게 교체할 수 있다.
		 * 참조하는 객체만 변경하면 되므로 유지보순느 좀 더 편해진다.
		 */
		// BeanFactory클래스를 이용하여 사용할 TV 객체를 획득하도록 TVUser 클래스를 수정한다.
		// 프로그램을 실행할때 명령행 매개변수를 전달하지 않으면 ArrayIndexOutOfBoundsException발생
		/*
		 * BeanFactory factory = new BeanFactory(); TV tv =
		 * (TV)factory.getBean(args[0]); tv.powerOn(); tv.volumeUp(); tv.volumeDown();
		 * tv.powerOff();
		 */
		/*
		 * ③ 결국 클라이언트 소스를 수정하지 않고도 실행되는 객체를 변경할 수 있다.
		 */

		// 1. Spring 컨테이너를 구동한다. 
		AbstractApplicationContext factory = new
		GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다. 
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");

		// 3. Spring 컨테이너를 종료한다. 
		factory.close();

		/*
		 * ④ TV를 변경할 때 applicationContext.xml만 바꿔주면 된다 기존의 BeanFactory 클래스를 사용하는것보다
		 * 유지보수가 좀 더 편해진다
		 */
	}
}
