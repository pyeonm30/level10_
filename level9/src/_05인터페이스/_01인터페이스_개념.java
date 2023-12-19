package _05인터페이스;

// 추상클래스 vs 인터페이스

// 인터페이스는 다중 상속 목적이다. 
// 인터페이스는 추상클래스보다 더 추상적이다.
// 인터페이스 자체는 객체를 생성하는 목적이 아니다 => 클래스를 꾸며주는 녀석 

abstract class A{
	//public static final int num = 20;
	//public abstract void test3();
	int a = 1;
	void test1() {
		System.out.println("test1 호출했다 ");
	}
	abstract void test2();
}

//abstract class C{
//	abstract void test4();
//}

class B extends A{  // 클래스는 여러개 상속이 불가능하다 단 한개만 상속이 가능하다 
	int num = 10;
	@Override
	void test2() {
		System.out.println("test2 호출했다 ");
	}
}

interface E1{
	int num =20; // public static final int num
	void test3(); // public abstract void test3()

}

interface E2{
	void test4(); 
}

interface E3 extends E2{
	void test5();
	default void test7() {
		
	}
	static void test6() {
		
	}
}

class C extends B implements E1, E2{
	@Override
	public void test4() {
		System.out.println("test4 호출했다");
	}
	@Override
	public void test3() {
		System.out.println("test3 호출했다");
	}
	@Override
	void test2() {
		System.out.println("test2 호출했다");
	}
}

class D implements E3{
	@Override
	public void test4() {
		
	}
	@Override
	public void test5() {
		
	}
}

public class _01인터페이스_개념 {

	public static void main(String[] args) {

		B b1 = new B();
		A b2 = new B();
		
		C c1 = new C();
		B c2 = new C();
		A c3 = new C();
		E1 c4 = new C();
		//c4.num = 100;
	
		E2 c5 = new C();
		
	
		
	}

}
