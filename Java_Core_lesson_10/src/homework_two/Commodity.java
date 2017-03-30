package homework_two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import homework_one.Person;
import homework_one.SortAge;
import homework_one.SortByNAme;


public class Commodity {

	private String brand;
	private int length;
	private int width;
	private int weight;

	public Commodity() {
	// TODO Auto-generated constructor stub
}
	public Commodity(String brand, int length, int width, int weight) {
		super();
		this.brand = brand;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + length;
		result = prime * result + weight;
		result = prime * result + width;
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
		Commodity other = (Commodity) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (length != other.length)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
Scanner scan= new Scanner(System.in);
	
/////////////////////////////

	
	public void addCommodity(){

		System.out.println("¬вести brand");
		String brand = scan.next();
		System.out.println("¬вести довжину : ");
		int lenght = scan.nextInt();
		System.out.println("¬вести ширину ");
		int width = scan.nextInt();
		System.out.println("¬вести вагу");
		int weight = scan.nextInt();
		
		commodities.add(new Commodity(brand, lenght, width, weight));
		System.out.println(commodities);
	}
	
	public void removeCommodity(){

		Iterator<Commodity> iterator = commodities.iterator();
		String brand = scan.next(); 
		
			while(iterator.hasNext()){ 
				Commodity commodity= iterator.next(); 
				if(commodity.getBrand().equalsIgnoreCase(brand)){ 
				iterator.remove(); 

				} 
		
				}
			System.out.println(commodities);
	}
	
	//////////////////////////////
	public void changeCommodity(){
		Iterator<Commodity> iterator1 = commodities.iterator();
		String brand = scan.next(); 

		while(iterator1.hasNext()){ 
			Commodity commodity= iterator1.next(); 
			if(commodity.getBrand().equalsIgnoreCase(brand)){ 
			iterator1.remove();
				addCommodity();

			} 
		}
		/*System.out.println("changeCommodity is :" + commodities);*/
	}
	
		///////////////////////////////////

	Set<Commodity>commodities = new HashSet<Commodity>();
	

	public void sortBrand(){

		ArrayList<Commodity> array=new ArrayList<>(commodities);
	Collections.sort(array,new SortBrand());
	for (Commodity commodity : array) {
			System.out.println(commodity);
	}
	}
	
	public void sortLength(){
		
		ArrayList<Commodity> array=new ArrayList<>(commodities);
		Collections.sort(array,new SortLength());
		for (Commodity commodity : array) {
			System.out.println(commodity);
		}
		
	}
	
	public void sortWeight(){
		
		ArrayList<Commodity> array=new ArrayList<>(commodities);
		Collections.sort(array,new SortWeight());
		for (Commodity commodity : array) {
			System.out.println(commodity);
		}
		
	}
	
	public void sortWidth(){
		
		ArrayList<Commodity> array=new ArrayList<>(commodities);
		Collections.sort(array,new SortWidth());
		for (Commodity commodity : array) {
			System.out.println(commodity);
		}
		
	}
	

	public void outputIndexElement(){
		System.out.println("¬веди бренд елемента");
		String scan1 =scan.next();
			Iterator<Commodity> iterator1 = commodities.iterator();

			while(iterator1.hasNext()){ 
				Commodity commodity= iterator1.next(); 
				if(commodity.getBrand().equalsIgnoreCase(scan1)){ 
				
					System.out.println(commodity);/////////////////,,??????//

				} 
		
		}

}
	
	public void outFromSystem(){
		System.exit(0);
		
		}
	
	
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Commodity [brand=" + brand + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}

}
