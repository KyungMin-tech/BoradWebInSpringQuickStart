package day01.class05;

import org.springframework.stereotype.Component;

//@Component("apple")//SonySpeaker���� @Component�� ��ü�� ��� �޸𸮿� �����Ǿ� �ִٸ� �����̳ʴ� � ��ü�� 
				//�Ҵ����� ������ �Ǵ��� �� ��� ������ �߻�
public class AppleSpeaker implements Speaker {	

	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker ��ü ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker---�Ҹ� �ø���.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker---�Ҹ� ������.");
	}

}
