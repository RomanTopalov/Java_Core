
public class Wheels {
	private int radius;
	// конструктор з параметрами
	public Wheels(int radius) {
		this.radius = radius;
	}
	// конструктор без параметрів
	public Wheels() {
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + "]";
	}

	// метод для зміни розміру коліс
	public String changeRadiusForWheel() {
		int radius = this.radius * 3;
		return "your new radius for wheel is " + radius + " cm.";
	}
}
