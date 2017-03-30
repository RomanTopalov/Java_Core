package pack;

public enum Transport {

	CAR(200), TRAIN(80), PLANE(800), TRUCK(60), BUS(70), HORSE(40), BIKE(35);
	
	private int maxSpeed;

	private Transport(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
//	private Transport(){
//		
//	}
	
	
	
	
	
}
