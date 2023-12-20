package _09컬렉션프레임워크;

import java.util.*;
public class _07iterator {

	public static void main(String[] args) {

		
		Set<Integer> list = new HashSet<>(Arrays.asList(1,2,100,3,4,5,6,7,8,9));
		
		//list.remove(3);
		
		for(Integer num : list) {
//			if(num %3 ==0) {
//				list.remove(num);
//			}
			System.out.println(num);
		}
		
		// 인덱스가 존재해지만 사용가능... set 인덱스가 없다... 
//		for(int i =0; i < list.size(); i+=1) {
//			
//		}
		System.out.println("========");
		Iterator<Integer> itor = list.iterator();
		
		System.out.println(itor.next()); // itor.next() 값을 한개씩 꺼내옴 
		System.out.println(itor.next()); // itor.next() 값을 한개씩 꺼내옴 
		
		itor = list.iterator(); // 다시 처음부터 초기화
		
		while(itor.hasNext()) {
			if(itor.next() == 3) {
				itor.remove();
			}
		}
		System.out.println("========");
		for(Integer num : list) {
			System.out.println(num);
		}
		System.out.println("========");

		Map<Integer,String> list2 = new HashMap<Integer, String>();
		
		list2.put(1, "1");
		list2.put(2, "2");
		list2.put(3, "3");
		list2.put(4, "4");
		list2.put(5, "5");
		list2.put(6, "6");
		
		Iterator<Integer> itor2 = list2.keySet().iterator();
		Iterator<String> itor3 = list2.values().iterator();
		
		while(itor2.hasNext()) {
			if(itor2.next() == 2) {
				itor2.remove();
			}
		}
		System.out.println("========");
//		while(itor3.hasNext()) {
//			System.out.println(itor3.next());
//		}
		System.out.println("========");
		
		for(Integer key : list2.keySet()) {
			System.out.println( key +" " + list2.get(key));
		}
		
		
	}

}
