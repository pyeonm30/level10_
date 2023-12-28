package 쓰레드예제;

public class CustomerRun implements Runnable {
	String name;
	CoffeeMachine coffeeMachine;

	public CustomerRun(String name, CoffeeMachine coffeeMachine) {
		this.name = name;
		this.coffeeMachine = coffeeMachine;
	}

	@Override
	public void run() {
		while (true) {
			coffeeMachine.takeout(this);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(name + ":  앗 문닫았네 ");
				return;
			}
		}

	}
}