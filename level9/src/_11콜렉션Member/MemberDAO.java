package _11콜렉션Member;

import java.util.ArrayList;

// 데이터를 처리하는 애 
public class MemberDAO {
	private MemberDAO() {
		init();
	};
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	private ArrayList<Member> memberList;
	private void init() {
		memberList = new ArrayList<Member>();
	}
	
	public void insertMember(String id, String pw) {
		Member member = new Member(id,pw);
		memberList.add(member);
		System.out.println(member +" 추가 완료");
	}
	
	
	public boolean isValidId(String id) {
		if(memberList.size() == 0) return true;
		for(Member member : memberList) {
			if(member.getId().equals(id)) {
				return false;
			}
		}
		return true;
	}
	
	
}
