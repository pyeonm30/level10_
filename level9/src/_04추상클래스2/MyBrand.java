package _04추상클래스2;

public abstract class MyBrand {

	protected static final String SLOGAN ="우리 %s 매장은 가성비가 좋다";
	protected final int NO;
	protected final String NAME;
	
	public MyBrand(int no , String name) {
		NO = no;
		NAME=name;
	}
	public String info() {
		return "%d호 %s점".formatted(NO,NAME);
	}
	public abstract void takeOrder();
	
}
