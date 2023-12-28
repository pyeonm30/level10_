package _15쓰레드;

import java.util.Random;

class CustomerRun implements Runnable {
    String name;
    ATM atmToUse;
    int needed;

    public CustomerRun(String name, ATM atmToUse, int needed) {
        this.name = name;
        this.atmToUse = atmToUse;
        this.needed = needed;
    }
    @Override
    public void run() {
        while (atmToUse.getBalance() > needed) {
            atmToUse.withdraw(name, needed);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ATM {
	private int balance = 0;

	public void addMoney(int amount) {
		balance += amount;
	}

	public int getBalance() {
		return balance;
	}
	public void withdraw(String name, int amount) {
		if (balance < amount)
			return;

		System.out.printf("💰%s 인출 요청 (현 잔액 %d)%n", name, balance);
		try {
			Thread.sleep(new Random().nextInt(700, 1000));
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		balance -= amount;
		System.out.printf("✅ %s 인출 완료 (현 잔액 %d)%n", name, balance);
	
	}
	
}


public class _05쓰레드이론05 {

	public static void main(String[] args) {


		ATM atm = new ATM();
        atm.addMoney(5000);

        Thread thr1 = new Thread(
                new CustomerRun("철수", atm, 500)
        );
        Thread thr2 = new Thread(
                new CustomerRun("영희", atm, 300)
        );
        Thread thr3 = new Thread(
                new CustomerRun("현준", atm, 400)
        );

        thr1.start();
        thr2.start();
        thr3.start();
		
	}

}
