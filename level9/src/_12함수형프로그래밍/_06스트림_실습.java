package _12함수형프로그래밍;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class _06스트림_실습 {

	public static List<Item> setData(){
		List<Item> itemList = new ArrayList();
		
		itemList.add(new Item(1001,"과자","새우깡",1500));
		itemList.add(new Item(1002,"음료수","사이다",1000));
		itemList.add(new Item(1003,"과자","고래밥",3000));
		itemList.add(new Item(1004,"음료수","콜라",500));
		itemList.add(new Item(1005,"고기","닭고기",15000));
		itemList.add(new Item(1006,"고기","돼지고기",20000));
		itemList.add(new Item(1005,"고기","닭고기",15000));
		itemList.add(new Item(1002,"음료수","사이다",1000));
		itemList.add(new Item(1002,"음료수","사이다",1000));
		itemList.add(new Item(1008,"과자","홈런볼",3500));
		
		return itemList;
		
	}
	
	public static void main(String[] args) {
		List<Item> itemList = setData();
		
	      // 문제 1번 전체 출력
		System.out.println("====== 문제 1 ==========");
		
		itemList.stream()
				.forEach(System.out::println);
		
		// 문제 2번 중복된 데이터 제거 후 출력 
		System.out.println("====== 문제 2 ==========");
		itemList.stream()
				.distinct()
				.forEach(System.out::println);
		
		
		// 문제 3번 카테고리가 과자인 itemList 출력
		System.out.println("====== 문제 3 ==========");
		itemList.stream()
				.filter(item -> item.getCategory().equals("과자"))
				.forEach(System.out::println);
		
		// 문제 4번 카테고리가 고기인 item 갯수 출력 
		System.out.println("====== 문제 4 ==========");
		long cnt = itemList.stream()
		.filter(item -> item.getCategory().equals("고기"))
		.count();
		System.out.println(cnt +"개");
		// 문제 5번 가격이 10000원 이상인 값들의 	ArrayList<Item> 만들기
		System.out.println("====== 문제 5 ==========");
		
		ArrayList<Item> tempList = (ArrayList<Item>) itemList.stream()
				.filter(item -> item.getPrice() >= 10000)
				.collect(Collectors.toList());
		tempList.stream().forEach(System.out::println);
		
		// 문제 6번 카테고리가 고기인 아이템 이름들만 가져와서 	
		// ArrayList<String>으로 만들기
		System.out.println("====== 문제 6 ==========");
		ArrayList<String> temp2List = (ArrayList<String>) itemList.stream()
									  .filter(item -> item.getCategory().equals("고기"))
									  .map(Item::getName)
									  .collect(Collectors.toList());
		temp2List.forEach(System.out::println);
		
		
		// 문제 7번 아이템 번호로 정렬 후 출력
		System.out.println("====== 문제 7 ==========");
		itemList.stream()
				.distinct()
				.sorted()
				.forEach(System.out::println);
		
		// 문제 8번 아이템 가격 순으로 정렬 
		System.out.println("====== 문제 8 ==========");
		itemList.stream()
				.sorted((item1,item2) -> {
					if(item1.getPrice() > item2.getPrice()) {
						return -1;
					}else if(item1.getPrice() < item2.getPrice()) {
						return 1;
					}
					return 0;
				})
				.forEach(System.out::println);
				
		
		// 통계하는 클래스 
		IntSummaryStatistics status = itemList.stream()
									  .distinct()
									  .map(Item::getPrice)
									  .collect(Collectors.summarizingInt(Integer::intValue));
		
		System.out.println(status);
		System.out.println(status.getCount());
		System.out.println(Math.round(status.getAverage()));
		System.out.println(status.getMax());
		System.out.println(status.getMin());
		System.out.println(status.getSum());
		
	}

}
