package di.setter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("config/setter.xml");
		
		Service myService = factory.getBean("service", Service.class);
		myService.test();
	}
}
