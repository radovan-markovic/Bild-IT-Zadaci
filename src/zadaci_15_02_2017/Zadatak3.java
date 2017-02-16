package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean test = true;
		boolean test2 = true;
		int godina = 0;
		
		while (test){//testiramo unos godine
			try{
				while (godina < 1){
					System.out.println("Unesite godinu:");
					godina = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos unesite broj");
				input.nextLine();
			}
		}
		
		int prestupna = 0;
		
		//provjeravamo da li je godina prestupna
		if((godina%4 == 0 && godina%100!= 0) || (godina%400 == 0)){
			prestupna = 1;
		}
		
		System.out.println("Unesite mjesec:");
		String mjesec = input.nextLine();
		
		while (test2){ // testiramo unos mjeseca i ako je unos ispravan vrsimo ispis
			
			if (mjesec.equals("Jan")){
				System.out.println("Januar " + godina + ". ima 31 dan");
				test2 = false;
			}
			//ako je godina prestupna Februar ima 29 dana
			if (mjesec.equals("Feb") && prestupna == 1){
				System.out.println("Februar " + godina + ". ima 29 dana");
				test2 = false;
			}
			if (mjesec.equals("Feb") && prestupna != 1){
				System.out.println("Februar " + godina + ". ima 28 dana");
				test2 = false;
			}
			if (mjesec.equals("Mar")){
				System.out.println("Mart " + godina + ". ima 31 dan");
				test2 = false;
			}
			if (mjesec.equals("Apr")){
				System.out.println("April " + godina + ". ima 30 dana");
				test2 = false;
			}
			if (mjesec.equals("Maj")){
				System.out.println("Maj " + godina + ". ima 31 dan");
				test2 = false;
			}
			if (mjesec.equals("Jun")){
				System.out.println("Jun " + godina + ". ima 30 dana");
				test2 = false;
			}
			if (mjesec.equals("Jul")){
				System.out.println("Jul " + godina + ". ima 31 dan");
				test2 = false;
			}
			if (mjesec.equals("Avg")){
				System.out.println("Avgust " + godina + ". ima 31 dan");
				test2 = false;
			}
			if (mjesec.equals("Sep")){
				System.out.println("Septembar " + godina + ". ima 30 dana");
				test2 = false;
			}
			if (mjesec.equals("Okt")){
				System.out.println("Oktobar " + godina + ". ima 31 dan");
				test2 = false;
			}
			if (mjesec.equals("Nov")){
				System.out.println("Novembar " + godina + ". ima 30 dana");
				test2 = false;
			}
			if (mjesec.equals("Dec")){
				System.out.println("Decembar " + godina + ". ima 31 dan");
				test2 = false;
			}
			if (test2){//ukoliko unos nije dobar, unosimo ponovo
				System.out.println("Pokusajte ponovo unijeti mjesec sa 3 slova."
						+ " Npr. za Januar unesite Jan");
				mjesec = input.nextLine();
			}
		}
		
		input.close();
	}
}
