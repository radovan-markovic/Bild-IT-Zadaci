package zadaci_03_03_2017;

public class Time {
	
	long hours;
	long minutes;
	long seconds;
	
	//default konsturktor prikazuje vrijeme u milisekundama
	Time(){
		
		this(System.currentTimeMillis());
	}
	
	//konstruktor pretvara u sate minute i sekunde proslijedjene milisekunde
	Time (long miliseconds){
		
		long totalSeconds = miliseconds / 1000;
		seconds = totalSeconds %60;
		
		long totalMinutes = totalSeconds / 60;
		minutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		hours = totalHours % 24;

	}
	
	//konstruktor koji kreira sate minute i sekunde na osnovu proslijedjenih vrijednosti
	Time (long hours, long minutes, long seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	//postavljamo zeljeno vrijeme u milisekundama a dobijamo rezultat u satima minutam i sekundama
	public void setTime(long elapsedTime){
		
		long totalSeconds = elapsedTime / 1000;
		seconds = totalSeconds %60;
		
		long totalMinutes = totalSeconds / 60;
		minutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		hours = totalHours % 24;
	}

	//get metode za sate minute i sekunde
	public long getHours() {
		return hours;
	}

	public long getMinutes() {
		return minutes;
	}

	public long getSeconds() {
		return seconds;
	}
	
	
}
