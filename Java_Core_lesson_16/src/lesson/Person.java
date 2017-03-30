package lesson;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Person implements Serializable,Externalizable {

	private String name ;
	protected int age;
	public String rang ;
	public int id;
	private Autoe auto;
	
	public Person(String name, int age, String rang, int id, Autoe auto) {
		super();
		this.name = name;
		this.age = age;
		this.rang = rang;
		this.id = id;
		this.auto = auto;
	}
	public Person(String name, int age, String rang, int id) {
		super();
		this.name = name;
		this.age = age;
		this.rang = rang;
		this.id = id;
	
	}
	public Person() {
		super();
	}
	
	public Autoe getAuto() {
		return auto;
	}
	public void setAuto(Autoe auto) {
		this.auto = auto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRang() {
		return rang;
	}
	public void setRang(String rang) {
		this.rang = rang;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rang == null) ? 0 : rang.hashCode());
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rang == null) {
			if (other.rang != null)
				return false;
		} else if (!rang.equals(other.rang))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", rang=" + rang + ", id=" + id + ", auto=" + auto + "]";
	}
	
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
}
