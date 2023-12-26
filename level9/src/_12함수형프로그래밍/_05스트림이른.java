package _12함수형프로그래밍;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05스트림이른 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("박연미","유재석","하하","정형돈","노홍철","박연미","하하");
		
		System.out.println("=========1=======");
		for(int i =0; i < names.size();i+=1) {
			System.out.println(names.get(i));
		}
		
		System.out.println("========2========");
		for(String name: names) {
			System.out.println(name);
		}
		
		System.out.println("========3========");
		names.forEach(System.out::println);
		
		System.out.println("========4========");
		Stream<String> nameStream = names.stream(); // 리스트  names 에 스트림 객체 생성
		
		//nameStream.forEach(name -> System.out.println(name));
		nameStream.forEach(System.out::println); // 이미 최종연산이 끝나면 스트림객체.close()
		
		// 최종 연산은 마지막에 한번만 사용할 수 있다
		//nameStream.count(); //stream has already been operated upon or closed
		System.out.println("========5========");
		// 메소드 체이닝 
		names.stream()
			 .distinct()
			 .forEach(System.out::println);
		
		System.out.println("========6========");
		List<String> name2 = names.stream()
							.distinct()
							//.filter((name) -> name.equals("박연미"))
							.collect(Collectors.toList());
		
		System.out.println(name2);
		
		List<Integer> list = new ArrayList <>(
				Arrays.asList(5,2,0,8,4,1,7,9,3,6));
		
		System.out.println(list);
		List<Integer> odds = new ArrayList<>();
		
		for(int i = 0; i < list.size();i+=1) {
			if(list.get(i)%2!=0) {
				odds.add(list.get(i));
			}
		}
		Collections.sort(odds);
		System.out.println(odds);
		String test ="";
		for(Integer i : odds) {
			test += i+", ";
		}
		test = test.substring(0,test.length()-2);
		System.out.println(test);
		
		
		String result = list.stream()
						.filter(i -> i %2!=0)
						.sorted(Integer::compare)
						.map(i-> i+"")
						.collect(Collectors.joining(", "));
		
		System.out.println(list);
		System.out.println(result);
		
		
	}

}
