package app3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest04 {
	public static void main(String[] args) {
		//ApplicationContext���� ����� �� ����(���� ��ü)
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		//�⺻ ���� = singleton >> getBean�� 3�� ȣ���ص� MyBeanStyleB ��ü�� 1���� �����Ǿ� ȣ���
		// >> init�� 1�� ȣ���
		MyBeanStyle obj1 = (MyBeanStyle) factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle) factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle) factory.getBean("myBean2");
		
		run(obj1);
		show(obj1);
		
		//�����̳ʿ� ���� ������ ��ü�� �Ҹ�Ǵ� ���� = �����̳ʰ� �Ҹ�� ��
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
