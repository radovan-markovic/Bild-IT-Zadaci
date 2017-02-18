package zadaci_18_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System .in);
		
		System.out.println("Unesite prvi grad:");
		String grad1 = input.nextLine();
		System.out.println("Unesite drugi grad:");
		String grad2 = input.nextLine();
		System.out.println("Unesite treci grad:");
		String grad3 = input.nextLine();
		
		//stavljamo unose u niz
		String[] niz = {grad1, grad2, grad3};
		//sortiramo niz
		Arrays.sort(niz);
		
		System.out.println("Gradovi po abecednom redu su:");
		System.out.println(niz[0]);
		System.out.println(niz[1]);
		System.out.println(niz[2]);
		
		input.close();

	}

}
