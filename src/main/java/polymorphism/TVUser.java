package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// SamsungTV ��ü�� �����Ͽ� �޼��带 ȣ��
		/*
		 * SamsungTV tv = new SamsungTV(); tv.powerOn(); tv.volumeUp(); tv.volumeDown();
		 * tv.powerOff();
		 */

		// LgTV�� ��û�ϴ� ���α׷����� ����
		/*
		 * LgTV tv = new LgTV(); tv.turnOn(); tv.soundUp(); tv.soundDown();
		 * tv.turnOff();
		 */
		/*
		 * �� �ＺTV�� ����TV�� �޼��� ��ȣ�� �ٸ��Ƿ� TVUser�ڵ� ��κ��� �����ؾ� TV�� ��ü �� �� �ִ�. ���� ���¿����� ��
		 * TVŬ������ ���� �޼��带 �����Բ� ������ � ������ ����. TVUser�� ���� Ŭ���̾�Ʈ ���α׷��� �ϳ��� �ƴ϶� ���� �����
		 * ���������� ����� ���� ���̸�, TV��ü�� �����ϱⰡ ���� ���� ���̴�.
		 */
		/*
		 * TV tv = new SamsungTV(); tv.powerOn(); tv.volumeUp(); tv.volumeDown();
		 * tv.powerOff();
		 */
		/*
		 * �� TVUser Ŭ������ TV �������̽� Ÿ���� ������ SamsungTV��ü�� �����ϰ� �ִ�. �̷��� ������ ����ȯ(Promotion)��
		 * �̿��Ͽ� ��ü�� �����ϸ� SamsungTV�� LgTV ��ü�� �����Ҷ�, �����ϴ� ��ü�� �����ϸ� �ǹǷ� ��ü�� ���� ��ü�� �� �ִ�.
		 * �����ϴ� ��ü�� �����ϸ� �ǹǷ� ���������� �� �� ��������.
		 */
		// BeanFactoryŬ������ �̿��Ͽ� ����� TV ��ü�� ȹ���ϵ��� TVUser Ŭ������ �����Ѵ�.
		// ���α׷��� �����Ҷ� ����� �Ű������� �������� ������ ArrayIndexOutOfBoundsException�߻�
		/*
		 * BeanFactory factory = new BeanFactory(); TV tv =
		 * (TV)factory.getBean(args[0]); tv.powerOn(); tv.volumeUp(); tv.volumeDown();
		 * tv.powerOff();
		 */
		/*
		 * �� �ᱹ Ŭ���̾�Ʈ �ҽ��� �������� �ʰ� ����Ǵ� ��ü�� ������ �� �ִ�.
		 */

		// 1. Spring �����̳ʸ� �����Ѵ�. 
		AbstractApplicationContext factory = new
		GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�. 
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");

		// 3. Spring �����̳ʸ� �����Ѵ�. 
		factory.close();

		/*
		 * �� TV�� ������ �� applicationContext.xml�� �ٲ��ָ� �ȴ� ������ BeanFactory Ŭ������ ����ϴ°ͺ���
		 * ���������� �� �� ��������
		 */
	}
}
