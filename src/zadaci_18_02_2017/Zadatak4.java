package zadaci_18_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		long minute = 0;
		boolean test = true;
		
		while (test){//provjera unosa
			try{
				while(minute < 1){
					System.out.println("Unesite pozitivan broj minuta:");
					minute = input.nextLong();
					input.nextLine();
				}
				test = false;	
			}catch(Exception e){
				System.out.println("Morate unijeti broj");
				input.nextLine();
			}
		}
		
		//racunamo godine i dane prema broju unijetih minuta
		long minutePoGodini = 365*24*60;
	    double godina = minute / minutePoGodini;
	    double dan = (minute % minutePoGodini)/(24*60);
	    System.out.println((int)godina+ " godina i " + (int)dan + " dana.");
	    
	    input.close();
	}

}
