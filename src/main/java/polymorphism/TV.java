package polymorphism;

public interface TV {
	//TV클래스들의 최상위 부모로 사용할 TV 인터페이스를 추가하고, 모든
	//TV가 공통으로 가져야 할 메서드들을 추상메서드로 선언한다.
	public void powerOn();
	public void powerOff();
	public void volumeUp();
	public void volumeDown();
}
