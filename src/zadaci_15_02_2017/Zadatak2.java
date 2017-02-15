package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak2 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		int godina = 0;
		int mjesec = 0;
		
		while (test){//testiramo unos
			try{
				while (godina < 1){
					System.out.println("Unesite godinu:");
					godina = input.nextInt();
					input.nextLine();
				}
				while (mjesec < 1 || mjesec > 12){
					System.out.println("Unesite mjesec:");
					mjesec = input.nextInt();
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
		
		if (mjesec == 1){
			System.out.println("Januar " + godina + ". ima 31 dan");
		}
		//ako je godina prestupna Februar ima 29 dana
		if (mjesec == 2 && prestupna == 1){
			System.out.println("Februar " + godina + ". ima 29 dana");
		}
		if (mjesec == 2 && prestupna != 1){
			System.out.println("Februar " + godina + ". ima 28 dana");
		}
		if (mjesec == 3){
			System.out.println("Mart " + godina + ". ima 31 dan");
		}
		if (mjesec == 4){
			System.out.println("April " + godina + ". ima 30 dana");
		}
		if (mjesec == 5){
			System.out.println("Maj " + godina + ". ima 31 dan");
		}
		if (mjesec == 6){
			System.out.println("Jun " + godina + ". ima 30 dana");
		}
		if (mjesec == 7){
			System.out.println("Jun " + godina + ". ima 31 dan");
		}
		if (mjesec == 8){
			System.out.println("Avgust " + godina + ". ima 31 dan");
		}
		if (mjesec == 9){
			System.out.println("Septembar " + godina + ". ima 30 dana");
		}
		if (mjesec == 10){
			System.out.println("Oktobar " + godina + ". ima 31 dan");
		}
		if (mjesec == 11){
			System.out.println("Novembar " + godina + ". ima 30 dana");
		}
		if (mjesec == 12){
			System.out.println("Decembar " + godina + ". ima 31 dan");
		}
		input.close();
	}
}
