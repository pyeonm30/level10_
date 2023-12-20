package _09컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;

public class _01ArrayList_이론 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(list1);
		
		ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
		System.out.println(list2);
		
	}
}
