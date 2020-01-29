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
		 * ������ �����̳ʿ� ���� �����ؼ� ��ü�� ���� �޾� ����� �� �ֵ��� ����
		 * Dependency Lookup ����
		 * ���� ���� : config/bean.xml
		 * �� ��� : Samsung TV > samsung, LgTV > lg
		 * getBean���� ���ͼ� �۾��ϵ��� �ڵ� ����
		 */
		
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		
		TV tv = factory.getBean("tv", TV.class);
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
	}

}
