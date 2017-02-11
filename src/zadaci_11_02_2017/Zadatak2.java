package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		boolean test = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj od 9 cifara:");
		//pamtimo broj kao string da bi imali 0 na pocetku broja
		String broj = input.nextLine();

		//provjeravamo unos
		String provjeriDuzinu = broj+"";

		while (provjeriDuzinu.length() != 9){
			System.out.println("Pogresan unos, unesite 9 brojeva:");
			broj = input.nextLine();
			provjeriDuzinu = broj+"";

			for (int j = 0; j<broj.length(); j++){
				if (Character.isLetter(broj.charAt(j))){
					System.out.println("Pogresan unos, unesite  9 brojeva:");
					broj = input.nextLine();
					provjeriDuzinu = broj+"";
				}
			}
		}	

		int suma = 0;
		int index = 0;
		
		//prolazimo kroz svaku cifru broja i dodajemo je u sumu
		for (int i = 1; i<=broj.length(); i++){
			int cifra = Integer.parseInt(broj.charAt(index)+"");
			suma = (cifra * i) + suma;
			index++;
		}
		//ako rezultat 10 dodajemo X na kraju ISBN broja
		if (suma % 11 == 10) {
			System.out.println(broj + "X");
		}
		//ako nije, dodajemo dobijeni broj od modula 11
        else {
        	int checkSum = suma % 11;
        	System.out.println(broj+""+checkSum);
        }
	}

}
