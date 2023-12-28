package _15쓰레드;

public class _07쓰레드이론07 {

	static boolean stop = false;
	// 동기화로 만들다
	synchronized public static boolean isStop() {
		return stop;
	}
	synchronized public static void setStop(boolean stop1) {
		//_07쓰레드이론07.stop = stop;
		stop = stop1;
	}

	public static void main(String[] args) {

		new Thread(() -> {
			int i = 0;
			while (!isStop()) {
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

		setStop(true);
		
		
	}

}
