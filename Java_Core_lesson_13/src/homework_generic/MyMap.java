package homework_generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class MyMap<K,V> {
	
	Scanner scanner = new Scanner(System.in);
	
 MyEntry< K, V> entry1 = new MyEntry<K, V>();
 
 
	Map<K, V> map = new HashMap<K,V>();
	
	public void addMyEntry(K k , V v ) {

		String name = scanner.next();	

		String age = scanner.next();	
		map.put(new MyEntry<K,V>(k,v));
		System.out.println(map);
	}

	

}
