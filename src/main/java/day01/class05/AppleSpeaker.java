package day01.class05;

import org.springframework.stereotype.Component;

//@Component("apple")//SonySpeaker에도 @Component로 객체가 모두 메모리에 생성되어 있다면 컨테이너는 어떤 객체를 
				//할당할지 스스로 판단할 수 없어서 에러가 발생
public class AppleSpeaker implements Speaker {	

	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker---소리 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker---소리 내린다.");
	}

}
