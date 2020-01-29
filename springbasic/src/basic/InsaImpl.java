package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	
	//1. 생성자를 이용한 작업 방법
	public InsaImpl() {		//기본 생성자
		
	}
	
	public InsaImpl(MemberDAO dao) {		//기본 생성자
		super();
		this.dao = dao;
	}
	
	//2. setter 메소드를 이용한 작업 방법
	public void setMemberDAO(MemberDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
