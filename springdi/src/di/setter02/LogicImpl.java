package di.setter02;

public class LogicImpl implements Logic{
	public LogicImpl() {
		System.out.println("LoginImpl 생성");
	}
	
	@Override
	public void test() {
		System.out.println("db연동, xml 파싱, json 파싱, 기타 비지니스 로직 구현");
	}
}
