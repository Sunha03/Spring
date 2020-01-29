package di.setter.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	
	public InsaImpl() {
		System.out.println("InsaImpl �⺻ ������");
	}

	//Constructor Injection���� DAO ��ü�� ���Թޱ� ���� �ʿ�
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl �Ű����� 1�� ������");
	}
	
	//setter Injection���� MemberDAO ��ü�� ���Թޱ� ���� setter �޼ҵ� �غ�
	public void setDao(MemberDAO dao) {
		System.out.println("setter ȣ��");
		this.dao = dao;
	}
	
	public MemberDAO getDao() {
		return dao;
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}
}
