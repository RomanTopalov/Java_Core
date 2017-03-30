package lesson;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Country implements /*Serializable*/ Externalizable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	 private int population;
	 /*transient*/ private double square;
	 
		public Country(String name, int population, double square) {
			super();
			this.name = name;
			this.population = population;
			this.square = square;
		}
		
		
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", square=" + square + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Country other = (Country) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public double getSquare() {
		return square;
	}


	public Country() {
		super();
	}


	public void setSquare(double square) {
		this.square = square;
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	
		 name = (String) in.readObject();
		population = in.readInt();
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

out.writeObject(name);		
out.writeInt(population);

	}



}
