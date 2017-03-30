
public class Helm {
	private int radius;
	// конструктор з параметром
	public Helm(int radius) {
		this.radius = radius;
	}
	// конструктор без параметрів
	public Helm() {
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Rul [radius=" + radius + "]";
	}
	
	// метод для зміни розміру керма
	public String changeRadiusForRul() {
		int radius = this.radius * 2;
		return "your new radius for rul is " + radius + " cm";
	}
}
