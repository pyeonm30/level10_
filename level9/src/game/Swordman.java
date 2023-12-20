package game;

public class Swordman extends Unit implements Attacker {
    public Swordman(Side side) {
        super(side, 80);
    }

    private void swordAttack(Unit target) {
        target.hp -= 10;
    }

    @Override
    public void defaultAttack(Unit target) {
    	System.out.printf("%s 가 %s 기본어택! %n" , this, target);
        swordAttack(target);
        System.out.println(target);
    }

		@Override
    public String toString() {
        return side.toString() + " 진영 검사("+this.hp+")";
    }
}