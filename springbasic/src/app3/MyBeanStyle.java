package app3;

public abstract class MyBeanStyle {
	public abstract void hello(String name);
	
	//��ü�� ������ �� 1�� ȣ��Ǵ� �޼ҵ�
	public void myInit() {
		System.out.println("init...");
	}
	
	//��ü�� �Ҹ�� �� 1�� ȣ��Ǵ� �޼ҵ�
	public void myDestory() {
		System.out.println("destroy!");
	}
}
