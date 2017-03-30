package forLesson;

import javax.swing.table.TableCellRenderer;

public class Main {

	public static void main(String[] args) {

		 
		// енум не можна створити за допомогою оператора NEW тільки таким чином
		// коли оголошується змінна TR конструктор Tansport автоматично викликається для кожної вказаної константи
		Transport tr = Transport.TRAIN;
		// вивід можна зробити таким чином
		System.out.println("Typical speed for an airoplane is " + tr.getSpeed() + " kilometrs per hour. \n");

		// достукуємось через оператор крапочку до типу енума, саму константу і
		// до методу
		System.out.println(
				"Typical speed for an airoplane is " + Transport.TRAIN.getSpeed() + " kilometrs per hour. \n");

		// зробити вивід через звичайний цикл for
		// потрібно створити масив в який занести всі константи
		Transport all[] = Transport.values();
		// перебрати їх в циклі
		for (int i = 0; i < Transport.values().length; i++) {
			// вивести елементи масиву зі значенням і-тої змінної
			System.out.print(all[i] + " ");
			System.out.print(all[i].getSpeed() + " ");
		}
		System.out.println();
		System.out.println("all transport speed: ");
		// через цикл for-each виводимо всі знаачення констант і їхню швидкість
		for (Transport t : Transport.values()) {
			System.out.println(t + " typical speed is " + t.getSpeed() + " kilometrs per hour.");
		}
		System.out.println();
		
		// коли використовуємо оператор SWITCH  в CASE вказуємо константу без повного імені Transport.AIROPLANE 
		// це можливо тому що оператор SWITCH не явно визначає що використовується костанта і не явно 
		// визначає її тип 
		// більше того коли ми будемо писати  Transport.AIROPLANE компілятор видасть нам помилку
		
		// використовуючи в блоці SWITCH змінну tr нам не потрібен defoult CASE
		switch (tr) {
		case AIROPLANE:
			System.out.println("Airoplane");
			System.out.println(Transport.AIROPLANE.getSpeed());
			break;
		case BOAT: 
			System.out.println("Boat");
			System.out.println(Transport.BOAT.getSpeed());
			break;
		case CAR: 
			System.out.println("Car");
			System.out.println(Transport.CAR.getSpeed());
			break;
		case TRAIN:
			System.out.println("Train");
			System.out.println(Transport.TRAIN.getSpeed());
			break;
		case TRUCK:
			System.out.println("Track");
			System.out.println(Transport.TRUCK.getSpeed());
			break;
		}

		System.out.println();
		// метод ordinal повертає значення константи по-порядку запису
		switch (tr.ordinal()) {
		case 1:
			System.out.println("Airoplane");
			System.out.println(Transport.AIROPLANE.getSpeed());
			break;
		case 2: 
			System.out.println("Boat");
			System.out.println(Transport.BOAT.getSpeed());
			break;
		case 3: 
			System.out.println("Car");
			System.out.println(Transport.CAR.getSpeed());
			break;
		case 4:
			System.out.println("Train");
			System.out.println(Transport.TRAIN.getSpeed());
			break;
		case 5:
			System.out.println("Track");
			System.out.println(Transport.TRUCK.getSpeed());
			break;
		}
		// метод compereTo для порівняння значення двох констант в одному перерахуванні
		Transport car = Transport.CAR;
		Transport airoplane = Transport.TRAIN;
		System.out.println(car.compareTo(airoplane));
	}

}
