package _11콜렉션Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
	
	public boolean insertMember(String id, String pw) {
		
		if(getMemberById(id)!= null) {
			System.out.println("이미 사용하는 아이디");
			return false;
		}
		Member member = new Member(id,pw);
		memberList.add(member);
		System.out.println(member +" 추가 완료");
		return true;
	}
	
	public boolean hasData() {
		if(memberList.size() == 0) {
			System.out.println("회원 데이터가 존재하지 않습니다");
		}
		return memberList.size() >0;
	}


	
	public Member isValidMember(String id, String pw) {
		Member member = getMemberById(id);
		if(getMemberById(id)== null) {
			System.out.println("아이디가 존재하지 않습니다");
			return null;
		}
		if(!isMatchPw(member, pw)) return null;
		return member;
	}
	
	private boolean isMatchPw(Member member , String pw) {
		if(!member.getPw().equals(pw)) {
			System.out.println("비밀번호 불일치 ");
		}
		return member.getPw().equals(pw);
	}
	

	public boolean deleteMember(String id, String pw) {
		
		Member member = isValidMember(id, pw);
		if(member == null) return false;
		memberList.remove(member);
		return true;
	}
	

	public Member getMemberById(String id) {
		if(memberList.size() == 0) return null;
		for (Member m : memberList) {
			if (id.equals(m.getId())) {
				return m;
			}
		}
		return null;
	}
	
	
	public boolean updateMember(String id, String pw, String newPw) {

		if(pw.equals(newPw)) {
			return false;
		}
		
		Member m = getMemberById(id);
		m.setPw(newPw);
		System.out.println(m);
		return true;
		
	}
	
	
	void printAll() {
		ArrayList<Member> list = (ArrayList<Member>) memberList.clone();
		Collections.sort(list);
		
		for(Member m : memberList) {
			System.out.println(m);
		}
		System.out.println("--------- id 순으로 정렬 ----------");
		for(Member m : list) {
			System.out.println(m);
		}
		
	}


}
