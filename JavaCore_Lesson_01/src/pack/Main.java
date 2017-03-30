package pack;

public class Main {
	public static void main(String[] args) {

		Car minivan = new Car();
		minivan.brend = "Doodge";
		minivan.color = "grey";
		minivan.fuelOfTank = 90;
		minivan.kmPerLitr = 10;
		minivan.type = "minivan";
			
		Car sportCar = new Car("McLaren", 400, "red", "sport", 12, 120);
		
		System.out.println(minivan.toString());
		System.out.println(sportCar.toString());
		
		minivan.range();
		sportCar.range();
		System.out.println(sportCar.range2());
		System.out.println(minivan.range3(10, "lambo", 75));
		
		 
		
		
	
	
	}
}
