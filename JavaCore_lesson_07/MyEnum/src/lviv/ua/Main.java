package lviv.ua;

public class Main {

	public static void main(String[] args) {
	
		Seasons s=Seasons.SUMMER;
		Month m = Month.DECEMBER;
		System.out.println(s.ordinal());
		System.out.println(s.name());
		System.out.println(s.toString());
		System.out.println(s.getDeclaringClass());
		System.out.println(m.getDays());
		
		System.out.println(m.getSeason());
		if(m.getSeason()==s){
			System.out.println("equals");
		}
		System.out.println(s.name());
//		Seasons s2=Seasons.WINTER;
//		System.out.println(s2.name());
//		Seasons mas[]=s.values();
//		for (Seasons sq: mas) {
//			System.out.println(sq);
//		}
		
//	System.out.println(s2.compareTo(s));
		
	}

	
	
}
