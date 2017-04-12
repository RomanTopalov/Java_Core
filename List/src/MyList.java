import java.util.ArrayList;

public class MyList extends ArrayList<Integer>{

	public ArrayList<Integer> delete( ArrayList a, int index){
		
		int temp = (int) a.get(a.size()-1);
		a.remove(a.size()-1);
		a.set(index, temp);
		return a;
		
		
		
	}
	
	
}
