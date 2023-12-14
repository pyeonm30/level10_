package 상속_개념;

class Product{
	String name;
	int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}

class Fruit extends Product{
//	Fruit(){
//	super(); Product();
//}
	String origin;
	public Fruit(String name, int price, String origin) {
		super(name, price);
		this.origin = origin;
	}

}

public class _04suepr생성자 {

	public static void main(String[] args) {

		Product meat = new Product("고기",10000);
		Fruit banana = new Fruit("바나나", 2000, "필리핀");
		
		
		
	}

}
