package zadaci_09_03_2017;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int[] niz = new int[100];
		
		//punimo niz
		for (int i = 0; i<niz.length; i++){
			niz[i] = (int)(Math.random()*10);
		}
		
		Scanner input = new Scanner(System.in);
		int broj = 0;
		boolean test = true;

		while (test) {// testiramo unos

			try {
				System.out.println("Unesite broj od 0 do 99:");
				broj = input.nextInt();
				test = false;
			} catch (InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}

		}
		input.close();
		
		//pokusavamo ispisati niz na zeljenom indeksu
		try{
			System.out.println("Elemenat niza na indeksu "+ broj + " je: " + niz[broj]);
			System.out.println("Ovako izgleda niz:");
			System.out.println(Arrays.toString(niz));
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of Bounds.");
		}

	}

}
