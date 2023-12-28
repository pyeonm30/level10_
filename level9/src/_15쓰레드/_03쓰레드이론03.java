package _15쓰레드;

class TestThread implements Runnable{

	int no;
	public TestThread(int no) {
		this.no = no;
	}
	
	@Override
	public void run() {

		System.out.println("쓰레드 이름 : " + Thread.currentThread().getName());
		
		for(int i =0; i < 20;i+=1) {
			System.out.print(no);
			// 시간 지연을 위한 for문 
			for(int k =0; k < Integer.MAX_VALUE; k+=1) {}
		}
		
	}
	
}

public class _03쓰레드이론03 {

	public static void main(String[] args) {
		
		Thread test1 = new Thread(new TestThread(1));
		Thread test2 = new Thread(new TestThread(2));
		Thread test3 = new Thread(new TestThread(3));
		
		test1.setName("쓰레드1");
		test2.setName("쓰레드2");
		test3.setName("쓰레드3");
		test1.start();
		test2.start();
		test3.start();

	}

}
