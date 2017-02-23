package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite string:");
		String str = input.nextLine();
		
		//ispisujemo duzinu stringa
		System.out.println("Duzina stringa je: " + str.length());
		//ispisujemo prvi karakter szringa
		System.out.println("Prvi karakter u stringu je: " + str.charAt(0));
		input.close();
	}

}
