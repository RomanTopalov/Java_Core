
public class Car {
	// два власних поля класу
	private String brend;
	private String color;
	private int age;
	// об*єкти передані в клас як поля 
	private Wheels wheel;
	private Helm rul;
	private Body carBody;
	// конструктор який на вхід отримує параметри і змінює розміри частин машини
	// вид зв*язку агрегація
	public Car(String brend, String color, int age, int radius, int radius2, int size) {
		this.brend = brend;
		this.color = color;
		this.age = age;
		this.wheel = new Wheels(radius);
		this.rul = new Helm(radius2);
		this.carBody = new Body(size);
	}
	// делегування методів класів частин головному класу
	public void changeWheel() {
		System.out.println(this.wheel.changeRadiusForWheel());
	}
	// делегування методів класів частин головному класу
	public void changeRul() {
		System.out.println(this.rul.changeRadiusForRul());
	}
	// делегування методів класів частин головному класу
	public void changeCarBody() {
		System.out.println(this.carBody.changeSizeForCarBody());
	}

	public void changeBrend() {
		String newBrend = this.brend + " is old, new brend is porshe";
		System.out.println(newBrend);
	}

	public void changeColor() {
		String newColor = this.color + " is ugly, new color is grey";
		System.out.println(newColor);
	}

	public void changeAge() {
		this.age = this.age - 10;
		System.out.println("your car is old, now her age is " + this.age + " age.");
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Wheels getWheel() {
		return wheel;
	}

	public void setWheel(Wheels wheel) {
		this.wheel = wheel;
	}

	public Helm getRul() {
		return rul;
	}

	public void setRul(Helm rul) {
		this.rul = rul;
	}

	public Body getCarBody() {
		return carBody;
	}

	public void setCarBody(Body carBody) {
		this.carBody = carBody;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((brend == null) ? 0 : brend.hashCode());
		result = prime * result + ((carBody == null) ? 0 : carBody.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((rul == null) ? 0 : rul.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (age != other.age)
			return false;
		if (brend == null) {
			if (other.brend != null)
				return false;
		} else if (!brend.equals(other.brend))
			return false;
		if (carBody == null) {
			if (other.carBody != null)
				return false;
		} else if (!carBody.equals(other.carBody))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (rul == null) {
			if (other.rul != null)
				return false;
		} else if (!rul.equals(other.rul))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}
	
	
	

	@Override
	public String toString() {
		return "Car [brend=" + brend + ", color=" + color + ", age=" + age + ", wheel=" + wheel + ", rul=" + rul
				+ ", carBody=" + carBody + "]";
	}

}
