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
	case 9:System.out.println("�� ������ � �������");commodity.outFromSystem();break;

	default:
		break;
}
	
}
	
}
			public static void menu(){
			System.out.println("������ 1 ��� ������ ����� ; "+" ������ 2 ��� �������� ����� ");
			System.out.println("������ 3 ��� ������� ����� ; "+" ������ 4 - ����������� �� ������� ");
			System.out.println("������ 5 - ����������� �� �������� ;"+	" ������ 6 - ����������� �� ����� ");
			System.out.println("������ 7 - ����������� �� �������  ;"+" ������ 8-������ ��������  ");	
			System.out.println("������ 9 ��� ����� � �������.");
			
			
			
			}
}
