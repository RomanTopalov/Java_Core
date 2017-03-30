package homework_map;

public class Animal {

	private String petType;
	private String petName;
	
	
	public Animal() {
		super();
	}

	public Animal(String petType, String petName) {
		super();
		this.petType = petType;
		this.petName = petName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((petName == null) ? 0 : petName.hashCode());
		result = prime * result + ((petType == null) ? 0 : petType.hashCode());
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
		Animal other = (Animal) obj;
		if (petName == null) {
			if (other.petName != null)
				return false;
		} else if (!petName.equals(other.petName))
			return false;
		if (petType == null) {
			if (other.petType != null)
				return false;
		} else if (!petType.equals(other.petType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [petType=" + petType + ", petName=" + petName + "]";
	}

}
