package app2;

//OOP ����Ǿ� �ִ� ���α׷�
//OOP Ư���� �����ϱ� ���� ���� Ŭ���� ����
//+ MyBeanSytleXX Ŭ������ ����ϴ� �Ű������� Ÿ���� ���� Ÿ������ ���� > ������ ����
// ���Ǵ� ��ü�� ����Ǵ��� ����� ��ü�� ����ϴ� ������ �ڵ� ���� ������ �پ��
// ������, ���� ��ü�� �����ϴ� �������� ���� & �����ϰ� ����
// ����ϴ� ��ü�� �ٲ� ������ ��ü�� ���� �����ϴ� �ڵ� ��� ���� �ʿ�(����)
// >> ����ϴ� ������ ���� new�ؼ� ��ü �����ϴ� �ڵ� ���� �ʿ�

public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyle objA = new MyBeanStyleA();
		run(objA);
		show(objA);
		
		MyBeanStyle objB = new MyBeanStyleB();
		run(objB);
		show(objB);
	}
	
	public static void run(MyBeanStyle obj) {
		System.out.println("*************************");
		obj.hello("Peng");
		obj.hello("Ha");
		System.out.println("*************************");
	}
	
	public static void show(MyBeanStyle obj) {
		System.out.println("-------------------------");
		obj.hello("Peng");
		obj.hello("Ha");
		System.out.println("-------------------------");
	}
}
