package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> listRedovi = new ArrayList<>();
		ArrayList<Integer> listKolone = new ArrayList<>();
		boolean test = true;
		int broj = 0;

		while (test) {// testiramo unos

			try {
				System.out.println("Unesite broj koji ce odrediti broj redova i kolona:");
				while (broj <= 0 || broj >= 100) {
					System.out.println("Broj treba biti veci od 0 i manji od 100:");
					broj = input.nextInt();
				}
				test = false;
			} catch (InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}

		}
		input.close();

		for (int i = 0; i < broj; i++) {
			for (int j = 0; j < broj; j++) {
				int random = (int) (Math.random() * 2);
				listRedovi.add(random);
				listKolone.add(random);
			}
		}

		// ispisujemo matricu
		System.out.println("Nasumicno dobijena matrica: ");
		for (int j = 1; j <= broj * broj; j++) {
			System.out.print(listRedovi.get(j - 1) + " ");
			if (j % broj == 0) {
				System.out.println();
			}
		}
		System.out.println();

		int sumaReda = 0;
		int temp = 0;
		int indexReda = 0;

		// racunamo sumu reda i pronalazimo na kom se indeksu nalazi najveca
		// suma reda
		int a = 0;
		for (int i = 0; i < broj; i++) {
			for (int j = a; j < broj + a; j++) {
				sumaReda = sumaReda + listRedovi.get(j);
			}
			if (sumaReda > temp) {
				temp = sumaReda;
				indexReda = i;

			}
			sumaReda = 0;
			a = a + broj;
		}
		// ispisujemo najvecu sumu
		System.out.print("Najveca suma reda je na indeksu: " + indexReda);
		a = 0;

		// prolazimo jos jednom kroz matricu i trazimo da li jos neki red
		// sadrzi istu sumu
		for (int i = 0; i < broj; i++) {
			for (int j = a; j < broj + a; j++) {
				sumaReda = sumaReda + listRedovi.get(j);
			}
			if (sumaReda == temp && indexReda != i) {
				temp = sumaReda;
				System.out.print(", " + i);

			}
			sumaReda = 0;
			a = a + broj;
		}

		int sumaKolone = 0;
		int indexKolone = 0;
		temp = 0;
		// racunamo sumu kolone i pronalazimo na kom se indeksu nalazi najveca
		// suma kolone
		a = 0;
		for (int i = 0; i < broj; i++) {
			for (int j = a; j < broj * broj; j += broj) {
				sumaKolone = sumaKolone + listKolone.get(j);
			}
			if (sumaKolone > temp) {
				temp = sumaKolone;
				indexKolone = a;
			}
			sumaKolone = 0;
			a += 1;
		}
		// ispisujemo najvecu sumu
		System.out.print("\nNajveca suma kolone je na indeksu: " + indexKolone);
		
		//prolazimo jos jednom kroz matricu i ispiujemo i ostale kolone koje imaju istu sumu
		a = 0;

		for (int i = 0; i < broj; i++) {
			for (int j = a; j < broj * broj; j += broj) {
				sumaKolone = sumaKolone + listKolone.get(j);
			}
			if (sumaKolone == temp && a != indexKolone) {
				temp = sumaKolone;
				indexKolone = a;
				System.out.print(", " + indexKolone);
			}
			sumaKolone = 0;
			a += 1;

		}
	}
}
