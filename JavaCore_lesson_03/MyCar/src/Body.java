
public class Body {
	private int size;
	// ����������� � ����������
	public Body(int size) {
		this.size = size;
	}
	// ����������� ��� ���������
	public Body() {
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "CarBody [size=" + size + "]";
	}
	// ����� ��� ���� ������ ������
	public String changeSizeForCarBody() {
		int newSize = this.size * 10;
		return "your new size for carBody is " + newSize + " m3";
	}
}
