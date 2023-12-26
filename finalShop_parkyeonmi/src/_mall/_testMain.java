package _mall;

import controller.MallController;

public class _testMain {

	public static void main(String[] args) {

		
		MallController con = MallController.getInstance();
		con.init();
		
		//con.mapCont.get("MallMain");
	
		con.setLoginId("test1");
		MenuCommand commd = con.mapCont.get("MemberCart");
		commd.init();
		commd.update();

	}

}
