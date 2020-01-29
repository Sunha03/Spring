package exam01;

public class TVUser {
	public static void main(String[] args) {
		/*SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		LgTV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();*/
		
		TV sstv = new SamsungTV();
		sstv.turnOn();
		sstv.soundUp();
		sstv.soundDown();
		sstv.turnOff();
		
		TV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	}

}
