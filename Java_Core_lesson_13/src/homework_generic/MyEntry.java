package homework_generic;

public class MyEntry<K, V> {

	private K name;
	private V age;

	public MyEntry(K name, V age) {
		super();
		this.name = name;
		this.age = age;
	}

	public MyEntry() {
		// TODO Auto-generated constructor stub
	}

	public K getName() {
		return name;
	}

	public void setName(K name) {
		this.name = name;
	}

	public V getAge() {
		return age;
	}

	public void setAge(V age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MyEntry other = (MyEntry) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyEntry [name=" + name + ", age=" + age + "]";
	}

}
