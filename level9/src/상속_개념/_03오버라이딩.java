package 상속_개념;

class Parent{
	int num = 100;
	int a = 10;
	void test1() {
		System.out.println("부모 test1 호출");
	}

}

class Child extends Parent{
	int num = 10;
	int b = 20;
	void test2() {
		System.out.println("test2 호출");
	}
	
	@Override
	void test1() { // 부모클래스에 있는 같은 이름의 메서드를 자식 클래스를 제정의 
		System.out.println("자식 test1 호출");
		super.test1(); // super 키워드로 부모 클래스 값 접근 가능 
	}
	
	void printNum() {
		System.out.println(num);
		System.out.println(super.num);
	}
}


public class _03오버라이딩 {

	public static void main(String[] args) {

		Child c = new Child();
		c.test1();
		c.test2();
		
		c.printNum();
		
	}

}
