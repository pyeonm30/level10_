package _06Zombie_;
import java.util.*;

// 유닛은 전부 이동가능하며 pos는 현재 위치를 나타낸다 
// 맵은 ~10까지 존재하며 한칸씩 이동 가능하다
// 유닛들은 전부 attack 메서드를 구현한다 

abstract public class Unit{
	private int pos; // 현재위치 
	private int hp; // 현재 hp
	private int max; // 랜덤 공격 1부터 max 까지의 범위 
	private boolean dead; // 죽었는지 살았는지 
	private Random rd; // 각각 하위 유닛들이 이 랜덤 클래스 사용해서 공격 범위 지정 
	
	public Unit(int pos, int hp, int max) {
		this.pos=pos;
		this.hp=hp;
		this.max=max;
		rd = new Random();
	}

	abstract boolean attack(Unit unit);

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
		if(this.hp < 0) {
			this.hp =0;
			dead = true;
			System.out.println("==== 사망 ===== ");
		}
	}

	public int getMax() {
		return max;
	}

	public boolean isDead() {
		return dead;
	}

	public int getRandRange(int num) {
		return rd.nextInt(num)+1;
	}
	
	
}