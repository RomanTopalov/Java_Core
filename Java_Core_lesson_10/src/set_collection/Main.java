package set_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	
	public static void main(String[] args) {
		/*Set<String >names = new HashSet<String>(100);//100,100 elements
		names.add("ivan");
		names.add("anton");
		names.add("vova");
		names.add("ira");
		names.add("petro");
		
		System.out.println(names);
		
		*/
		
		/*Set<Integer> integers = new HashSet<Integer>();
		integers.add(12);
		integers.add(100);
		integers.add(5);
		integers.add(3);
		integers.add(7);
		integers.add(15);
		integers.add(2);
		System.out.println(integers);
		*/
	
		/*	Comparator<City > comparator = new SortByPopulation();
		Set<City> set = new TreeSet<>(comparator.thenComparing(new SortName()));
		set.add(new City("lviv", 234532));
		set.add(new City("bobef",4532));
		set.add(new City("fasrtljg", 2332));
		set.add(new City("kuiv", 234532));
		set.add(new City("drof", 12312));
		
		for (City city : set) {
			System.out.println(city);
		}
	*/
		
		Set<City> set = new HashSet<City>();
		set.add(new City("lviv", 234532));
		set.add(new City("bobef",4532));
		set.add(new City("fasrtljg", 2332));
		set.add(new City("kuiv", 234532));
		set.add(new City("drof", 12312));
		
		ArrayList<City> arrayList=new ArrayList<>(set);
		Collections.sort(arrayList,new SortName());
		for (City city : arrayList) {
			System.out.println(city);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
