package _11콜렉션Member;

public class ActionUpdate implements Action {

	@Override
	public void execute() {
		System.out.println("[ 회 원 수 정 ]");
		MemberDAO dao = MemberDAO.getInstance();
		if(!dao.hasData()) return;
		
		String id = Util.getValue("아이디 ");
		
		String pw = Util.getValue("비밀번호 ");
		
		if(dao.isValidMember(id, pw)== null) {
			System.out.println("[회원정보 불일치]");
			return;
		}

		String newPw = Util.getValue("신규 비밀번호 ");
		if(dao.updateMember(id, pw, newPw)) {
			System.out.println("[회원정보 수정 완료]");
		}else {
			System.out.println("[새로운 비밀번호로 입력해주세요]");
		}
	}
}
