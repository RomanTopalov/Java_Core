package pack;

public class Pet extends Animal{

	private String nick;

	public Pet(String name, int age, String nick) {
		super(name, age);
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void voice(){
		System.out.println("pet voice");
	}
	
}
