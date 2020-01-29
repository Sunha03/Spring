package book.exam.constructor;

public class LgTV implements TV {
	Speaker speaker;
	
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void turnOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void soundUp() {
		speaker.soundUp();
		System.out.println("LgTV---소리 올린다.");
	}

	public void soundDown() {
		speaker.soundDown();
		System.out.println("LgTV---소리 내린다.");
	}
}
