package game;

public class MagicKnight extends Knight {
    public int mana = 60;
    public final int MANA_USAGE = 4;
    public MagicKnight(Side side) {
        super(side);
    }
    public MagicKnight() {
    	super(Side.BLUE);
    }
    public void lighteningAttack (Unit[] targets) {
        for (Unit target : targets) {
            if (target instanceof MagicKnight) continue;
            if (mana < MANA_USAGE) break;
			System.out.printf("⚡️번개공격 → 💀죽음 %s%n", target);
            target.hp -= target.hp;
            System.out.println(target);
            mana -= MANA_USAGE;
        }

    }

		@Override
    public String toString() {
        return side.toString() + " 진영 마법기사("+this.hp+")";
    }
}