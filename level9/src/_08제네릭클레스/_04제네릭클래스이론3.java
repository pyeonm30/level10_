package _08제네릭클레스;

import java.lang.reflect.InvocationTargetException;


enum Monster{
	BAT("박쥐",30),WOLF("울프",50);
	private String name;
	private int power;
	
	private Monster(String name, int power) {
		this.name = name;
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
}

class MyUnit{
	String name;
	int power;
	
	
	public MyUnit(){
		System.out.println(" 유닛의 탄생 ");
	}
	@Override
	public String toString() {
		return name +":" + power;
	}
	
}

class Wolf extends MyUnit{
	public Wolf() {
		name="울프";
		power=130;
		System.out.println("울프 탄생");
	}
	
	public Wolf(Monster mon) {
		this.name = mon.getName();
		this.power = mon.getPower();
		System.out.println("울프 탄생");
	}

}
class Bat extends MyUnit{
	public Bat() {
		name="박쥐";
		power=100;
		System.out.println("박쥐 탄생");
	}
}


public class _04제네릭클래스이론3 {

	public static void main(String[] args) {

		String path = _04제네릭클래스이론3.class.getPackageName()+".";
		System.out.println(path);
		
		// _08제네릭클레스.Bat  , _08제네릭클레스.Wolf
		String[] classList = {"Bat" , "Wolf"};
		
		path+=classList[1];
		
		try {
			Class<?> clazz = Class.forName(path); // 클래스를 찾으면 클래스의 객체를 Object로 반환
			
			   // 기본생성자 호출
			//Object obj = clazz.getDeclaredConstructor().newInstance(); // new Bat();
			
			// 오버로딩된 생성자로 객체 생성 
			Object obj = clazz.getDeclaredConstructor(Monster.class).newInstance(Monster.BAT);
			if(obj instanceof MyUnit) {
				MyUnit unit = (MyUnit) obj;
				System.out.println(unit.name +" " + unit.power);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지않습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
