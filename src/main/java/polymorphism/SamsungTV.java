package polymorphism;

public class SamsungTV implements TV {
	//SamsungTV클래스의 볼륨조절 기능을 SonySpeaker가 이용하도록 수정
	private Speaker speaker;
	private int price;
	
//	public void initMethod() {
//		System.out.println("객체 초기화 작업 처리..");
//	}
//	public void destroyMethod() {
//		System.out.println("객체 삭제 전에 처리할 로직 처리...");
//	}
	//SamsungTV 객체가 언제 생성되는지 확인하기 위해서 기본 생성자 추가
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	//setter인젝션을 테스트하기 위한 setter메서드
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	//생성자 인젝션을 테스트하기 위해서 생성자를 추가
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	//다중 변수 매핑
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}	
	//TV 시청에 필요한 필수 기능인 네 개의 메서드가 있다.
	//추가한 TV 인터페이스에 맞게 구현
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
	}	
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	public void volumeUp() {
		//speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown() {
		//speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
