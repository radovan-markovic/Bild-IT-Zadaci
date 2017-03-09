package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int broj = 0;
		int broj2 = 0;
		boolean test = true;
		boolean test2 = true;
		boolean test3 = true;

		while (test) {// testiramo unos
			try {
				while (test2){
					System.out.println("Unesite prvi broj");
					broj = input.nextInt();
					input.nextLine();
					test2 = false;
				}
				while (test3){
					System.out.println("Unesite drugi broj");
					broj2 = input.nextInt();
					input.nextLine();
					test3 = false;
				}
				test = false;
			} catch (InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}

		}
		input.close();
		
		int suma = broj + broj2;
		
		//ispisujemo sumu dva broja
		System.out.println("Suma unesenih brojeva je: " + suma);
	}

}
