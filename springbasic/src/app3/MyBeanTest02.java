package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//BeanFactory 사용해서 작업
//1. xml을 spring에서 사용할 수 있도록 객체로 변환하는 작업을 수행하는 객체 생성
//	 > ClassPathResource는 xml문서를 classpath(src)에서 찾음
//2. 컨테이너 객체를 생성
public class MyBeanTest02 {
	public static void main(String[] args) {
		//1. xml 파싱
		Resource res = new ClassPathResource("/config/bean.xml");
		
		//2. 컨테이너 객체를 생성
		BeanFactory factory = new XmlBeanFactory(res);
		
		//3. 컨테이너가 관리하는 객체를 전달 받기
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
