package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	
public static void pitanja(int broj){
		
		int brojac = 0;
		int tacni = 0;
		int netacni = 0;
		int broj1 = 0;
		int broj2 = 0;
		int rezultat = 0;
		
		Scanner input = new Scanner(System.in);

		while (brojac < broj){
			//kreiramo prvi nasumicni broj
			broj1 = (int)(Math.random()*10);
			//kreiramo drugi nasumicni broj
			broj2 = (int)(Math.random()*10);
			
			System.out.println("Koliko je " + broj1 + " + " + broj2 + "?");
			int unos = input.nextInt();
			rezultat = broj1 + broj2;
			
			//inkrementiramo broj postavljenih pitanja za 1 kako bi kontrolisali petlju
			brojac++;
			
			//ako je rezultat odgovara tacan uvecavamo broj tacnih odgovora za 1, a ako ne
			//uvecavamo broj netacnih odgovora za 1
			if (unos == rezultat){
				tacni++;
			}else{
				netacni++;
			}
		}
		//ispisujemo broj tacnih i netacnih odgovora
		System.out.println("Tacnih odgovara: " + tacni);
		System.out.println("Netacnih odgovara: " + netacni);
		
	}

	public static void main(String[] args) {
		
		boolean test = true;
		Scanner input = new Scanner(System.in);
		int unos = 0;
		
		while(test){//pravimo provjeru za unos
			try{
				System.out.println("Koliko zelite pitanja:");
				unos = input.nextInt();
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		//prosljedjujemo metodi broj pitanja
		pitanja(unos);

	}

}
