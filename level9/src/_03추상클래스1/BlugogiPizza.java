package _03추상클래스1;

public class BlugogiPizza extends Pizza{
	BlugogiPizza(int price , String brand){
		this.price = price;
		this.brand = brand;
		this.name ="불고기 피자";
	}
	
	
	@Override
	void putTopping() {

		System.out.println("불고기 슬라이스 추가");
		
	}

}
