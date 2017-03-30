package homework_map;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) throws IOException {


		Scanner scan = new Scanner(System.in);
		boolean exist = true;

		ZooClub zooClub = new ZooClub(new HashMap<>());
		
		while (exist) {
			
		int choise=scan.nextInt();
			
		switch (choise) {
		case 1:zooClub.addPerson();break;
		case 2:zooClub.addAnimal();break;
		case 3:zooClub.removeAnimal();break;
		case 4:zooClub.removePerson();break;
		case 5:zooClub.removeSimilarAnimal();break;
		case 6:zooClub.reWrite();break;
		case 7:zooClub.addText();break;
		case 8:zooClub.toConsole();break;
		
		case 9:;break;

		default:
			break;
	}
		
	}
		
	}
		
		
		
		
		
		
	}

