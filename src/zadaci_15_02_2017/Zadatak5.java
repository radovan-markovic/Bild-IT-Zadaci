package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void password(String str) {

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
						System.out.println("Nije validan password");
						password = false;
						break;
					}				
				
			}
			if (password){
				//ako je provjera zadovoljena passwor je ispravan
				if (brojac >= 2 && password) {
					System.out.println("Password je validan");
				} else {
					System.out.println("Nije validan password");
				}
			}

		} else {
			System.out.println("Nije validan password");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password:");

		String str = input.nextLine();

		password(str);
		
		input.close();
	}

}
