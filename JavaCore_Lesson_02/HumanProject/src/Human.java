import java.util.Scanner;

public class Human {
	String name;
	String typeOfHuman;
	int age;

	public Human(String name, String typeOfHuman, int age) {
		super();
		this.name = name;
		this.typeOfHuman = typeOfHuman;
		this.age = age;
	}

	public void typeHuman(){
		
		System.out.println("type of human is "+ typeOfHuman);
		// ������������ ���������� ���������
		String choise = typeOfHuman.equals("plowman") ? "bad choise" : "nice choise";
		System.out.println(choise);
	}
	
	public void someDish(){
		if(typeOfHuman.equalsIgnoreCase("plowman")){
			System.out.println("you can eat: buckwheat, olives, cabbage");
			System.out.println("enter what you want to eat");
			Scanner scanner = new Scanner(System.in);
			String foodName = scanner.next();
			if(foodName.equalsIgnoreCase("buckwheat")){
				System.out.println(name+ " can eat "+ (int)(Math.random()*1000)+ " kilogram of backwheat");
			}else if(foodName.equalsIgnoreCase("olives")){
				System.out.println(name+ " can eat "+ (int)(Math.random()*1000)+ " kilogram of olives");
			}else if(foodName.equalsIgnoreCase("cabbage")){
				System.out.println(name+ " can eat "+ (int)(Math.random()*1000)+ " kilogram of olives");
			}else{
				System.out.println("don't have this dish");
			}
			
		}else{
		
			System.out.println("pease choose and enter who you want to kill today: deer, pig or mammoth?");
			 
			Scanner scanner = new Scanner(System.in);
			String foodName = scanner.next();
			if(foodName.equalsIgnoreCase("deer")){
				System.out.println(name+ " can kill over than"+ (int)(Math.random()*10)+ " number of deers");
			}else if(foodName.equalsIgnoreCase("pig")){
				System.out.println(name+ " can kill over than"+ ((int)(Math.random()*10))+ " number of pigs");
			}else if(foodName.equalsIgnoreCase("mammoth")){
				System.out.println(name+ " can kill over than"+ (int)(Math.random()*10)+ " number of mammoths");
			}else{
				System.out.println("don't have this dish");
			}
			
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", typeOfHuman=" + typeOfHuman + ", age=" + age + "]";
	}

}
