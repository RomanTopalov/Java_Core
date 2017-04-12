
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList();
		
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		
				
		long start = System.nanoTime();
    delete(arrayList, 6);
    
	long finish = System.nanoTime();
	long timeCount = finish-start;
  
    System.out.println(timeCount);

    
    
    ArrayList<Integer> arrayList2 = new ArrayList();
	
	for (int i = 0; i < 100000; i++) {
		arrayList2.add(i);
	}
	
	long start2 = System.nanoTime();
	
    arrayList2.remove(6);
    
	long finish2 = System.nanoTime();
	long timeCount2 = finish2-start2;
    
    System.out.println(timeCount2);
  
	}

	public static void delete( ArrayList a, int index){
		
		int temp = (int) a.get(a.size()-1);
		a.remove(a.size()-1);
		a.set(index, temp);
		
	}
}


