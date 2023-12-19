package _03추상클래스1;

public class PineApplePizza extends Pizza{
	
	PineApplePizza(int price , String brand){
		this.price = price;
		this.brand = brand;
		this.name ="파인애플 피자";
	}
	
	
	@Override
	void putTopping() {

		System.out.println("파인애플 추가");
		
	}
}
