package app1;

//결합도가 극도로 높은 프로그램
// > 클래스 간의 결함도가 높고 의존성이 높음
// > 사용되는 클래스를 변경하면 이 클래스를 사용하고 있는 모든 소스를 수정해야 함 >> 수정 범위가 넓어짐
// oop특성도 적용되어 있지 않음
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
