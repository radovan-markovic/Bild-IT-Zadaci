package bonus_zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		boolean test = true;
		boolean test2 = true;
		boolean program = true;
		double broj1 = 0;
		double broj2 = 0;
		double broj3 = 0;
		int operacija = 0;

		Scanner input = new Scanner(System.in);

		while (program) {
			while (test) {
				try {//testiramo unos broja
					System.out.println("Unesite broj 1");
					broj1 = Double.parseDouble(input.nextLine());
					test = false;
				} catch (Exception e) {
					System.out.println("Pogresan unos unesite ponovo:");
				}
			}
			test = true;
			while (test){
				try {
					System.out.println("Izaberite operaciju:");
					System.out.println("1 - sabiranje");
					System.out.println("2 - oduzimanje");
					System.out.println("3 - mnozeneje");
					System.out.println("4 - dijeljenje");
					System.out.println("5 - modularno dijeljenje");
					System.out.println("6 - korijeneovanje");
					System.out.println("7 - kvadriranje");
					System.out.println("0 - izlaz");
					operacija = Integer.parseInt(input.nextLine());
					test = false;
	
				} catch (Exception e) {
					System.out.println("Nepravilan unos, uneiste 1, 2, 3... ili 4");
				}
			}
			test2 = true;
			if (operacija == 1) { // sabiranje
				while (test2) {
					try {
						System.out.println("Unesite drugi broj za sabiranje:");
						broj2 = Double.parseDouble(input.nextLine());
						test2 = false;
					} catch (Exception e) {
						System.out.println("Ponovite unos:");
					}

				}
				double rezultat = broj1 + broj2;
				System.out.println(rezultat);
				test = true;

			}
			test2 = true;
			if (operacija == 2) { //oduzimanje
				while (test2) {
					try {
						System.out.println("Unesite drugi broj za oduzimanje:");
						broj2 = Double.parseDouble(input.nextLine());
						test2 = false;
					} catch (Exception e) {
						System.out.println("Ponovite unos:");
					}

				}
				double rezultat = broj1 - broj2;
				System.out.println(rezultat);
				test = true;
			}
			test2 = true;
			if (operacija == 3) { // mnozenje
				while (test2) {
					try {
						System.out.println("Unesite drugi broj za mnozenje:");
						broj2 = Double.parseDouble(input.nextLine());
						test2 = false;
					} catch (Exception e) {
						System.out.println("Ponovite unos:");
					}

				}
				double rezultat = broj1 * broj2;
				System.out.println(rezultat);
				test = true;
			}
			test2 = true;
			if (operacija == 4) { // dijeljenje
				while (test2) {
					try {
						System.out.println("Unesite drugi broj za dijeljenje:");
						broj2 = Double.parseDouble(input.nextLine());
						test2 = false;
					} catch (Exception e) {
						System.out.println("Ponovite unos:");
					}

				}
				double rezultat = broj1 / broj2;
				System.out.println(rezultat);
				test = true;
			}
			test2 = true;
			if (operacija == 5) { //modul
				while (test2) {
					try {
						System.out.println("Unesite drugi broj za racunanje modula:");
						broj2 = Double.parseDouble(input.nextLine());
						test2 = false;
					} catch (Exception e) {
						System.out.println("Ponovite unos:");
					}

				}
				double rezultat = broj1 % broj2;
				System.out.println(rezultat);
				test = true;
			}
			test2 = true;
			if (operacija == 6) { //korijen broja
				double rezultat = Math.sqrt(broj1);
				System.out.println(rezultat);
				test = true;
			}
			test2 = true;
			if (operacija == 7) { // kvadriranje
				while (test2) {
					try {
						System.out.println("Unesite drugi broj za stepenovanje:");
						broj2 = Double.parseDouble(input.nextLine());
						test2 = false;
					} catch (Exception e) {
						System.out.println("Ponovite unos:");
					}

				}
				double rezultat = Math.pow(broj1, broj2);
				System.out.println(rezultat);
				test = true;
			}
			if (operacija == 0){ 
				System.exit(1);
			}

		}
	}

}
