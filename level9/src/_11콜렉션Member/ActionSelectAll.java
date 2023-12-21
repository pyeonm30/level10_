package _11콜렉션Member;

public class ActionSelectAll implements Action {

	@Override
	public void execute() {
		MemberDAO dao = MemberDAO.getInstance();
		if(!dao.hasData()) return;
		System.out.println(" [전체 회원 목록 ]");
		dao.printAll();
	}
}
