

public class Rectangle {
	double length;
	double width;
	// ���������� ��� ���������
	public Rectangle() {
		this.length = 12;
		this.width = 12;
	}
	// ���������� ���� �� ���� ������ ��� ���������
	public Rectangle(double l, double w){
		this.length = l;
		this.width = w;
	}
	// ����� ��� ���������� ���������
	// ����� ������� String � ����������� ���������
	public String perimetr(){
		double perimetr = (length + width)*2;
		 
		return "perimetr is "+ perimetr;
		 
	}
	// ����� ��� ���������� �����
	// ����� �� ������� ������ ��������(void) 
	public void area(){
		double area = length * width;
		System.out.println("area is "+ area );
	}
	
	
}
