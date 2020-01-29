package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//BeanFactory(컨테이너)가 객체를 관리하는 방법 > 객체를 언제 생성하는지?
public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("************** Resource 생성 전 *************");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		System.out.println("************** BeanFactory 생성 전 *************");
		BeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("************** getBean 호출 전 *************");
		MyBeanStyle obj = (MyBeanStyle) factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle) factory.getBean("myBean1");
		
		if(obj == obj2) {
			//싱글톤. getBean할 때 객체를 생성하지만 이미 있으면 그걸 사용
			System.out.println("같음");		//(O)
		} else {
			System.out.println("다름");		//(X)
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
