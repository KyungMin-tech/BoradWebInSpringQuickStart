package day01.class05;

public interface Speaker {
	//스피커 교체 같은 상황같은 경우도 있으므로 
	//의존성 주입
	void volumeUp();
	void volumeDown();
}
