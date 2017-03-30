package pac2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while(true)	{
		System.out.println("Enter you number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
				{
						System.out.println(coinCount(number));
				}
			}
	}
	
	public static String coinCount(int number){
	
	int count_50 = 0;
	int count_25 = 0;
	int count_10 = 0;
	int count_5 = 0;
	int count_2 = 0;
	int count_1 = 0;
		
	
	while(number>=50){
			number -=  50;
			count_50++;
		}
		while(number>=25){
			number -= 25;
			count_25++;
		}
		while(number >=10){
			number -=10;
			count_10++;
		}
		while(number >= 5){
			number -=5;
			count_5++;
		}
		while(number >= 2){
			number -=2;
			count_2++;
		}
		while(number >= 1){
			number -=1;
			count_1++;
		}
		
		
		return "Потрібно купюрами по 50(" + count_50+"штук) "+ "купюрами по 25 - ("+ count_25+" штук) " +" купюрами по 10 ( " + count_10 + " )штук" + " купюрами  по 5 (" + count_5 + "штук)  купюрами  по 2 (" + count_2 +  "штук)  купюрами  по 1 (" + count_1 +" штук)";
	}
	}
