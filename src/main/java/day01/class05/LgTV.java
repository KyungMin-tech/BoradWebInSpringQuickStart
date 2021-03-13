package day01.class05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")//@Component�� �����������ν� ������ �����̳ʴ� �ش� Ŭ������ bean���λ����ϰ� �����Ѵ�.
public class LgTV implements TV {
	@Autowired // ������� ���� Ȯ���ϴ� ���� �ش纯���� Ÿ���� üũ �� ��, ��Ÿ���� ��ü�� �޸𸮿� �����ϴ��� Ȯ���� �Ŀ�, 
			//�� ��ü�� ������ �����Ѵ�.
	@Qualifier("apple")//SonySpeaker���� AppleSpeaker���� ���������Ե� ��ü�� ���̵� �̸��� ����
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV ��ü ����");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV---���� ����.");
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
