package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite karakter: ");
		char ch = input.next().charAt(0);
		
		//pretvaramo karakter u broj
		int broj = (int)ch;
		//ispisujemo unicode za dati karakter
		System.out.println("Unicode za dati karakter je: " + broj);

		input.close();
	}

}
