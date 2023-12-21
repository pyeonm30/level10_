package _11콜렉션Member;

public class ActionInsert implements Action{
	
	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		
		// 멤버 추가하는 페이지 
		System.out.println(" 멤버 추가하기 ");
		
		System.out.println("아이디 입력 >> ");
		String id = Util.sc.next();

		System.out.println("비밀번호 입력 >> ");
		String pw = Util.sc.next();
		
		if(dao.insertMember(id , pw)) {
			System.out.println("[ 회원 추가 완료 ]");
		}else {
			System.out.println("[ 회원 추가 실패]");
		}
		
	}

}
