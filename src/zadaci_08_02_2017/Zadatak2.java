package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string");
		
		String str = unos.nextLine();

		int duzina = str.length()-1;
		
		//brojac samoglasnika
		int brojac = 0;
		//brojac suglasnika
		int brojac2 = 0;
		
		//prolazimo kroz string
		for (int i=0; i<=duzina; i++){
			//provjeravamo da li je karakter slovo
			if(Character.isLetter(str.charAt(i))){
				if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o' || str.toLowerCase().charAt(i) == 'u'){
					brojac++;
				}
				else {
					brojac2++;
					}
				}
				
		}
		//ispisujemo broj samoglasnika
		System.out.println("Broj samoglasnika " + brojac);
		//ispisujemo broj suglasnika
		System.out.println("Broj suglasnika " + brojac2);
	}

}