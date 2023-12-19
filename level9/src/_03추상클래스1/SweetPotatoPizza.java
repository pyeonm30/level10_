package _03추상클래스1;

public class SweetPotatoPizza extends Pizza{
	
	SweetPotatoPizza(int price , String brand){
		this.price = price;
		this.brand = brand;
		this.name ="고구마 피자";
	}
	
	
	@Override
	void putTopping() {

		System.out.println("고구마 무스 추가");
		
	}
}
