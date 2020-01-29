package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//BeanFactory(�����̳�)�� ��ü�� �����ϴ� ��� > ��ü�� ���� �����ϴ���?
public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("************** Resource ���� �� *************");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		System.out.println("************** BeanFactory ���� �� *************");
		BeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("************** getBean ȣ�� �� *************");
		MyBeanStyle obj = (MyBeanStyle) factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle) factory.getBean("myBean1");
		
		if(obj == obj2) {
			//�̱���. getBean�� �� ��ü�� ���������� �̹� ������ �װ� ���
			System.out.println("����");		//(O)
		} else {
			System.out.println("�ٸ�");		//(X)
		}
		
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
