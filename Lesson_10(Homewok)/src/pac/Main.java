package pac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow c = new Cow();
		Dog d = new Dog();
		Cat ca = new Cat();
		
		Pet []p = {c,d,ca};
		
		for(Pet e: p){
			e.voice();
		}
	}

}
