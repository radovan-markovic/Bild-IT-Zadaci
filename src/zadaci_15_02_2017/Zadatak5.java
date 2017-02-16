package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static boolean password(String str) {

		int duzina = str.length();
		boolean password = true;

		int brojac = 0;
		// provjeravamo duzinu
		if (duzina >= 8) {
			int a = 0;
			//prolazimo kroz string
			for (int i = a; i < duzina; i++) {
				//provjera da li je string sacinjen od slova i brojeva
				if (Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
						//brojimo slova u stringu
						if (Character.isDigit(str.charAt(i))) {
							brojac++;
						}

					} else {
						password = false;
						break;
					}				
				
			}
			if (password){
				//ako je provjera zadovoljena password je ispravan
				if (brojac >= 2 && password) {
					return true;
				} else {
					return false;
				}
			}

		} else {
			return false;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password:");

		String str = input.nextLine();

		if (password(str)){
			System.out.println("Password je validan");
		}else{
			System.out.println("Password nije validan.");
		}
		
		input.close();
	}

}
