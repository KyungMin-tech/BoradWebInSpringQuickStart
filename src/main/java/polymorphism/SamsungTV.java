package polymorphism;

public class SamsungTV implements TV {
	//SamsungTVŬ������ �������� ����� SonySpeaker�� �̿��ϵ��� ����
	private Speaker speaker;
	private int price;
	
//	public void initMethod() {
//		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
//	}
//	public void destroyMethod() {
//		System.out.println("��ü ���� ���� ó���� ���� ó��...");
//	}
	//SamsungTV ��ü�� ���� �����Ǵ��� Ȯ���ϱ� ���ؼ� �⺻ ������ �߰�
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}
	//setter�������� �׽�Ʈ�ϱ� ���� setter�޼���
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}
	//������ �������� �׽�Ʈ�ϱ� ���ؼ� �����ڸ� �߰�
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	//���� ���� ����
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}	
	//TV ��û�� �ʿ��� �ʼ� ����� �� ���� �޼��尡 �ִ�.
	//�߰��� TV �������̽��� �°� ����
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
	}	
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
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
