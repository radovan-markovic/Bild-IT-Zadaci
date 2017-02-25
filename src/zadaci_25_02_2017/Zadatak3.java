package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	
	//metoda koja provjerava da li se u nizu nalaze uzastopna ista 4 broja
	public static boolean isConsecutiveFour(int[] values) {

		int temp = values[0];
		int brojac = 0;
		
		//prolazimo kroz niz i inkrementujemo brojac ako su uzatopni brojevi isti
		for (int i = 0; i < values.length; i++) {
			if (values[i] == temp) {
				brojac++;
			} else {
				temp = values[i];
			}
		}
		if (brojac >= 4) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean test = true;
		int duzina = 0;
		
		while(test){//testiramo unos
			try{
				while (duzina < 4){
					System.out.println("Upisite koliko zelite brojeva u nizu (minimalno 4 broja):");
					duzina = input.nextInt();
					input.nextLine();
				}
				test = false;
				}catch (Exception e){
					System.out.println("Pogresan unos, unesite ponovo:");
					input.nextLine();
				}
			}

		int[] niz = new int[duzina];
		
		test = true;
		
		while(test){//testiramo unos
			System.out.println("Unesite " + duzina + " elementa u niz");
			try{
				for (int i = 0; i < niz.length; i++) {
				//unosimo elemente u niz	
				System.out.println("Unesite broj u niz:");
				niz[i] = input.nextInt();
				input.nextLine();
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		
		input.close();
		
		//pozivamo metodu i ispisujemo da li broj ima uzastopna 4 ista broja
		if (isConsecutiveFour(niz) == true) {
			System.out.println("Niz ima 4 ista uzastopna broja");
		} else {
			System.out.println("Niz nema 4 ista uzastopna broja");
		}
	}

}
