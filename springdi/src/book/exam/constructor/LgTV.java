package book.exam.constructor;

public class LgTV implements TV {
	Speaker speaker;
	
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void soundUp() {
		speaker.soundUp();
		System.out.println("LgTV---�Ҹ� �ø���.");
	}

	public void soundDown() {
		speaker.soundDown();
		System.out.println("LgTV---�Ҹ� ������.");
	}
}
