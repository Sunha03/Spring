package app3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest04 {
	public static void main(String[] args) {
		//ApplicationContext보다 기능이 더 많음(하위 객체)
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		//기본 설정 = singleton >> getBean을 3번 호출해도 MyBeanStyleB 객체는 1개만 생성되어 호출됨
		// >> init도 1번 호출됨
		MyBeanStyle obj1 = (MyBeanStyle) factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle) factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle) factory.getBean("myBean2");
		
		run(obj1);
		show(obj1);
		
		//컨테이너에 의해 생성된 객체가 소멸되는 시점 = 컨테이너가 소멸될 때
		factory.close();
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
