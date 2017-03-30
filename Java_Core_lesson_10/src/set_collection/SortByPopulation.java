package set_collection;

import java.util.Comparator;

public class SortByPopulation implements Comparator<City> {

	@Override
	public int compare(City o1, City o2) {
		// TODO Auto-generated method stub
		return o1.getPopulation()-o2.getPopulation();
	}

}
