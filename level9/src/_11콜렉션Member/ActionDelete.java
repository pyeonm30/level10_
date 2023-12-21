package _11콜렉션Member;

public class ActionDelete implements Action {

	@Override
	public void execute() {
		System.out.println("[ 회 원 삭 제 ]");
		MemberDAO dao = MemberDAO.getInstance();
		if(!dao.hasData()) return;
		String id = Util.getValue("아이디 ");

		String pw = Util.getValue("비밀번호 ");
		
		if(dao.deleteMember(id, pw)) {
			System.out.println("[회원삭제 성공]");
		}else {
			System.out.println("[회원삭제 실패]");
		}
	}
}
