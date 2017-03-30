package romans_proj;

import java.util.Comparator;

public class SortTime implements Comparator<Time> {


	@Override
	public int compare(Time o1, Time o2) {
		// TODO Auto-generated method stub
		return o1.getHour()-o2.getHour();
	}

}
