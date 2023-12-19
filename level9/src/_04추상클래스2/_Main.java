package _04추상클래스2;

public class _Main {

	public static void main(String[] args) {
                          // 추상 클래스는 객체 생성 불가능 
		//MyBrand yeonmi = new MyBrand(1,"강남");
		
		MyChicken store1 = new MyChicken("강남");
		MyChicken store2 = new MyChicken("홍대");
		MyChicken store3 = new MyChicken("압구정");
		
		MyCafe store4 = new MyCafe("제주도" , true);
		MyCafe store5 = new MyCafe("신촌" , true);
		MyCafe store6 = new MyCafe("강남" , false);
		
		MyBrand[] myStores= {store1 , store2,store3,store4 , store5,store6 };
		
		for(MyBrand mystore : myStores) {
			mystore.takeOrder();
		}
		
	}

}
