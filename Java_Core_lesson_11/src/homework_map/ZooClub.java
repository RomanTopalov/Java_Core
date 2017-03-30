package homework_map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {

	private Map<Person, List<Animal>> map;

	public ZooClub() {
		super();
	}

	public ZooClub(Map<Person, List<Animal>> map) {
		super();
		this.map = new HashMap<>();
	}

	Scanner scanner = new Scanner(System.in);

	Person person = new Person();

	List<Animal> animals = new ArrayList<Animal>();

	public void addPerson() {

		System.out.println("¬вести ≥м€ людини :");
		person.setName(scanner.next());
		System.out.println("¬вести age : ");
		person.setAge(scanner.nextInt());

		this.map.put(new Person(person.getName(), person.getAge()), new ArrayList<Animal>());
		System.out.println(map);

	}

	public void addAnimal() {
		System.out.println("¬вести petName : "); 
		String petName = scanner.next();
		System.out.println("¬вести petType : ");
		String petType = scanner.next();

		animals.add(new Animal(petName, petType));

		this.map.put(person, animals);

		System.out.println(map);

	}

	public void removeAnimal() {

	
		//
		Iterator<Animal> iterator1 = animals.iterator();
		//
		String namePet = scanner.next();

		while (iterator1.hasNext()) {
			Animal animal = iterator1.next();
			if (animal.getPetName().equalsIgnoreCase(namePet)) {
				iterator1.remove();
				System.out.println(animal);

			}

		}
		System.out.println(map);

	}

	public void removePerson() {
		String namePerson = scanner.next();
		for (Person person : map.keySet()) {
			if (person.getName().equalsIgnoreCase(namePerson)) {
				map.remove(person);
			}

		}
		System.out.println(map);

	}

	public void removeSimilarAnimal() {
		System.out.println("¬вести namePerson : ");
		String namePerson = scanner.next();

		System.out.println("¬вести Animal name : ");
		String animalName = scanner.next();
		for (Person person : map.keySet()) {
			Iterator<Animal> iterator = animals.iterator();
			while (iterator.hasNext()) {
				Animal animal = iterator.next();
				if (animal.getPetName().equalsIgnoreCase(animalName)) {
					iterator.remove();
				}
			}

		}
		System.out.println(map);

	}

	public void  reWrite() throws IOException{
		System.out.println("write some text");
		String text = scanner.next();
		
		File file = new File("zoo.txt");
		file.createNewFile();
		
		FileOutputStream fileOutputStream = new FileOutputStream("zoo.txt");
		 fileOutputStream.write(text.getBytes());
		 
		 fileOutputStream.flush();
		 
		 System.out.println(map);
	}
	
	public void addText() throws IOException{
		System.out.println("write some text");
		String text = scanner.next();
		FileWriter fileWriter = new FileWriter("zoo.txt",true);
		fileWriter.write(text);
		fileWriter.flush();
		fileWriter.close();
	}
	
	public void toConsole() throws IOException{
		 FileReader fileReader = new FileReader("zoo.txt");
		 
		 BufferedReader bufferedReader = new BufferedReader(fileReader);
		 
		 System.out.println(bufferedReader.readLine());
		 
		 String line = "" ;
		  while ((line = bufferedReader.readLine())!= null){
			  System.out.println(line);
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}

}
