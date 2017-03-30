package romans_proj;

import java.util.Scanner;

public class Time {
	private int hour;
	private int minute;
	

	Scanner scanner = new Scanner(System.in);

	public Time() {
		super();
	}

	public Time(int hour,int minute) {
		super();
		if (minute > 0 && minute < 60) {
			this.minute = minute;
		}else{
			System.out.println("Ви ввели неправильні значення хвилин ");
		}
		
		if (hour > 0 && hour < 24) {
			this.hour = hour ;
		}else{
			System.out.println("Ви ввели неправильні значення годин ");
		}
	}

	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
	
	}
	
	public int getMinute() {

		return minute;
	}

	public void setMinute(int minute) {
		this.minute=minute;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return   hour + "год:" + minute + "хв";
	}

}
