package some;

public class Instrument {

	private int weight;

	public Instrument(int weight) {
		super();
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Instrument [weight=" + weight + "]";
	}
	
	public void play(){
		System.out.println("instrument play");
	}
	
}
