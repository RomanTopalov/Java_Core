package pack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter some text");
		String text = scanner.next();
		
		if(text.equals(new StringBuilder(text).reverse().toString())){
			System.out.println("palindrom");
		}
		
		
		
//		String reverse = "";
//		
//		char [] cs = new char[text.length()];
//		
//		for (int i = cs.length - 1; i >= 0 ; i--) {
//			reverse += text.charAt(i);
//		}
//		
//		if(reverse.equals(text)){
//			System.out.println("palindrom");
//		}
		
		
		
		
		
		
		
	}
	
}
