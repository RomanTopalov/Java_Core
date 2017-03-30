package homework1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

	private int id;
	private String name;
	private String surName;
	private int age;

	public Person() {
		super();
	}

	public Person(int id, String name, String surName, int age) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surName=" + surName + ", age=" + age + "]";
	}

	/*
	 * - створити клас(будь-який) описати його будь-якими полями ( обов*язково
	 * має бути Id поле)
	 * 
	 * створити базу даних у вигляді файлу, організувати до неї такі методи :
	 * press 1 to show data press 2 to find by id number press 3 to remove by id
	 * number press 4 to add new into data( зробити переівку по ід, щоб не було
	 * дублювання) press 5 to update information файл має бути читабельним
	 */

	Scanner scanner = new Scanner(System.in);
	List<Person> list = new ArrayList<>();

	public void showData() throws IOException {
		System.out.println("input id");
		int id = scanner.nextInt();
		System.out.println("input name");
		String name = scanner.next();
		System.out.println("input SurName");
		String surName = scanner.next();
		System.out.println("input age");
		int age = scanner.nextInt();

		/*
		 * String leftAlignFormat = "| %-15s | %-4d |%-15s |%-15s |%-15s |%n";
		 * 
		 * System.out.format(
		 * "+-----------------+------+-----------------+-----------------+-----------------+%n"
		 * ); System.out.
		 * format("| Column name     |   id |      name	 	  |       surName   |	     age      |%n"
		 * ); System.out.format(
		 * "+-----------------+------+-----------------+-----------------+-----------------+%n"
		 * ); for (int i = 0; i < list.size(); i++) {
		 * System.out.format(leftAlignFormat, "Person" + i, id , name
		 * ,surName,age); } System.out.format(
		 * "+-----------------+------+-----------------+-----------------+-----------------+%n"
		 * );
		 */
		list.add(new Person(id, name, surName, age));

		FileWriter fileWriter = new FileWriter("data.txt", true);
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i).toString();
			fileWriter.write(string + " ");
			fileWriter.write(" \n ");
			fileWriter.close();

		}
		System.out.println(list);

	}

	public void findById() throws IOException {
		String id = scanner.next();
		FileReader fileReader = new FileReader("data.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line="";

		while ((line = bufferedReader.readLine()) != null) {
			String[] str = line.split(",");
			if (str[0].contains(id)) {
				
				System.out.println(line);
			}

		}
		bufferedReader.close();

	}

	/*
	 * while ((line = bufferedReader.readLine()) != null) { if
	 * (line.contains(name)) { System.out.println(line); }
	 * 
	 * }
	 */

	/*
	 * for (Person person : list) { if (line.equals(name)) {
	 * System.out.println(line); }
	 */

	public void removeById() throws IOException {
		System.out.println("input id");

		FileReader fileReader = new FileReader("data.txt");
		// String name = scanner.next();

		String id = scanner.next();
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		String remLine = "";

		while ((line = bufferedReader.readLine()) != null) {

			String[] str = line.split(",");
			if (str[0].contains(id)) {

				line = remLine;
				System.out.println(line);

			}

		}
		bufferedReader.close();

	}

}

/*
 * while ((line = bufferedReader.readLine()) != null) {
 *  if (line.contains(name))
 * { line = remLine;
 * 
 * } System.out.println(line); }
 */
