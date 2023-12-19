package _04추상클래스2;

public class MyCafe extends MyBrand{

	private static int myNum=0;
	private boolean isTakeout;
	public static String getSlogan() {
		return SLOGAN.formatted("연미 커피");
	}
	public MyCafe(String name , boolean isTakeOut) {
		super(++myNum, name);
		this.isTakeout = isTakeOut;
	}

	@Override
	public void takeOrder() {
		System.out.printf("연미 카페 %s 음료를 주문 했습니다 %n", super.info());
		if(!isTakeout) System.out.println("매장에서 드시겠습니까?");
	}

}
