package _06Zombie_;

import java.util.*;

public class _gameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// max = 최대 공격력 범위 : 공격범위는 1~max 까진
		// pos,hp,max,count
		Hero hero = new Hero(1, 200, 50, 2);
		Zombie zombi = new Zombie(5, 100, 10);

		// pos,hp,max,shield
		Boss boss = new Boss(9, 300, 20, 100);

		while (!hero.isDead()) {

			System.out.println("현재 위치 = " + hero.getPos());

			System.out.print("앞으로 이동하기(1),종료하기(2) ");

			int move = sc.nextInt();

			if (move == 1) {
				hero.setPos(hero.getPos() + 1);

				if (hero.getPos() == zombi.getPos()) {

					System.out.print("좀비를 만났습니다. 공격모드로 바뀝니다. ");

					while (true) {
						System.out.print("공격하기(1),포션마시기(2): ");
						int sel = sc.nextInt();
						if (sel == 1) {
							if (hero.attack(zombi))
								break;
							if (zombi.attack(hero))
								break;
						} else if (sel == 2) {
							hero.getRecovery();
						}

					}

					if (zombi.isDead()) {
						System.out.println("좀비를 이겼습니다. 이동할수 있습니다.");
					}

				}

				else if (hero.getPos() == boss.getPos()) {

					System.out.print("보스를 만났습니다. 공격모드로 바뀝니다. ");
					while (true) {

						System.out.print("공격하기(1),포션마시기(2): ");
						int sel = sc.nextInt();
						if (sel == 1) {
							if (hero.attack(boss))
								break;
							if (boss.attack(hero))
								break;
						} else if (sel == 2) {
							hero.getRecovery();
						}

					}
				}

				else if (hero.getPos() == 10) {
					System.out.println("게임에서 승리했습니다. 종료합니다.");
					break;
				}

			} else if (move == 2) {
				break;
			}

		}

		if (hero.isDead()) {
			System.out.println("[히로가 죽었습니다 게임에서 졌습니다]");
		}

	}

}