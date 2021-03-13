package day01.class05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")//@Component를 설정해줌으로써 스프링 컨테이너는 해당 클래스를 bean으로생성하고 관리한다.
public class LgTV implements TV {
	@Autowired // 멤버변수 위에 확인하는 순간 해당변수의 타입을 체크 한 후, 그타입의 객체가 메모리에 존재하는지 확인한 후에, 
			//그 객체를 변수에 주입한다.
	@Qualifier("apple")//SonySpeaker인지 AppleSpeaker인지 의존성주입될 객체의 아이디나 이름을 지정
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
