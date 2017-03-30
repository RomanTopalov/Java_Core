package homework_two;

import java.util.Comparator;

public class SortBrand implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
