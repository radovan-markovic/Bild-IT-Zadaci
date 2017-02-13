package zadaci_13_02_2017;

import java.util.Scanner;

//prebroj slova u stringu
public class Zadatak5 {
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String str="";
		
		System.out.println("Unesite string:");
		str = input.nextLine();
		
		//pozivamo metodu koja vraca broj slova u stringu
		System.out.println("Broj slova u stringu je: " + countLetters(str));
	}
	
	//metoda koj vraca broj slova u stringu
	public static int countLetters(String s){
		int brojacSlova = 0;
		
		//prolazimo kroz svaki karakter stringa
		for (int i = 0; i<s.length(); i++){
			//ako je karakter slovo inkrementiramo brojac
			if (Character.isLetter(s.charAt(i))){
				brojacSlova++;
			}
		}
		//vracamo broj slova
		return brojacSlova;
	}
}
