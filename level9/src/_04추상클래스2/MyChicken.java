package _04추상클래스2;

public class MyChicken extends MyBrand{

	public static String getSlogan() {
		return SLOGAN.formatted("연미 치킨");
	}
	private static int myNum=0;
	
	public MyChicken(String name) {
		super(++myNum, name);
	}

	@Override
	public void takeOrder() {
		System.out.printf("연미치킨 %s 치킨에서 주문했습니다%n" , super.info());
	}

}
