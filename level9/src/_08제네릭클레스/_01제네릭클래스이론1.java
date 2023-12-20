package _08제네릭클레스;

class Box<T>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Tv{
	String brand;
	int serialNo;
	public Tv(String brand, int serialNo) {
		super();
		this.brand = brand;
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", serialNo=" + serialNo + "]";
	}
	
}

class Product<T,M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}

	
}


public class _01제네릭클래스이론1 {

	public static void main(String[] args) {

		Box<Integer> test = new Box();
		test.setT(10);
		System.out.println(test.getT());
		
		Box<Tv> test2 = new Box();
		
		test2.setT(new Tv("삼성",1111));
		System.out.println(test2.getT());
		
		Product<Tv,String> product = new Product();
		
		product.setKind(new Tv("LG",1234));
		product.setModel("LG 스텐바이미 ");
		
		System.out.println(product);
		
		Product<Integer,String> test3 = new Product();
		test3.setKind(10);
		test3.setModel("10");
		
		System.out.println(test3);
		
		
	}

}
