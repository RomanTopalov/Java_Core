package homework_employ;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee(23, 24);
		employee.serialize( new Employee(2, 24));
		employee.deserialize();
	}
}
