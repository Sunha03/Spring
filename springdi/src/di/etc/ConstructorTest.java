package di.etc;

//DI�� �� �� Ÿ�� �ν� ���
public class ConstructorTest {
	String num1;
	String num2;
	int num3;
	int num4;
	long num5;
	long num6;
	
	public ConstructorTest(String num1, String num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("String String ������");
	}
	
	public ConstructorTest(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
		System.out.println("String int ������");
	}
	
	public ConstructorTest(long num5, long num6) {
		this.num5 = num5;
		this.num6 = num6;
		System.out.println("String long ������");
	}

	@Override
	public String toString() {
		return "ConstructorTest [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5="
				+ num5 + ", num6=" + num6 + "]";
	}
}
