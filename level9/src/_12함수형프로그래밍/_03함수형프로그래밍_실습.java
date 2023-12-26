package _12함수형프로그래밍;

import java.util.function.BinaryOperator;

class Calculate{
	static int add(int a, int b) {return a+b;}
	static int subtract(int a, int b) {return a-b;}
	static int multiply(int a, int b) {return a*b;}
}

@FunctionalInterface
interface Cal{
	int getResult(int a , int b);
}


public class _03함수형프로그래밍_실습 {

	public static void main(String[] args) {

		
		System.out.println(Calculate.add(10, 20));
		System.out.println(Calculate.subtract(10, 20));
		System.out.println(Calculate.multiply(10, 20));
		
		System.out.println("---------");
		Cal add = (int a , int b) -> {return a + b;};
		Cal substract = (a,b) ->{return a - b;};
		Cal multiply = (a,b) -> a*b;
		
		
		System.out.println(add.getResult(10, 20));
		System.out.println(substract.getResult(10, 20));
		System.out.println(multiply.getResult(10, 20));
		
		BinaryOperator<Integer> add2 = (a,b) -> a+b;
		
		System.out.println(add2.apply(10, 20));
		
		
		
	}

}
