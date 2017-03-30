package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Police extends Person {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String rang;
	private Weapon weapon;
	
	public Police(String name, int age) {
		super(name, age);
	}
	
	

	public Police(String name, int age, String rang, Weapon weapon) {
		super(name, age);
		this.rang = rang;
		this.weapon = weapon;
	}



	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void maxCalibr() throws IOException, ClassNotFoundException{

		Weapon avt = new Weapon("avt", 1);
		Weapon pist = new Weapon("pist", 5);
		Weapon revol = new Weapon("revol", 3);
		Weapon bazuka = new Weapon("bazuka", 10);
		Weapon bobik = new Weapon("bobik", 6);

		List<Weapon> weapons = new ArrayList<>();
		weapons.add(avt);
		weapons.add(pist);
		weapons.add(revol);
		weapons.add(bazuka);
		weapons.add(bobik);
		
		FileOutputStream fos = new FileOutputStream("police.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(weapons);
		
		FileInputStream fis = new FileInputStream("police.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Weapon>lst  = (List<Weapon>)ois.readObject();
		int max =0;
			for (Weapon weapon : weapons) {
				if(weapon.getCalibr()>max){
					max=weapon.getCalibr();
				}
			}
		System.out.println("Max Calibr is = "+ max);
		}	

	public void maxAge() throws IOException, ClassNotFoundException{
		Person roma = new Person("roma", 19);
		Person vova = new Person("vova", 30);
		Person orest = new Person("orest", 34);
		Person anton = new Person("anton", 20);
		Person roza = new Person("roza", 10);
		
		List<Person> persons = new ArrayList<>();
		persons.add(roma);
		persons.add(vova);
		persons.add(orest);
		persons.add(anton);
		persons.add(roza);
		
		int maxAge=0;
		
		FileOutputStream fos = new FileOutputStream("police.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(persons);
		
		FileInputStream fis = new FileInputStream("police.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
List<Person> list= (List<Person>) ois.readObject();

		for (Person person : persons) {
		
			if(person.getAge()>maxAge){
				maxAge=person.getAge();

			}

		}
		System.out.println("Max age is = "+ maxAge);

		}

	
}
