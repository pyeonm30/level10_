package _12함수형프로그래밍;

@FunctionalInterface
interface Type1{
	void call();
}

@FunctionalInterface
interface Type2{
	void call(int num , String str);
}
@FunctionalInterface
interface Type3{
	int call();
}

@FunctionalInterface
interface Type4{
	boolean call(int num);
}

public class _02함수형프로그래밍_개념2 {
	public static void main(String[] args) {
		
		Type1 t1 = ()-> System.out.println("type1 호출");
		
		t1.call();
		
		Type2 t2 = (int a , String b) -> System.out.println(" type2 호출 a = " + a +" b= " + b);
		
		t2.call(10,"test");
		
		Type3 t3 = () -> {
			System.out.println("type3 호출");
			return 100;
		};
		
		System.out.println(t3.call());
		
		Type4 t4 = (int x ) -> x <= 100;
		
		System.out.println(t4.call(100));
		
		System.out.println(t4.call(150));
		
		
	}
}
