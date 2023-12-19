package _04추상클래스2;

public class MyBakery extends MyBrand{

	public static String getSlogan() {
		return SLOGAN.formatted("연미 빵집");
	}
	private static int myNum =0;
	private boolean isHandmade;
	public MyBakery(String name , boolean isHandmade) {
		super(++myNum, name);
		this.isHandmade = isHandmade;
	}

	@Override
	public void takeOrder() {
		System.out.printf("연미 빵집 %s 빵을 주문 했습니다 %n" , isHandmade? info() + "수제" : info());
	}

}
