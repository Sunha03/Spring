package di.setter02;

public class LogicImpl implements Logic{
	public LogicImpl() {
		System.out.println("LoginImpl ����");
	}
	
	@Override
	public void test() {
		System.out.println("db����, xml �Ľ�, json �Ľ�, ��Ÿ �����Ͻ� ���� ����");
	}
}
