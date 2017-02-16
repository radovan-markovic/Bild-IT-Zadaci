package zadaci_16_02_2017;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		long millis = -1;
		boolean test = true;
		
		while (test){//input testing
			try{
				while(millis < 0){
					System.out.println("Unesite vrijeme u milisekundama:");
					millis = input.nextLong();
					input.nextLine();
				}
				test = false;
				}catch (Exception e){
					System.out.println("Pogresan unos:");
					input.nextLine();
				}
		}
		
		//koristimo TimeUnit da konvertujemo milisekunde u sate, minute i sekunde
		
		//foramtiramo milisekunde u sate
		String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
		//od ostatka sata dobijamo minute		
        TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
        //od ostatka minuta dobijamo sekunde
        TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
		
		System.out.println("Vrijeme izrazeno u satima, minutama i seknundama:");
	    System.out.println(hms);
	    input.close();
	}

}
