package pack;

public class Dog extends Pet{

	private String type;

	public Dog(String name, int age, String nick, String type) {
		super(name, age, nick);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dog [type=" + type + "]";
	}
	
	
	
	
	
}
