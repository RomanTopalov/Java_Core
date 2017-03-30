package pack;

public class Car {

	String brend;
	int maxSpeed;
	String color;
	String type;
	int kmPerLitr;
	int fuelOfTank;
	
	public Car(){
		
	}
	
	public Car(String br, int maxSpeed, String color, String type,
			int kmPerLitr, int fuelOfTank) {
		brend = br;
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.type = type;
		this.kmPerLitr = kmPerLitr;
		this.fuelOfTank = fuelOfTank;
	}

	public void startEngine(){
		System.out.println("car start engine");
	}
	
	public void drive(){
		System.out.println("car drive");
	}
	
	public void parking(){
		System.out.println("car parking");
	}
	
	public void stop(){
		System.out.println("car stop");
	}

	@Override
	public String toString() {
		return "Car [brend=" + brend + ", maxSpeed=" + maxSpeed + ", color="
				+ color + ", type=" + type + ", kmPerLitr=" + kmPerLitr
				+ ", fuelOfTank=" + fuelOfTank + "]";
	}
	
	public void range(){
		int ranage = fuelOfTank * kmPerLitr;
		System.out.println("you can range "+ranage+ " km");
		
	}
	
	public String range2(){
		int ranage = fuelOfTank * kmPerLitr;
		return "you can range "+ranage+ " km";
	}
	
	public String range3(int km, String brend, int fuel){
		int ranage = km * fuel;
		return brend+" can range "+ km*fuel+" km";		
		
	}
	
}
