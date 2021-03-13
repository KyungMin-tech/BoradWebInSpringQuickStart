package polymorphism;

public class LgTV implements TV {
	//TV 시청에 필요한 필수 기능인 네 개의 메서드가 있다.
	//추가한 인터페이스에 맞게 구현
	/*public void turnOn() {
		System.out.println("LgTV---전원 켠다.");
	}
	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	public void soundUp() {
		System.out.println("LgTV---소리 올린다.");
	}
	public void soundDown() {
		System.out.println("LgTV---소리 내린다.");
	}*/
	
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
		System.out.println("LgTV---소리 올린다.");
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
	}
}
