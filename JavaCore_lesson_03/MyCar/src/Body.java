
public class Body {
	private int size;
	// конструктор з параметром
	public Body(int size) {
		this.size = size;
	}
	// конструктор без параметрів
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
	// метод для зміни розміру кузова
	public String changeSizeForCarBody() {
		int newSize = this.size * 10;
		return "your new size for carBody is " + newSize + " m3";
	}
}
