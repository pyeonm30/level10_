package _12함수형프로그래밍;

import java.util.ArrayList;
import java.util.List;

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
		
		// 문제 2번 중복된 데이터 제거 후 출력 
		
		// 문제 3번 카테고리가 과자인 itemList 출력
		
		// 문제 4번 카테고리가 고기인 item 갯수 출력 
		
		// 문제 5번 가격이 10000원 이상인 값들의 	ArrayList<Item> 만들기
		
		// 문제 6번 카테고리가 고기인 아이템 이름들만 가져와서 	ArrayList<String>으로 만들기
		
		// 문제 7번 아이템 번호로 정렬 후 출력

		// 문제 8번 아이템 가격 순으로 정렬 
		
	}

}
