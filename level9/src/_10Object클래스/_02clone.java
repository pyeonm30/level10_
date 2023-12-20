package _10Object클래스;

import java.util.ArrayList;
import java.util.Arrays;


class Bag{
	String contains;
	public Bag(String contains) {
		super();
		this.contains = contains;
	}
	@Override
	public String toString() {
		return "가방 속 ="+contains;
	}
}


class Person implements Cloneable{
	String name;
	int age = 10;
	Bag bag;
	public Person(String name , Bag bag) {
		super();
		this.name = name;
		this.bag = bag;
	}
	@Override
	public String toString() {
		return name +": " + age +" : " + bag;
	}
	
    public Person clone() {
        try {
        	Object obj = super.clone();
            return (Person)obj;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
	
}

public class _02clone {

	public static void main(String[] args) {

		Bag bag1 = new Bag("아이패드");
		Bag bag2 = new Bag("노트북");
		
		Person p1 = new Person("홍길동",bag1);
		// 얕은 복사 
		Person p2 = p1;
		
		p2.name = "김건달";
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("---------");
		// 깊은 복사 
		Person p3 = new Person(p1.name, bag2);
		System.out.println(p1);
		System.out.println(p3);
		System.out.println("---------");
		p3.name ="뽀통령";
		System.out.println(p1);
		System.out.println(p3);
		System.out.println("---------");
		Person p4 = p1.clone();
		System.out.println(p1);
		System.out.println(p4);
		System.out.println("---------");
		p1.bag = new Bag("맥북");
		p4.name="뽀로로";
		p4.age = 100;
		
		System.out.println(p1);
		System.out.println(p4);
		System.out.println("---------");
		
		
	}

}
