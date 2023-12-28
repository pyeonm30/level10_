package 쓰레드예제;

public class ManagerRun implements Runnable {
   
    boolean stop = false;
    
	CoffeeMachine coffeeMachine;
    public ManagerRun(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        while (true) {
            coffeeMachine.fill();
            try { Thread.sleep(10);
            } catch (InterruptedException e) {
            	System.out.println(" 메니저는 퇴근합니다 ");
            	return;
            }
        }
    }
}