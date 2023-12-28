package 쓰레드예제;

import java.util.ArrayList;
import java.util.Arrays;

public class _Main {
	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		ArrayList<Thread> threads = new ArrayList<>();
		
		Arrays.stream("지수,제니,로제,리사".split(",")).forEach(s -> {
			threads.add(new Thread(new CustomerRun(s, coffeeMachine)));
		});

		for (Thread thread : threads) {
			thread.start();
		}

		Thread Coffeeshop = new Thread(new ManagerRun(coffeeMachine));
		
		Coffeeshop.start();

		try {
			Thread.sleep(10000);
			CoffeeMachine.turnOff();

		} catch (InterruptedException e) {
		}

	}
}
