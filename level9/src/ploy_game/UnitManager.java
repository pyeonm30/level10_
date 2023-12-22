package ploy_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class UnitManager {

	ArrayList<Player> player_list = new ArrayList<>();
	ArrayList<Unit> mon_list = new ArrayList<>();
	String path = UnitManager.class.getPackageName()+".";
	String mons[] = { "UnitWolf", "UnitBat", "UnitOrc" };
	Random ran = new Random();

	UnitManager() {
		player_list.add(new Player("전사", 1000, 45));
		player_list.add(new Player("마법사", 800, 60));
		player_list.add(new Player("힐러", 500, 70));
	}

	void monster_rand_set(int size) {
		for (int i = 0; i < size; i++) {
			int num = ran.nextInt(mons.length);
			try {
				Class<?> clazz = Class.forName(path + mons[num]);
				Object obj = clazz.getDeclaredConstructor().newInstance(); // clazz.newInstance();
				Unit temp = (Unit) obj;
				int hp = ran.nextInt(100) + 100;
				int pow = ran.nextInt(10) + 10;
				temp.init(hp, pow);
				mon_list.add(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// System.out.println(mon_list.get(i).name);
		}
	}

}