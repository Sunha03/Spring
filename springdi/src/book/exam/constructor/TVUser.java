package book.exam.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * 스프링 컨테이너에 의해 생성해서 객체를 전달 받아 사용할 수 있도록 수정
		 * Dependency Lookup 적용
		 * 설정 파일 : config/bean.xml
		 * 빈 등록 : Samsung TV > samsung, LgTV > lg
		 * getBean으로 얻어와서 작업하도록 코드 수정
		 */
		
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		
		TV tv = factory.getBean("tv", TV.class);
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
	}

}
