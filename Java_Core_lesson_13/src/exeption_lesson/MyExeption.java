package exeption_lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyExeption extends Exception {

	public void one() throws FileNotFoundException{
		//FileInputStream fis = new FileInputStream("text.txt");
throw new FileNotFoundException();
	}
	
	public void two () throws FileNotFoundException,MyExeption{
		one();
	}
	
	public void three() throws FileNotFoundException, MyExeption{
		two();
	}
	
	
	
	
	
}
