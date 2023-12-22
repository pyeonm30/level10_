package ploy_game;

public abstract class Unit {
	int curhp;
	int maxhp;
	int power;
	String name;
	String state = "노말";

	Unit() {
	};

	Unit(String na, int max, int pw) {
		name = na;
		maxhp = max;
		curhp = max;
		power = pw;
	};

	void init(int max, int pw) {
		maxhp = max;
		curhp = max;
		power = pw;
	};

	void init(String na, int max, int pw) {
		name = na;
		maxhp = max;
		curhp = max;
		power = pw;
	};

	void attack(Unit target) {
		target.curhp -= power;
		System.out.println("[" + name + "] 이 " + "[" + target.name + "] 에게 " + power + "의 데미지를 입힙니다. ");
		if (target.curhp <= 0) {
			System.out.println("[" + target.name + "] 을 쳐치했습니다.");
			target.curhp = 0;
		}
	}

	void printData() {
		System.out.println("[" + name + "] [" + curhp + "/" + maxhp + "] [" + power + "]");
	}
}