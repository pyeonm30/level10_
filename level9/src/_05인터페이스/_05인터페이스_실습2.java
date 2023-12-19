package _05인터페이스;
// 마크 인터페이스 : 안에 구현부는 없고 클래스를 구분하기 위해서 사용하는 인터페이스 
interface Repairable{}

// 모든 유닛의 최고 조상클래스
class Unit{
	protected final int MAX_HP;
	protected int hp;
	protected String name;
	
	public Unit(int hp) {
		MAX_HP = hp;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "%s [%d / %d]".formatted(name,hp,MAX_HP);
	}
	
}

abstract class GroundUnit extends Unit{
	public GroundUnit(int hp) {
		super(hp);
	}
}
abstract class AirUnit extends Unit{
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	public Tank() {
		super(150);
		name ="Tank";
		System.out.println(this);
	}
}

class Marine extends GroundUnit{
	public Marine() {
		super(70);
		name="Marine";
		System.out.println(this);
	}
}

class DropShip extends AirUnit implements Repairable{
	public DropShip() {
		super(120);
		name = "DropShip";
		System.out.println(this);
	}
}

class SCV extends GroundUnit implements Repairable{

	public SCV() {
		super(100);
		name="SCV";
		System.out.println(this);
	}
	public void repair(Repairable repairUnit) {
		Unit unit = (Unit) repairUnit;
		unit.hp+=30;
		if(unit.hp > unit.MAX_HP) {
			unit.hp = unit.MAX_HP;
		}
		System.out.println(unit + "수리완료");
	}
	
	
}


public class _05인터페이스_실습2 {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine margine = new Marine();
		SCV scv = new SCV();
		DropShip dropShip = new DropShip();
		
		scv.repair(dropShip);
	}

}
