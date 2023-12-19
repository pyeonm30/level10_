package _01상속_개념;

import java.util.Random;


abstract class Shape{
	String name;
	String color;
	double size;
	abstract void draw();
	public Shape(String name, String color, double size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	@Override
	public String toString() {
		return "%s %s (%.2f)".formatted(color,name,size);
	}
	
	
	
}
class Line extends Shape{
	public Line(String name, String color, double size) {
		super(name, color, size);
	}

	@Override
	void draw() {
		System.out.println("선을 긋는다");
	}

}

class Circle extends Shape{
	public Circle(String name, String color, double size ,int radius) {
		super(name, color, radius*radius*Math.PI);
		this.radius = radius;
	}
	int radius;
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}

}

class Point extends Shape{
	public Point(String name, String color, double size) {
		super(name, color, size);
	}

	@Override
	void draw() {
		System.out.println("점을 찍는다");
	}
}

class Rect extends Shape{
	int heigth;
	int width;
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
	public Rect(String name, String color, double size , int heigth, int width) {
		super(name, color, heigth*width);
		this.heigth = heigth;
		this.width = width;
	}
	
	
}

class TriAngle extends Shape{
	int heigth;
	int width;
	
	public TriAngle(String name, String color, double size, int heigth, int width) {
		super(name, color,  heigth*width*0.5);
		this.heigth = heigth;
		this.width = width;
	}
	

	
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}



}


public class _08다형성 {

	public static void main(String[] args) {

		// 모양도 랜덤하게 ,색깔 사이즈 , 해서 도형 10개를 출력하시요 
		// 점 선 : 기존 size출력
		// 원, 네모,세모 : size = 넓이 넣어서 출력 
		Rect[] menolist = new Rect[2]; // Rect 클래스만 올수있다.  

		// 모양도 랜덤하게 ,색깔 사이즈 , 해서 도형 10개를 출력하시요 
		// 점 선 : 기존 size출력
		// 원, 네모,세모 : size = 넓이 넣어서 출력 
		
		Random rd = new Random();
		
		
		String[] colors = {"파란색" , "빨간색" , "보라색" , "노란색" ,"분홍색"};
		
		Shape[] list = new Shape[10];
		
		for(int i =0; i < list.length;i+=1) {
			int rnum = rd.nextInt(5);
			String color = colors[rd.nextInt(colors.length)];
			if(rnum == 0) {
				list[i] = new Line("직선",color , rd.nextInt(10)+1);
			}else if(rnum == 1) {
				list[i] = new Point("점",color , rd.nextInt(10)+1);
			}else if(rnum == 2) {
				list[i] = new Circle("원",color , 0, rd.nextInt(10)+1);
	
			}else if(rnum == 3) {
				list[i] = new Rect("네모",color , 0,rd.nextInt(10)+1, rd.nextInt(10)+1);
		
			}else if(rnum == 4) {
				list[i] = new TriAngle("세모",color , 0,rd.nextInt(10)+1, rd.nextInt(10)+1);
			
			}
			
		}
		
		for(Shape s : list) {
			s.draw();
			System.out.println(s);
		}
		
	
		
	}

}
