package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int brojac = 0;
		
		System.out.println("Unesite string:");
		String str = input.nextLine();
		System.out.println("Unesite karakter:");
		char ch = input.next().charAt(0);
		
		//prolazimo kroz string i poredimo svaki karakter u stringu sa unesenim karakterom
		for(int i = 0; i<str.length(); i++){
			if (str.charAt(i) == ch){
				brojac++;
			}
		}
		
		//ispisujemo broj pojavljivanja karaktera
		System.out.println("Karakter " + ch + " se pojavljuje " + brojac + " puta.");
		
		input.close();

	}

}
