package generic_lesson;

public class Box<T, N> { /*extends Number*/

	private T sender;
	private N weight;

	public Box(T sender, N weight) {
		super();
		this.sender = sender;
		this.weight = weight;
	}

	public T getSender() {
		return sender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sender == null) ? 0 : sender.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		Box other = (Box) obj;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	public void setSender(T sender) {
		this.sender = sender;
	}

	public N getWeight() {
		return weight;
	}

	public void setWeight(N weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Box [sender=" + sender + ", weight=" + weight + "]";
	}

}
