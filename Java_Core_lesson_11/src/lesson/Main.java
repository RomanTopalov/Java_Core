package lesson;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
/*
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(10, "one");
		map.put(20, "two");
		map.put(30, "three");
		map.put(40, "four");
		map.put(50, "fifth");
		//map.put(50, "six");
		
		
		System.out.println(map);*/
		
		//System.out.println(map.containsKey(10));
		//System.out.println(map.containsValue("fifth"));
		//System.out.println(map.get(10).toUpperCase());
		//map.remove(10);
		//System.out.println(map.remove(10));
		
		//map.clear();
		/*System.out.println(map.keySet());
		System.out.println(map.values());//повертаэ колекцыю значень 
		
		Collection<String> collectionFromMap = map.values();
		
		for (String string : collectionFromMap) {
			System.out.println(string);
		}
		
		for (String string : map.values()) {
		System.out.println(string);	
		}*/
		
//		for (Integer i : map.keySet()){
//			System.out.println(i);
//		}
//		for (Integer i : map.keySet()) {
//			System.out.println();
//		}
/*//		
		
		Set<Entry<Integer, String>> set=map.entrySet();
		
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry);
			
			if(entry.getKey()==30){
				entry.setValue("change value");
			}
		}
		
		System.out.println(map);*/
		
		
		Map<Country, List<City>> map = new HashMap<Country, List<City>>();
		map.put(new Country("Ukr"), Arrays.asList(new City("Lviv",5050505),new City("Dnipro", 945945304)));
		map.put(new Country("USA"), Arrays.asList(new City("NY",505565),new City("Texas", 1234546346)));
		
		/*String name = "";
		
		
		for (City city : )) {
			
		}
*/
		
Set<Entry<Country, List<City>>> set = map.entrySet();
		
		int max = 0;
		String maxCountry = "";
		String cityMax = "";
		
		for (Entry<Country, List<City>> entry : set) {
			for(City city : entry.getValue()){
				if(max < city.getPopulation()){
					max = city.getPopulation();
					maxCountry = entry.getKey().getName();
					cityMax = city.getName();
				}
			}
		}
		
		System.out.println(maxCountry+" "+cityMax+" "+max);
	
		
	}
}
