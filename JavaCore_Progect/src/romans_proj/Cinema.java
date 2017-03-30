package romans_proj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Cinema implements Serializable {

	private Time open;
	private Time close;

	// private Map<Movie, List<Time>> mapMovie;
	//
	//
	//
	// public Cinema(Map<Movie, List<Time>> mapMovie) {
	// super();
	// this.mapMovie = new HashMap<>();
	// }
	public Cinema(Time open, Time close) {
		super();
		open.setHour(8);
		open.setMinute(0);
		this.open = open;
		close.setHour(23);
		close.setMinute(10);
		this.close = close;
	}

	public Cinema() {
		super();
	}

	public Time getOpen() {
		return open;
	}

	public void setOpen(Time open) {

		this.open = open;
	}

	public Time getClose() {
		return close;
	}

	public void setClose(Time close) {

		this.close = close;
	}

	Scanner scanner = new Scanner(System.in);

	/////////////////////////////////////////
	Map<Days, Set<Seance>> map = new HashMap<>();

	Set<Seance> set = new HashSet<>();
	Schedule schedule = new Schedule();

	public void addSHedule() {
		// String day = scanner.next();

		Days mas[] = Days.values();

		System.out.println("ƒодати сеанс в певний день \n" + "¬вед≥ть день : ");
		String day = scanner.next();
		for (Days days2 : mas) {

			if (days2.name().equalsIgnoreCase(day)) {
				this.map.put(days2, set);
				System.out.println("¬вед≥ть назву ф≥льма ");
				String title = scanner.next();
				System.out.println("¬вед≥ть тривал≥сть ф≥льму год:хв =  ");
				int hour = scanner.nextInt();
				int minute = scanner.nextInt();

				System.out.println("¬вед≥ть час ф≥льму год:хв =  ");
				int hour1 = scanner.nextInt();
				int minute1 = scanner.nextInt();
				set.add(new Seance(new Movie(title, new Time(hour, minute)), new Time(hour1, minute1)));
				this.map.put(days2, set);

			}

		}
		System.out.println("\n" + map + "\n");

	}

	////////////////////////////////////////

	Map<Movie, List<Time>> mapMovie = new HashMap<Movie, List<Time>>();
	List<Time> times = new ArrayList<Time>();
	Movie movie = new Movie();

	public void addMov() throws IOException {

		System.out.println("¬вед≥ть назву ф≥льма ");
		String title = scanner.next();
		System.out.println("¬вед≥ть тривал≥сть ф≥льму год:хв =  ");
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		// this.mapMovie.put(new Movie(title, new Time(hour, minute)), new
		// ArrayList<Time>());
		System.out.println("¬вести к-сть сеанс≥в");
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {

			System.out.println("ѕочаток сеансу год:хв =  ");
			int hour3 = scanner.nextInt();
			int minute3 = scanner.nextInt();
			times.add(new Time(hour3, minute3));
			this.mapMovie.put(new Movie(title, new Time(hour, minute)), times);

			// FileOutputStream fos = new FileOutputStream("Movies.txt");
			// ObjectOutputStream oos = new ObjectOutputStream(fos);
			//
			// oos.writeObject(new Movie(title, new Time(hour, minute)));
			// oos.close();

		}

		System.out.println(mapMovie);
	}
	// public void addTime(){
	//
	// }
	// public void addMovie(){
	// addMov();
	// addTime();
	// }

	public void addSeanse() {
		schedule.setSet(new HashSet<Seance>());
		schedule.addSeance();
	}

	public void removeSeance() {
		Iterator<Seance> iterator = set.iterator();
		System.out.println("¬идалити ф≥льм : ");
		String title = scanner.next();

		while (iterator.hasNext()) {
			Seance seance = iterator.next();
			if (seance.getMovie().getTitle().equals(title)) {
				iterator.remove();

			}

		}
		System.out.println(map);
	}

	public void outFromSystem() {
		System.exit(0);

	}

	@Override
	public String toString() {
		return "Cinema map=" + map + ", schedule=" + schedule + ", times=" + times + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((close == null) ? 0 : close.hashCode());
		result = prime * result + ((open == null) ? 0 : open.hashCode());
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
		Cinema other = (Cinema) obj;
		if (close == null) {
			if (other.close != null)
				return false;
		} else if (!close.equals(other.close))
			return false;
		if (open == null) {
			if (other.open != null)
				return false;
		} else if (!open.equals(other.open))
			return false;
		return true;
	}

}
