package day01.class05;

import org.springframework.stereotype.Component;

@Component("sony")//SonySpeaker객체가 메모리에 생성이 되어 있어야 하므로 
public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("===> SpnySpeaker 객체 생성");
	}
	public void volumeUp() {
		System.out.println("SonySpeaker---소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("SonySpeaker---소리 내린다.");
	}
	
}
