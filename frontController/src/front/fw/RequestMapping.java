package front.fw;

import java.util.HashMap;

import member.LoginAction;
import member.MemberInsert;
import product.ProductList;

//FrontServlet�� �Ѱ��� ��û path�� ������ ���� ������ Ŭ������ ��ü�� ���� ��ȯ�ϴ� �۾��� �����ϴ� ��ü
// > �̸� ��û path���� ������ ���� Ŭ������ ����� ���������� ���� ��ü�� ã�Ƽ� ����
//	 mycommand.properties ���Ͽ� ��ϵ� ��û path�� ���� ������ ��ü�� ã��
//	 xml �����̳� properties ������ �Ľ��ϴ� �ڵ带 ���� (����)
public class RequestMapping {
	//xml�̳� properties ������ �Ľ��ؼ� �����س��� ��ü�� ������ map
	//��û path�� key, ���� ������ ��ü value
	private HashMap<String, Action> actionMap = new HashMap<String, Action>();
	public RequestMapping() {
		//������ ���ο��� ���������� �Ľ��ؼ� ��ü�� �ݵ�� �ڵ� ���� �ʿ�
	}
	
	public Action mapping(String path) {
		//�Ű������� ���޵� path�� ��ϵ� Action ��ü�� actionMap���� ã�Ƽ� ����
		//(������, �ϴ� if-else������ �켱 ó�� > ����� ���ο� ����߰��ϸ� �ڵ� ���� �ʿ�)
		//�����δ� xml������ properties ������ �м��ؼ� �ڵ����� ���鵵�� �ڵ带 ���� > �ڵ� ���� �ʿ� ����
		Action action = null;
		
		if(path.equals("/product/list.do")) {
			action = new ProductList();
		} else if(path.equals("/member/customer/insert.do")) {
			action = new MemberInsert();
		} else if(path.equals("/member/customer/login.do")) {
			action = new LoginAction();
		}
		
		return action;
	}
}
