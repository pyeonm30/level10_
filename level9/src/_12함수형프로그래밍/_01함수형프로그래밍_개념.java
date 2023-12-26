package _12함수형프로그래밍;

// 자바에서 함수형 프로그래밍 : 인터페이스에 abstract 메서드가 단 1개 존재한다 

@FunctionalInterface
interface Test{
	int getSum(int arr[]);
}

public class _01함수형프로그래밍_개념 {

	public static int getSum(int arr[]) {
		int sum =0;
		for(int i =0; i < arr.length;i+=1) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {

		// 명령형 프로그래밍 : how : 과정 
		// 10~ 60 까지 합산을 구해줘 
		int[] arr = {10,20,30,40,50,60};
		int sum =0;
		for(int i =0; i < arr.length;i+=1) {
			sum += arr[i];
		}
		System.out.println(sum);
		// 선언형 프로그래밍 : 함수형 : 결과에만 집중 
		System.out.println(getSum(arr));
		
		
		// 내부클래스 = inner class => 익명클래스 : 이름이 없는 클래스 : 일회성 클래스 
		
		Test result = new Test() {
			@Override
			public int getSum(int[] arr) {
				int sum =0;
				for(int i =0; i < arr.length;i+=1) {
					sum += arr[i];
				}
				return sum;
			}
			
		};
		
		System.out.println(result.getSum(arr));

		// 결과에 집중하는 선언형 프로그래밍의 목적 
		// 람다식 => 자바스크립스트 화살표함수 
		// 함수형 프로그램을 편하게 사용하는 방식 
		Test result2 = (int[] array)->{
			int hap =0;
			for(int i =0; i < arr.length;i+=1) {
				hap += arr[i];
			}
			return hap;
		};
		
		System.out.println(result2.getSum(arr));
		
		Test result3 = array -> result2.getSum(array);
		
		System.out.println(result3.getSum(arr));
		
		
	}

}
