package homework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Weapon implements Serializable {

	public Weapon() {
		super();
	}

	private String name ;
	private int calibr;
	
	public Weapon(String name, int calibr) {
		super();
		this.name = name;
		this.calibr = calibr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalibr() {
		return calibr;
	}

	public void setCalibr(int calibr) {
		this.calibr = calibr;
	}

	@Override
	public String toString() {
		return "Weapon [name=" + name + ", calibr=" + calibr + "]";
	}

	

	
	
}
