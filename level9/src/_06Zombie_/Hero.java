package _06Zombie_;

// 보스인지 아닌지 구분해서 공격 

// 히어로는 체력 포션으로 100 체력 회복할 수 있고 체력 포션이 없으면 체력 회복이 안된다 
// 외부의 적은 보스인지 아닌지 구별해서 공격 해야한다 
// 보스이면 보호막을 가지고 있다 먼저 보호막을 다 뚫어야지만 직접 보스를 공격할 수 있다. 
// 일반 적은 보호막 가지고 있지 않음 

public class Hero extends Unit {
	private int power;
	private int count; // 체력포션

	public Hero(int pos, int hp, int max, int count) {
		super(pos, hp, max);
		this.count = count;

	}

	private boolean attackBoss(Unit unit) {
		Boss boss = (Boss) unit;
		power = getRandRange(getMax());
		if (boss.getShield() > 0) {
			boss.setShield(boss.getShield() - power);
		} else {
			boss.setHp(boss.getHp() - power);
		}
		System.out.printf("히어로가 %d의 공격력으로 보스 공격 현재 보스 (쉴드 %d / %d) %n", 
				power, boss.getShield(), boss.getHp());

		return boss.isDead();
	}

	@Override
	public boolean attack(Unit enemy) {
		
		if(enemy instanceof Boss) {
			return attackBoss(enemy);
		}
		
		power = getRandRange(getMax());
		enemy.setHp(enemy.getHp() - power);
		// Zombie zombi = (Zombie)enemy;
		// zombi.getRecovery(power);
		System.out.printf("히어로가 %d의 공격력으로 좀비 공격 현재 좀비 hp : %d %n", power, enemy.getHp());
		return enemy.isDead();
	}

	public void getRecovery() {
		if (count == 0) {
			System.out.println(" 포션 모두 사용했습니다");
			return;
		}

		setHp(getHp() + 100);
		System.out.println(" 체력 회복해서 %d 가 되었습니다".formatted(getHp()));
	}

}