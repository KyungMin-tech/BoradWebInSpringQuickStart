package day01.class05;

import org.springframework.stereotype.Component;

@Component("sony")//SonySpeaker��ü�� �޸𸮿� ������ �Ǿ� �־�� �ϹǷ� 
public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("===> SpnySpeaker ��ü ����");
	}
	public void volumeUp() {
		System.out.println("SonySpeaker---�Ҹ� �ø���.");
	}
	public void volumeDown() {
		System.out.println("SonySpeaker---�Ҹ� ������.");
	}
	
}
