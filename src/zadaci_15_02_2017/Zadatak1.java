package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int broj1 = (int)(Math.random()*10);
		int broj2 = (int)(Math.random()*10);
		int broj3 = (int)(Math.random()*10);
		int rezultat = broj1 + broj2 + broj3;
		boolean test = true;
		
		while (test){//provjeravamo unos
			System.out.println("Koliko je " + broj1 + " + " + broj2 +" + "+broj3 + "?");
			try{
				int unos = input.nextInt();
				input.nextLine();
				while (rezultat != unos){ // ako rezultat nije jednak unosu unosimo novi broj
					System.out.println("Netacno, koliko je " + broj1 + " + " + broj2 +" + "+broj3 + "?");
					unos = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch(Exception e){//ako unos nije broj ispisujemo poruku
				System.out.println("Netacan unos, unesite broj.");
				input.nextLine();
			}
		}
		System.out.println("Cestitamo! Tacan odgovor, rezultat je: " + rezultat);
		input.close();
	}

}
