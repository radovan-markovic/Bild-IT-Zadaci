package zadaci_17_02_2017;

import java.util.Scanner;
//ispisi broj godina za svaku godinu
public class Zadatak1 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		int broj1 = 0;
		int broj2 = 0;
		
		while (test){//testiramo unos
			try{
				while (broj1 < 1){
					System.out.println("Unesite godinu:");
					broj1 = input.nextInt();
					input.nextLine();
				}
				while (broj2 < 1 || broj2 <= broj1){
					System.out.println("Unesite krajnju godinu, krajnja godina ne moze biti manja ili jednaka pocetnoj:");
					broj2 = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos unesite broj");
				input.nextLine();
			}
		}
		
		//koristimo for petlju da provjerimo broj dana za svaku godinu
		for (int i = broj1; i <= broj2; i++){
			//ispisujemo broj dana u godini pozivajuci metodu
			System.out.println("Godina " + i + ". ima " +  numberOfDayInAYear(i) + " dana.");
			
		}

		input.close();
	}

	//metoda koja vraca broj dana u godini
	public static int numberOfDayInAYear(int year){
		
		int prestupna = 0;
		
		if((year%4 == 0 && year%100!= 0) || (year%400 == 0)){
			prestupna = 1;
		}
		
		if (prestupna == 1){
			return 366;
		}
		return 365;
	}
}
