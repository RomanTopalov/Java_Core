package romans_proj;

import java.util.Comparator;

public class Seance {

	private Movie movie;
	private Time startTime;
	private Time endTime;

	public Seance() {
		super();
	}

	public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = movie.plus(startTime, movie.getDuration());
		/*if (this.endTime.getHour() < 24 && this.endTime.getMinute() < 60) {
			this.endTime = movie.plus(startTime, movie.getDuration());
		} else {
System.out.println("sdf");
		}*/
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		if (startTime.getHour() < 24 && startTime.getHour() > 0) {
			if (startTime.getMinute() < 60 && startTime.getMinute() > 0) {

				this.startTime = startTime;
			}
		} else {
			System.out.println("введыть коректны даны");
		}

		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Назва фільму " + movie + ", Початок сеансу : " + startTime + ", Кінець сеансу :" + endTime ;
	}

}
