package _11콜렉션Member;

public class _Main {

	public static void main(String[] args) {

		Controller con = Controller.getInstance();

		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1) 추가");
			System.out.println("2) 삭제");
			System.out.println("3) 수정");
			System.out.println("4) 출력");
			System.out.println("0) 종료");
			int sel = Util.getValue("메뉴 입력",0,4);
			if (sel == 0) {
				System.err.println("[종료]");
				return;
			} else if (sel == 1) {
				con.getAction("insert").execute();
			} else if (sel == 2) {
				con.getAction("delete").execute();
			} else if (sel == 3) {
				con.getAction("update").execute();
			} else if (sel == 4) {
				con.getAction("selectAll").execute();
			}
		}
	}
}
