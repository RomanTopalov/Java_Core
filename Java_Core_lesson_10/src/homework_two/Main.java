package homework_two;

import java.awt.Menu;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	boolean exist = true;
	Commodity commodity=new Commodity();
	

	
	menu();
	while (exist) {
		
	int choise=scan.nextInt();
		
	switch (choise) {
	case 1:commodity.addCommodity();break;
	case 2:commodity.removeCommodity();break;
	case 3:commodity.changeCommodity();break;
	case 4:commodity.sortBrand();break;
	case 5:commodity.sortLength();break;
	case 6:commodity.sortWeight();;break;
	case 7:commodity.sortWidth();break;
	case 8:commodity.outputIndexElement();;break;
	case 9:System.out.println("Ви вийшли з системи");commodity.outFromSystem();break;

	default:
		break;
}
	
}
	
}
			public static void menu(){
			System.out.println("Нажміть 1 щоб додати товар ; "+" Нажміть 2 щоб видалити товар ");
			System.out.println("Нажміть 3 щоб поміняти товар ; "+" Нажміть 4 - відсортувати за брендом ");
			System.out.println("Нажміть 5 - відсортувати за довжиною ;"+	" Нажміть 6 - відсортувати за вагою ");
			System.out.println("Нажміть 7 - відсортувати за шириною  ;"+" Нажміть 8-індекс елементу  ");	
			System.out.println("Нажміть 9 щоб вийти з системи.");
			
			
			
			}
}
