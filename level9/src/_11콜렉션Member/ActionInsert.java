package _11콜렉션Member;

public class ActionInsert implements Action {

	@Override
	public void execute() {
		System.out.println(" [ 회 원 가 입 ] ");
		MemberDAO dao = MemberDAO.getInstance();
		String id = Util.getValue("아이디 ");
		String pw = Util.getValue("비밀번호 ");
		
		if(dao.insertMember(id , pw)) {
			System.out.println("[ 회원 추가 완료 ]");
		}else {
			System.out.println("[ 회원 추가 실패]");
		}
	}
}
