
public class Helm {
	private int radius;
	// ����������� � ����������
	public Helm(int radius) {
		this.radius = radius;
	}
	// ����������� ��� ���������
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
	
	// ����� ��� ���� ������ �����
	public String changeRadiusForRul() {
		int radius = this.radius * 2;
		return "your new radius for rul is " + radius + " cm";
	}
}
