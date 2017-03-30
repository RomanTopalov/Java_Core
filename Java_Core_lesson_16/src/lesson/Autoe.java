package lesson;

public class Autoe {

	
	private String power ;
	private String brand;
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Autoe(String power, String brand) {
		super();
		this.power = power;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Autoe [power=" + power + ", brand=" + brand + "]";
	}
}
