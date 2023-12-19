package _02접근제어자실습;

import _01상속_개념.AccessTest;


class Child extends AccessTest{
	int num = 100;
	Child(){
		super(); // 부모를 먼저 생성한다 
		super.a = 10;
		b = 100; //b는 자식 객체라서 내부에서는 접근 가능 
		
	}
	
	//@Override
	//void printAll() {}   => final 메서드는 자식클래스에서 재정의 불가능
}

public class _01접근제어자테스트{
	public static void main(String[] args) {
		Child c = new Child();
		
		c.a = 100;
		//c.b = 10; child 객체 자체는  Main 다른 패키지안에 있기때문에 접근 불가능 
		
		AccessTest e = new AccessTest();
		
	
	}
}
