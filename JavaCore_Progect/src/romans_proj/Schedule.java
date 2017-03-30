package romans_proj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Schedule  {

	private Set<Seance > set;

	public Schedule(Set<Seance> set) {
		super();
		this.set = new HashSet<Seance>();
	}



	public Set<Seance> getSet() {
		return set;
	}



	public void setSet(Set<Seance> set) {
		this.set = set;
	}



	public Schedule() {
		super();
	}



	Scanner scanner = new Scanner(System.in);
	Time time = new Time();

	public void addSeance(){
		
	System.out.println("¬вед≥ть назву ф≥льма ");
	String title = scanner.next();
	System.out.println("¬вед≥ть тривал≥сть ф≥льму год:хв =  ");
	int hour = scanner.nextInt();
	int minute = scanner.nextInt();
	
	System.out.println("¬вед≥ть час ф≥льму год:хв =  ");
	int hour1 = scanner.nextInt();
	int minute1 = scanner.nextInt();
	
	

	
	this.set.add(new Seance(new Movie(title, new Time(hour,minute)), new Time(hour1,minute1)));
	
	System.out.println(set);
	}
	
	
	public void removeSeance(){
		Iterator<Seance> iterator = set.iterator();
		String title = scanner.next(); 
		
			while(iterator.hasNext()){ 
				Seance seance= iterator.next(); 
				if(seance.getMovie().getTitle().equals(title)){ 
				iterator.remove(); 

				} 
		
				}
			System.out.println(set);
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((set == null) ? 0 : set.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (set == null) {
			if (other.set != null)
				return false;
		} else if (!set.equals(other.set))
			return false;
		return true;
	}




	
	
}
