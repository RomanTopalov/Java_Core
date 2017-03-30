package homework_employ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Methods implements Serializable {

	public void serialize(Employee employee) throws IOException {
		FileOutputStream fos = new FileOutputStream("employ.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee);
oos.close();

	}



public void deserialize() throws IOException, ClassNotFoundException {
	Employee employee = null;

		FileInputStream fis = new FileInputStream("employ.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		employee = (Employee) ois.readObject();
		System.out.println(employee);
		ois.close();
		fis.close();
	
	}
}

/*public class Methods {

	public void serialize(Employee employee) throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("employeis.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// SERIALIZE

	public void deserialize() {
		Employee employee = null;
		try {
			FileInputStream fis = new FileInputStream("employeis.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			employee = (Employee) ois.readObject();
			System.out.println(employee);
			ois.close();
			fis.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
	}// DESERIALIZE

}*/
