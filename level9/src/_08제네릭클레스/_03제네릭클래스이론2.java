package _08제네릭클레스;

import game.*;

public class _03제네릭클래스이론2 {

	public static void main(String[] args) {

		Horse<Unit> horse1 = new Horse<Unit>();
		//Horse<User> hores2 = new Horse<User>();
		horse1.setRider(new Knight());
		horse1.setRider(new MagicKnight());
		
		Horse<Knight> horse2 = new Horse<Knight>();
		horse2.setRider(new Knight());
		horse2.setRider(new MagicKnight());
		Horse<MagicKnight> horse3 = new Horse();
		//horse3.setRider(new Knight());
		horse3.setRider(new MagicKnight());
		
		// 본인 클래스를 포함한 자식 클래스 
		Horse<? extends Knight> horse4;
		horse4 = new Horse<Knight>();
		horse4 = new Horse<MagicKnight>();
		//horse4 = horse1; //부모클래스 불가능 
		horse4 = horse2;
		horse4 = horse3;
		
		// 본인을 포함한 부모 클래스만 가능 
		Horse<? super Knight> horse5;
		horse5 = horse1;
		horse5 = horse2;
		//horse5 = horse3; // 자식클래스 불가능 
		
		Horse<?> horse6;
		//horse6 = new Horse<User>();
		horse6 = horse1;
		horse6 = horse2;
		horse6 = horse3;
		
		
	}

}
