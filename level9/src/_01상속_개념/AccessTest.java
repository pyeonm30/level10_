package _01상속_개념;

public class AccessTest {
	public int a;
	protected int b; // 동일한 패키지 안이거나 있는 본인 객체와 자식클래스 내부에서만 접근가능   
	private int c; // 내 클래스 안에서만 접근가능 
	int d; // 같은 패키지 내부에서만 접근가능 
	
	final void printAll() {
		System.out.printf("%d %d %d %d %n", a , b, c ,d);
	}
}
