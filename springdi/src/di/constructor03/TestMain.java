package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		ArticleDTO dto = new ArticleDTO("Mike", "Hi", "hello world!", "2020/01/23");
		
		IWriteArticleMgr iWriteArticleMgr = factory.getBean("writeArticleMgr", IWriteArticleMgr.class);
		iWriteArticleMgr.write(dto);
	}

}
