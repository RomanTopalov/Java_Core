package lesson;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

	/*	Country ukr = new Country("Ukr", 45, 603.7);
		Country usa = new Country("uas", 130, 1110.3);
		Country mexico = new Country("mexico", 3043, 3403);

		List<Country> countries = new ArrayList<>();
		countries.add(ukr);
		countries.add(usa);
		countries.add(mexico);

		FileOutputStream fos = new FileOutputStream("countries.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(countries);

		
		 * oos.writeObject(usa); oos.writeObject(mexico);
		 

		oos.close();

		FileInputStream fis = new FileInputStream("countries.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);// зчитувати в обэкт
		
		//System.out.println(ois.readObject());
		
		List<Country> list= (List<Country>) ois.readObject();
		for (Country country : list) {
			System.out.println(country);
		}
		
		
		*/
		
//		try {
//			while (true) {
//				System.out.println(ois.readObject());
//			}
//		} catch (EOFException e) {
//			// TODO: handle exception
		//}
		
		FileOutputStream fos = new FileOutputStream("countries.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Country("brazil",42,3428.3));
		oos.close();
		
		FileInputStream fis = new FileInputStream("countries.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);// зчитувати в обэкт
		
		Country country=(Country) ois.readObject();
		System.out.println(country);
		
		
		
		
		
		

	}
	
	
	

	
	
	
	
	
	
	
}
