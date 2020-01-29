package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		TV sstv = factory.getBean("samsung",TV.class);
		sstv.turnOn();
		sstv.soundUp();
		sstv.soundDown();
		sstv.turnOff();
		
		TV lgtv = factory.getBean("lg",TV.class);
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	
	}

}
