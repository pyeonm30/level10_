package Zombie;


// 좀비는 히어로 공격 가능하고 한턴이 지날때마다 방금 맞은 것에 50%를 회복하는 능력을 가지고 있다 
// 히어로가 10을 때리면 +5 회복함 
public class Zombie extends Unit {
	private int power;
	
	public Zombie(int pos,int hp,int max) {
		super(pos,hp,max);
	}


}