package _05인터페이스;


// abstract class 객체 틀 , 구조 개념 

interface Dragable{
	void move(int x, int y);
}
interface Clickable{
	void click();
	void doubleClick();
}

abstract class Button implements Clickable, Dragable{
	String name;
	int size;
	abstract void actionButton();
}
class Title implements Clickable{

	@Override
	public void click() {
		System.out.println("타이틀을 클릭했습니다");
	}

	@Override
	public void doubleClick() {
		System.out.println("타이틀을 더블 클릭했습니다");
	}
	
}

class NaverButton extends Button{

	@Override
	public void click() {
		System.out.println("같은 창에서 네이버로 이동");
	}

	@Override
	public void doubleClick() {
		System.out.println("새창에서 네이버로 이동 ");
	}

	@Override
	public void move(int x, int y) {
		System.out.printf(" 좌표 %d %d 로 이동" , x ,y );
	}

	@Override
	void actionButton() {
		System.out.println("네이버 창으로 이동합니다");
	}
	
}
class GoogleButton extends Button{

	@Override
	public void click() {
		System.out.println("같은 창에서 구글 홈으로 이동");
	}

	@Override
	public void doubleClick() {
		System.out.println("새창에서 구글 홈으로 이동 ");
	}

	@Override
	public void move(int x, int y) {
		System.out.printf(" 좌표 %d %d 로 이동" , x ,y );
	}

	@Override
	void actionButton() {
		System.out.println("구글 창으로 이동합니다");
	}
	
}


public class _02인터페이스_실습 {
	public static void main(String[] args) {
		Button btn1 = new NaverButton();
		Button btn2 = new GoogleButton();
		
		btn1.click();
		btn1.actionButton();
		btn2.doubleClick();
		btn2.move(10, 20);
		
	}
}
