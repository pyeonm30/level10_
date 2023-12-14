package 상속_개념;

class A2{
	int a;
	A2(){
		System.out.println("호출1");
	}
}
class B2 extends A2{
	int b;
	B2(){
		System.out.println("호출2");
	}
}
class C2 extends B2{
	int c;
	C2(){
		
		System.out.println("호출3");
	}
}

public class _02상속2 {

	public static void main(String[] args) {

		// 클래스는 한개당 상속이 단 1번만 가능하다
		// 상속이 필요한 경우 줄줄이 상속을 해야한다 
		
		A2 a = new A2();
		B2 b = new B2();
		C2 c = new C2();
		
	}

}
