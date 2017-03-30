

public class Rectangle {
	double length;
	double width;
	// коструктор без параметрів
	public Rectangle() {
		this.length = 12;
		this.width = 12;
	}
	// коструктор який на вхід приймає два параметра
	public Rectangle(double l, double w){
		this.length = l;
		this.width = w;
	}
	// метод для визначення периметру
	// метод повертає String з розрахунком периметра
	public String perimetr(){
		double perimetr = (length + width)*2;
		 
		return "perimetr is "+ perimetr;
		 
	}
	// метод для визначення площі
	// метод не повертає ніякого значення(void) 
	public void area(){
		double area = length * width;
		System.out.println("area is "+ area );
	}
	
	
}
