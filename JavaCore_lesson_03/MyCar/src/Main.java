 

public class Main {
	public static void main(String[] args) {
		// ��������� ���� ��*��� ����� Car 
		Car car = new Car("geely", "red", 45, 10, 20, 2);
		Car car1 = new Car("geely", "red", 45, 10, 20, 2);
		
		// ������ ������
//		car.changeBrend();
//		car.changeColor();
//		car.changeAge();
//		car.changeCarBody();
//		car.changeRul();
//		car.changeWheel();
	
// 		������ ������ ��� ������ ��*����
//		car1.changeBrend();
//		car1.changeColor();
//		car1.changeAge();
//		car1.changeCarBody();
//		car1.changeRul();
//		car1.changeWheel();


		Car minivan = new Car("Dodge", "grey", 12, 12, 12, 12);	

		// ��������� ������ ����� � ���� ����������� ������ ����������	
		Car arrayCar [] = {car,car1,minivan};
		// ���� ������
		System.out.println(arrayCar);
			}
}