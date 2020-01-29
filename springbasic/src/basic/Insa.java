package basic;
public interface Insa {
	void addUser(MemberDTO user);
	MemberDTO getUser(String id);
	public void setMemberDAO(MemberDAO dao);
}

