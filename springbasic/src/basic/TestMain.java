package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. ������ ȣ�� ���
		/*MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);*/
		
		//2. setter �޼ҵ� ȣ�� ���
		MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl();
		insa.setMemberDAO(dao);
		
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		insa.addUser(user);

	}

}
