package homework1;
/*	- створити клас(будь-який) описати його будь-якими полями ( обов*язково має бути Id поле)

створити базу даних у вигляді файлу, організувати до неї такі методи :
press 1 to show data
press 2 to find by id number
press 3 to remove by id number
press 4 to add new into data( зробити переівку по ід, щоб не було дублювання)
press 5 to update information
файл має бути читабельним*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {

	Scanner scan = new Scanner(System.in);
	boolean exist = true;
	Person person = new Person();
	
	File file= new File("data.txt");
	file.createNewFile();
	
	
	while (exist) {
		
	int choise=scan.nextInt();
		
	switch (choise) {
	case 1:person.showData();
	case 2:person.findById();
	case 3:person.removeById();

	default:
		break;
}

	
}
}
}
