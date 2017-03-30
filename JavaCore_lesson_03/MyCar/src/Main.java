 

public class Main {
	public static void main(String[] args) {
		// створення двох об*єтів класу Car 
		Car car = new Car("geely", "red", 45, 10, 20, 2);
		Car car1 = new Car("geely", "red", 45, 10, 20, 2);
		
		// виклик методів
//		car.changeBrend();
//		car.changeColor();
//		car.changeAge();
//		car.changeCarBody();
//		car.changeRul();
//		car.changeWheel();
	
// 		виклик методів для іншого об*єкту
//		car1.changeBrend();
//		car1.changeColor();
//		car1.changeAge();
//		car1.changeCarBody();
//		car1.changeRul();
//		car1.changeWheel();


		Car minivan = new Car("Dodge", "grey", 12, 12, 12, 12);	

		// створення масиву машин і його ініціалізація трьома елементами	
		Car arrayCar [] = {car,car1,minivan};
		// вивід масиву
		System.out.println(arrayCar);
			}
}