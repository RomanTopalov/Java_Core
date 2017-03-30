package homework_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import set_collection.City;
import set_collection.SortByPopulation;
import set_collection.SortName;

public class Main {
public static void main(String[] args) {
	
	
	Set<Person> set = new HashSet<Person>();
	set.add(new Person("roma", 19));
	set.add(new Person("vova", 25));
	set.add(new Person("nick", 48));
	set.add(new Person("kate", 43));
	set.add(new Person("lola",20 ));
	
	System.out.println(set);
	
	ArrayList<Person> array=new ArrayList<Person>(set);
	
	Collections.sort(array, new SortAge().thenComparing(new SortByNAme()));
	for (Person person : array) {
		System.out.println(person);
	}

	
	
	
	
	
}
}
