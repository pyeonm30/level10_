package ploy_game;

public class StageTitle implements Stage {

	@Override
	public boolean update() {
		System.out.println("==== TEXT RPG ====");
		System.out.println("[시작] 을 입력하세요");
		String start = GameManager.scan.next();
		if (start.equals("시작"))
			;
		GameManager.nextStage = "LOBBY";
		return false;
	}

	@Override
	public void init() {

	}

}