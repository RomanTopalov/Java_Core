package romans_proj;

public class Movie {

	private String title;
	private Time duration;

	public Movie() {
		super();
	}

	public Movie(String title, Time duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Time getDuration() {
		
		return duration;
	}

	public void setDuration(Time duration) {
		if(duration.getHour()<24&&duration.getHour()>0){
			if(duration.getMinute()<60&&duration.getMinute()>0){
		
		this.duration = duration;
		}}else {
			System.out.println("введыть коректны даны");
		}
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Movie other = (Movie) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	public Time plus(Time arg, Time arg2){ 
		int hour1 = arg.getHour() + arg2.getHour(); 
		int min1 = arg.getMinute() + arg2.getMinute(); 
		return new Time( hour1,min1); 
		}

	
	
	@Override
	public String toString() {
		return "" + title +""+ " Тривалість: " + duration ;
	}
	
	

}
