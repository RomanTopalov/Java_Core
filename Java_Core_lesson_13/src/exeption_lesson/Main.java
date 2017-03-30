package exeption_lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws MyExeption {
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter some number");

		int number = 0;

		try {

			number = scanner.nextInt();
			int[] array = { 243, 234, 2, 4, 32, 34, 3, 4, 1, 34, 2, 31, 4, 1 };
			System.out.println(array[number]);

		} catch (InputMismatchException e) {
			System.out.println("exeption");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
			scanner.close();
		}
		
		try(Scanner scanner2 = new Scanner(System.in)){
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("number *2= " + number * 2);*/
		
		/*try {
			FileInputStream fileInputStream = new FileInputStream("text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sdfsd");*/
		
		MyExeption myExeption = new MyExeption();
		try {
			myExeption.three();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
}
