package 상속_개념;

//abstract // 추상화 : abstract  <-> 구체화

//클래스를 설계 : 상태(== data ) , 행동(기능 == method )

// 추상클래스는 구체적이지 않기때문에 행동이 빠져있다.
// 추상 메서드의 구현체{}가 빠져있다.  

// 단하나라도 추상메서드를 가지고 있으면 추상클래스가 된다. 
abstract class A3{
	
	int num =10;
	// 불완전한 메서드
	abstract void test1(); // 구현부가 빠져있어서 앞에 abstract 키워드 붙여줘야함 
	
	// 완전한 메서드 
	void test2() {
		System.out.println("test2 호출! " + num);
	}
}

class B3 extends A3{
	@Override
	void test1() {
		System.out.println("test1 호출!!! ");
	}
	
}

public class _06추상클래스1 {
	public static void main(String[] args) {
		  // 미완성된 설계도는 객체를 생성할 수없다! 
		// 추상클래스는 객체를 만들 수 없다! 
		//A3 a = new A3();
		
		B3 b = new B3();
		b.test1();
		b.test2();
		
	}
}
