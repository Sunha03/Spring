package book.exam.constructor;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("AppleSpeaker °´Ã¼ »ý¼º");
	}
	
	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker º¼·ý ¾÷!");
	}
	
	@Override
	public void soundDown() {
		System.out.println("AppleSpeaker º¼·ý ´Ù¿î!");
	}
}
