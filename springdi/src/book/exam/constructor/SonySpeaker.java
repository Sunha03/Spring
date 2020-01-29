package book.exam.constructor;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("SonySpeaker °´Ã¼ »ý¼º");
	}
	
	@Override
	public void soundUp() {
		System.out.println("SonySpeaker º¼·ý ¾÷!");
	}
	
	@Override
	public void soundDown() {
		System.out.println("SonySpeaker º¼·ý ´Ù¿î!");
	}
}
