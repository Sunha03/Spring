package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * Spring을 이용하여 프로그램 실행
 * - new 연산자를 이용하여 객체 생성하는 코드를 직접 정의 (X) (API 제외)
 * - Spring 내부에서 제공하는 Factory 클래스를 이용하여 객체를 전달 받음
 * 
 */
public class MyBeanTest {
	public static void main(String[] args) {
		//Spring의 Factory 클래스 생성
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		//필요한 객체를 factory로부터 가져오는 작업
		//설정파일에 등록한 id명 정의 > <bean> 태그의 id 속성 정의
		MyBeanStyle obj = (MyBeanStyle) factory.getBean("myBean");
		
		//비즈니스 로직 호출
		run(obj);
		show(obj);
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
