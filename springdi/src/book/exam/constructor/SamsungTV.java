package book.exam.constructor;

public class SamsungTV implements TV{
	//���� Ŭ���� ���ο��� ����ϴ� ��ü - ������ �����̳ʸ� ���� ���޹��� �� �ֵ��� �غ�
	Speaker speaker;
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}
	
	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void soundUp() {
		speaker.soundUp();
		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}

	public void soundDown() {
		speaker.soundDown();
		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}
