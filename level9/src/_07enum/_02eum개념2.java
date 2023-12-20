package _07enum;

class Button2{
	
	 // String final LIGHT = "LIGHT"
	enum Mode{LIGHT, DARK}
	enum Space{SINGLE, DOUBLE}
	
	private Mode mode = Mode.LIGHT;
	private Space space = Space.SINGLE;
	
	public void switchMode() {
		mode = mode == Mode.LIGHT? Mode.DARK : Mode.LIGHT;
	}
	
	public void setSpace(Space space) {
		this.space = space;
	}
	
	public Mode getMode() {
		return mode;
	}
	
	public Space getSpace() {
		return space;
	}
	
}

public class _02eum개념2 {

	public static void main(String[] args) {

		Button2 btn = new Button2();
		System.out.println(btn.getMode());
		btn.switchMode();
		System.out.println(btn.getMode());
		System.out.println(btn.getSpace());
		btn.setSpace(Button2.Space.DOUBLE);
		System.out.println(btn.getSpace());
		
	}

}
