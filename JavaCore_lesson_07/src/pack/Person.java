package pack;

public class Person {

	private Transport transport;
	
	
	public void toGo(Transport transport){
		System.out.println("go by "+transport.name());
	}
	
}
