package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * Spring�� �̿��Ͽ� ���α׷� ����
 * - new �����ڸ� �̿��Ͽ� ��ü �����ϴ� �ڵ带 ���� ���� (X) (API ����)
 * - Spring ���ο��� �����ϴ� Factory Ŭ������ �̿��Ͽ� ��ü�� ���� ����
 * 
 */
public class MyBeanTest {
	public static void main(String[] args) {
		//Spring�� Factory Ŭ���� ����
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		//�ʿ��� ��ü�� factory�κ��� �������� �۾�
		//�������Ͽ� ����� id�� ���� > <bean> �±��� id �Ӽ� ����
		MyBeanStyle obj = (MyBeanStyle) factory.getBean("myBean");
		
		//����Ͻ� ���� ȣ��
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
