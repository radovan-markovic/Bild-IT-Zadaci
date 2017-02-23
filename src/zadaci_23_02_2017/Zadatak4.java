package zadaci_23_02_2017;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak4 {

	public static void main(String[] args) {
		
		//pozivamo metodu
		datumIVrijeme();

	}
	
	//metoda koja vraca trenutni datum i vrijeme
	public static void datumIVrijeme(){
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy. HH:mm:ss");
		Date date = new Date();
		System.out.println("Trenutni datum i vrijeme: " + dateFormat.format(date));
	}
}
