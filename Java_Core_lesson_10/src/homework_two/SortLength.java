package homework_two;

import java.util.Comparator;

public class SortLength implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		// TODO Auto-generated method stub
		return o1.getLength()-o2.getLength();
	}

}
