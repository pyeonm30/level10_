package Zombie;


// 좀비는 히어로 공격 가능하고 한턴이 지날때마다 현재 체력의 50%를 회복하는 능력을 가지고 있다 
public class Zombie extends Unit {
	int power;
	
	public Zombie(int pos,int hp,int max) {
		super(pos,hp,max);
	}


}