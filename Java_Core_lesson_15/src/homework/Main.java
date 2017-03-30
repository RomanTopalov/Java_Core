package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Police police = new Police("wety", 456);

		police.maxCalibr();
		police.maxAge();
		
		
		
//		
//		List<Weapon> list= (List<Weapon>) ois.readObject();
//		for (Weapon weapon : list) {
//			
//			System.out.println(weapon);
//		}
//		
	}
}
