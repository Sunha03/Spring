package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. 생성자 호출 방식
		/*MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);*/
		
		//2. setter 메소드 호출 방식
		MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl();
		insa.setMemberDAO(dao);
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}
