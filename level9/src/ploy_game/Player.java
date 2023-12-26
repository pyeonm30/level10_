package ploy_game;

public class Player extends Unit {

	enum Status{
		FINE("양호"),WEAK("약함"),PASSOUT("기절");
		private String name;
		Status(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	private Status status = Status.FINE;
	Player(String na, int max, int pow) {
		super(na, max, pow);
	}
	
	

	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}



	void skill() {

	}

}