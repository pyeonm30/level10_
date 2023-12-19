package _05인터페이스;

import java.util.ArrayList;
import java.util.Random;

//damage() 메소드를 가진 
//Interface Damageable 를 정의하고
//최하위 유닛들 (모든) 에게 Damageable 상속 
//main에서 각각의 유닛들을 손상시킨 후 -> repair() 돌려보기


// 마크 인터페이스 : 안에 구현부는 없고 클래스를 구분하기 위해서 사용하는 인터페이스 
interface Repairable{}

interface Damageable{
	
	default void attackOpUnit(Damageable unit , int power) {
		Unit opUnit = (Unit)unit;
		opUnit.hp-=power;
		System.out.println("%s 가 %s -%d 데미지 공격".formatted(this,opUnit, power));
	}
}

// 모든 유닛의 최고 조상클래스
abstract class Unit implements Damageable{
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
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropShip = new DropShip();
		
		Random rd = new Random();
		
		tank.attackOpUnit(marine, rd.nextInt(10)+10);
		marine.attackOpUnit(tank, 10);
		tank.attackOpUnit(dropShip, 30);
		scv.attackOpUnit(dropShip, 10);
		
		scv.repair(dropShip);
		
		System.out.println("--------------");
		ArrayList<Unit> list1 = new ArrayList<Unit>();
		list1.add(tank);
		list1.add(marine);
		list1.add(scv);
		list1.add(dropShip);
		
		for(Unit u : list1) {
			System.out.println(u);
		}
		System.out.println("--------------");
		ArrayList<Damageable> list2 = new ArrayList<Damageable>();
		list2.add(tank);
		list2.add(marine);
		list2.add(scv);
		list2.add(dropShip);
		
		for(Damageable u : list2) {
			System.out.println(u);
		}
		
		
	}

}
