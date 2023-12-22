package _07enum;


enum ButtonMode{
	LIGHT, DARK
}
enum ButtonSpace{
	SINGLE,DOUBLE
}

class Button{

	//String buttonMode="LIGHT";
	//String buttonSpace="SINGLE";
	
	private ButtonMode buttonMode = ButtonMode.LIGHT;
	private ButtonSpace buttonSpace = ButtonSpace.SINGLE;
	
	public ButtonMode getButtonMode() {
		return buttonMode;
	}
	public void setButtonMode(ButtonMode buttonMode) {
		this.buttonMode = buttonMode;
	}
	public ButtonSpace getButtonSpace() {
		return buttonSpace;
	}
	public void setButtonSpace(ButtonSpace buttonSpace) {
		this.buttonSpace = buttonSpace;
	}
	
	
	
}





public class _01enum개념1 {

	public static void main(String[] args) {

		String day = "MON";
		day="1";
		Week day2 = Week.MON;
		System.out.println(day2);
		if(day2 == Week.MON) {
			System.out.println("오늘은 월요일이야");
		}
		
		int mode = 3;
		int space =1;
		
		Button button1 = new Button();
		
		//button1.setButtonMode(ButtonSpace.SINGLE);
		button1.setButtonMode(ButtonMode.DARK);
		//		button1.setButtonMode("DARK");
		//button1.buttonMode = "SINGLE";
		//button1.buttonSpace = "DARK";
		//button1.buttonSpace = "1";
	}

}
