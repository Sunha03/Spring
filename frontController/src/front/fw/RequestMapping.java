package front.fw;

import java.util.HashMap;

import member.LoginAction;
import member.MemberInsert;
import product.ProductList;

//FrontServlet이 넘겨준 요청 path를 가지고 실제 실행할 클래스의 객체를 만들어서 반환하는 작업을 수행하는 객체
// > 미리 요청 path별로 실행할 실제 클래스를 등록한 설정파일을 보고 객체를 찾아서 생성
//	 mycommand.properties 파일에 등록된 요청 path를 보고 실행할 객체를 찾음
//	 xml 파일이나 properties 파일을 파싱하는 코드를 정의 (생략)
public class RequestMapping {
	//xml이나 properties 파일을 파싱해서 생성해놓은 객체를 저장할 map
	//요청 path가 key, 실제 실행할 객체 value
	private HashMap<String, Action> actionMap = new HashMap<String, Action>();
	public RequestMapping() {
		//생성자 내부에서 설정파일을 파싱해서 객체로 반드는 코드 정의 필요
	}
	
	public Action mapping(String path) {
		//매개변수로 전달된 path로 등록된 Action 객체를 actionMap에서 찾아서 리턴
		//(하지만, 일단 if-else문으로 우선 처리 > 현재는 새로운 기능추가하면 코드 수정 필요)
		//실제로는 xml문서나 properties 파일을 분석해서 자동으로 만들도록 코드를 정의 > 코드 수정 필요 없음
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
