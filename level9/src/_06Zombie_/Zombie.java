package _06Zombie_;


// 좀비는 히어로 공격 가능하고 한턴이 지날때마다 좀비가 자신이 때린거에 50%를 회복하는 능력을 가지고 있다 
// 히어로가 10을 때리면 +5 회복함 
public class Zombie extends Unit {
	private int power;
	
	public Zombie(int pos,int hp,int max) {
		super(pos,hp,max);
	}

	@Override
	public boolean attack(Unit hero) {
		if(!(hero instanceof Hero)) {
			System.out.println("좀비는 영웅만 때릴 수 있습니다");
			return false;
		}
		
		power = getRandRange(getMax());
		hero.setHp(hero.getHp()-power);
		getRecovery(power);
		System.out.println("좀비가 %d의 공격력으로 히어로 공객혔다 현재 히어로 hp: %d 좀비 체력회복 %d ".formatted(power,hero.getHp(),getHp()));
		return hero.isDead();
	}
	public void getRecovery(int power) {
		setHp(getHp()+ power/2);
	}
	

}