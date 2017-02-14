package zadaci_14_02_2017;

import java.util.Scanner;

//ispis karaktera na neparnim pozicijama
public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu:");
		String str = input.nextLine();
		
		//ispisujemo karaktere na nepranim pozicijiama
		for (int i = 0;  i<str.length(); i+=2){
			System.out.print(str.charAt(i));
		}

	}

}
