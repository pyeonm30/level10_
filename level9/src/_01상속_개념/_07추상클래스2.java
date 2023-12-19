package _01상속_개념;


public class _07추상클래스2 {

	public static void main(String[] args) {

		// upcasting 자식객체가 부모클래스타입 가지는것
		
		Parent p = new Parent();
		//Child p2 = new Parent();
		
		Child c1 = new Child();
		
		// 이미 자식은 부모를 생성하기때문에
		// 부모클래스 타입으로 만들 수 있다. 
		Parent c2 = new Child();
		//System.out.println(c2.b);
		Parent c3 = (Parent)c1; // 강제로 업케스팅 
		
		// 부모는 자식을 생성하지 않기때문에 자식타입으로 선언 불가능
		//Child p1 = new Parent();
		
		// downcasting : 부모타입 => 자식타입으로 변경 
		
		Child c4 = (Child)c2;
		System.out.println(c4.b);
		//c2 = (Child)c2;
		//System.out.println(c2.b);
		
	
	}

}
