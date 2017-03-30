package homework;

import java.io.IOException;

import lesson.Autoe;
import methods.AutoMethods;

public class Roma implements AutoMethods{

	private String name;
	private String surName;
	private int age;
	private String faculty;

	public Roma() {
		super();
	}

	public Roma(String name, String surName, int age, String faculty) {
		super();
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.faculty = faculty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
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
		Roma other = (Roma) obj;
		if (age != other.age)
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Roma [name=" + name + ", surName=" + surName + ", age=" + age + ", faculty=" + faculty + "]";
	}

	@Override
	public void serialize(Autoe k) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Autoe k) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
