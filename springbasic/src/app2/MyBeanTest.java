package app2;

//OOP 적용되어 있는 프로그램
//OOP 특성을 적용하기 위해 상위 클래스 정의
//+ MyBeanSytleXX 클래스를 사용하는 매개변수의 타입을 상위 타입으로 변경 > 다형성 적용
// 사용되는 객체가 변경되더라도 변경된 객체를 사용하는 곳에서 코드 수정 범위가 줄어듦
// 하지만, 실제 객체를 전달하는 곳에서는 생성 & 전달하고 있음
// 사용하는 객체가 바뀔 때마다 객체를 직접 생성하는 코드 모두 수정 필요(단점)
// >> 사용하는 곳에서 직접 new해서 객체 생성하는 코드 제거 필요

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
