package _15쓰레드;

public class _06쓰레드이론06 {
// volatile : 변수값이 변경될때마다 메모리를 업데이트 
	// 멀티쓰레딩 환경에서 캐싱에대한 문제 방지 (동기화랑 다르다 )
	static volatile boolean stop = false;

	public static void main(String[] args) {

		new Thread(() -> {
			int i = 0;
			while (!stop) {
				i++;
//				System.out.println(i);
			}
			System.out.println("----쓰레드 종료 -----");
		}
		).start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 출력문이 없다고 해서 stop 이라는 값이 메모리에 적재 안되버림 
		// 그래서 stop를 true 로 반영을 못해서 계속 무한 루프가 돌아감 
		
		// 즉 jvm이 변수값이 바뀔때마다 메모리에 업데이트를 바로바로 하는 것이 
		// 아니라 캐싱메모리(CPU cache)에다가만 저장만 할 수 도 있다는 것을 알 수 있다 . 
		stop = true;
		
	}

}
