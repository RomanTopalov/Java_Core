package romans_proj;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
/*Time time = new Time();
time.setMinute(70);
System.out.println(time.getMinute());*/
		
//	Seance seance = new Seance(new Movie("df", new Time(20, 35)), new Time(3, 2));
//	System.out.println(	seance);
	
	
	
	 
	Scanner scan = new Scanner(System.in);
	boolean exist = true;
	
	Schedule schedule = new Schedule();
	Cinema cinema = new Cinema();
		 schedule.setSet(new HashSet<Seance>());
	 
		 System.out.print("Робота театру=> ");
		 cinema.setOpen(new Time(9, 10));
		 cinema.setClose(new Time(23, 20));
		 System.out.print(cinema.getOpen()+"-");
		 System.out.print(cinema.getClose());
		
		 menu();	 
	while (exist) {
		
	int choise=scan.nextInt();
		
	switch (choise) {

	case 1:cinema.addSHedule();break;      //        404
	case 2:cinema.addMov();break;
	case 3: cinema.addSeanse();break;
	
	case 4: cinema.removeSeance();break;
	case 5: schedule.addSeance();break;
	case 6:schedule.removeSeance();break;
	
	case 9:System.out.println("Ви вийшли з системи");cinema.outFromSystem();break;

	default:
		break;
}
	
	}
		}
	public static void menu(){
		System.out.println("\nНажміть 1 щоб додати Розклад ; "+" Нажміть 2 щоб видалити фільм з розкладу ");
		System.out.println("Нажміть 3 щоб додати фільм з сеансами ; "+" Нажміть 4 - видалити сеанс ");
		System.out.println("Нажміть 5 - додати сеанс ;"+	" Нажміть 6 - видалити сеанс ");
		
		System.out.println("Нажміть 9 щоб вийти з системи.");
		
		
		
		}
			}