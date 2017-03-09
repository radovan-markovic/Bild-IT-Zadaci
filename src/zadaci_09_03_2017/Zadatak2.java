package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int broj = 0;
		boolean test = true;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> uniqueElements = new ArrayList<>();

		while (test) {// testiramo unos

			try {
				while (broj <= 0) {
					System.out.println("Unesite broj m veci od nule:");
					broj = input.nextInt();
				}

				test = false;
			} catch (InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}

		}
		input.close();
		
		//dobijamo proste faktore od broja upisane u listu
		list = prostiFaktori(broj);
		//dobijamo jedinstvene brojeve u listi
		uniqueElements = removeDuplicate(list);
		
		int brojacPojavljivanjaBroja = 0;
		int rezultat = 1;
		
		//prolazimo kroz jedinstvene elmente liste i trazimo koliko se broj 
		//puta ponovio u stvarnoj listi (prosti faktori)
		//ako se broj ponovio neparan broj puta mnozimo brojeve kako bi smo dobili
		//
		for (int i = 0; i<uniqueElements.size(); i++){
			for (int j = 0; j<list.size(); j++){
				if (uniqueElements.get(i) == list.get(j)){
					brojacPojavljivanjaBroja++;
				}
			}
			if (brojacPojavljivanjaBroja % 2 != 0){
				rezultat = rezultat * uniqueElements.get(i);
			}
			brojacPojavljivanjaBroja = 0;
		}
		System.out.println("Najmanji broj n da bi m * n bio savrsen kvadrat je: " + rezultat);

	}

	// metoda vraca listu u kojoj su smjesteni prosti faktori broja
	public static ArrayList<Integer> prostiFaktori(int broj) {

		ArrayList<Integer> list = new ArrayList<>();

		int rezultat = 1;
		// postavljamo pocetno stanje djelilca
		int djelilac = 2;
		// pamtimo pocetno stanje broja
		int pocetnoStanje = broj;

		// vrsimo rastavljanje na proste faktore sve dok proizvod faktora ne
		// bude jednak broju koji smo unijeli
		if (broj == 0 || broj == 1) {
			System.out.println(broj);
		} else {
			while (rezultat != pocetnoStanje) {
				// provjeravamo da li se broj moze dijeliti, ako ne
				// inkrementujemo djelilac
				if (broj % djelilac == 0) {
					// ispisujemo prost faktor
					list.add(djelilac);
					// provjeravamo da li je proizvod djelilaca jednak unesenom
					// broju
					rezultat = rezultat * djelilac;
					// broj koji je podijeljen dijelimo ponovo i rastavljamo ga
					broj = broj / djelilac;
				} else {
					djelilac++;
				}
			}
		}

		return list;
	}
	
	//metoda za uklanjanje duplikata iz liste i vraca novu listu
		public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
			
			ArrayList<Integer> uniqueList = new ArrayList<>();
			
			for(int i = 0; i<list.size(); i++){
				if (!uniqueList.contains(list.get(i))){
					uniqueList.add(list.get(i));
				}
			}
			return uniqueList;
		}

}
