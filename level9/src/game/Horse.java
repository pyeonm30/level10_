package game;

public class Horse<T extends Unit> {
    private int extraHp;
    private T rider;

    public Horse(int extraHp) {
        this.extraHp = extraHp;
    }

    public Horse() {
	}

	public void setRider(T rider) {
    	System.out.printf("%s가 말에 올라탔다 " , rider);
        this.rider = rider;
        rider.hp += extraHp;
        System.out.println(this);
    }

		@Override
    public String toString() {
        return "말 (추가체력: %d)".formatted(extraHp);
    }
}