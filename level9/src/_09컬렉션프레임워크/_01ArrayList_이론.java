package _09컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class User implements Comparable<User>{
	String name;
	int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	@Override
//	public int compareTo(User o) {
//		return name.compareTo(o.name);
//	}
	
	@Override
	public int compareTo(User o) {
		if(age > o.age) {
			return 1;
		}else if(age < o.age) {
			return -1;
		}else {
			// 기본은 나이순으로 정렬인데
			// 나이가 똑같다면 이름 오름차순 정렬
			return name.compareTo(o.name);
		}
	}
	@Override
	public String toString() {
		return name + ":" + age ;
	}
	
	
}

public class _01ArrayList_이론 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(list1);
		
		ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
		System.out.println(list2);
		
		list1.remove(1); // 1번째 방이 사라짐 
		list1.remove((Integer)1); // 값 1 이 사라진다 
		
		System.out.println(list1);
		System.out.println(list2);
		
		list1.add(0,100);
		System.out.println(list1);
		list1.set(1,20);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);

		ArrayList<User> list = new ArrayList();
		
		list.add(new User("홍길동",30));
		list.add(new User("김길순",20));
		list.add(new User("박연미",10));
		list.add(new User("차과장",100));
		list.add(new User("김미미",30));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
}
