package zadaci_07_03_2017;

import java.util.Calendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	
	public MyDate() {
		this(System.currentTimeMillis());
	}
	
	//dobijamo datum na osnovu milisekundi
	public MyDate(long elapsedTime) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(elapsedTime);

		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	//konstruktor vraca datum na osnovu prodlijedjenih parametara
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return "Date: " + year + "/" + month + "/" + day; 
	}
	
	public void setDate(long elapsedTime) {
		elapsedTime = System.currentTimeMillis(); 
	}
	
	//acessor metode
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
}
}
