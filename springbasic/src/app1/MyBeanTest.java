package app1;

//���յ��� �ص��� ���� ���α׷�
// > Ŭ���� ���� ���Ե��� ���� �������� ����
// > ���Ǵ� Ŭ������ �����ϸ� �� Ŭ������ ����ϰ� �ִ� ��� �ҽ��� �����ؾ� �� >> ���� ������ �о���
// oopƯ���� ����Ǿ� ���� ����
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	
	public static void run(MyBeanStyleA obj) {
		System.out.println("*************************");
		obj.testHello("Peng");
		obj.testHello("Ha");
		System.out.println("*************************");
	}
	
	public static void show(MyBeanStyleA obj) {
		System.out.println("-------------------------");
		obj.testHello("Peng");
		obj.testHello("Ha");
		System.out.println("-------------------------");
	}
}
