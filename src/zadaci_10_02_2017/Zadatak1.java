package zadaci_10_02_2017;

import java.util.Scanner;

//ispis brojeva po lniji od pocetne do krajnje vrijednosti
public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//definisemo pocetnu vrijednost
		System.out.println("Unesite pocetnu vrijednost:");
		int pocetnaVrijednost = input.nextInt();
		
		//definisemo krajnju vrijednost
		System.out.println("Unesite krajnju vrijednost:");
		int krajnjaVrijednost = input.nextInt();
		
		//definisemo koliko cemo ispisati brojeva u jednom redu
		System.out.println("Unesite koliko hocete brojeva da se ispise po liniji:");
		int brojBrojevaPoLiniji = input.nextInt();
		
		ispisiBrojeve(pocetnaVrijednost, krajnjaVrijednost, brojBrojevaPoLiniji);

	}
	
	public static void ispisiBrojeve(int pocetnaVrijednost, int krajnjaVrijednost, int brojBrojevaPoLiniji){
		
		int brojacIspisa = 0;
		//pomocu petlje ispisujemo zeljene brojeve od pocetne do krajnje vrijednosti
		for (int i = pocetnaVrijednost; i<= krajnjaVrijednost; i++){
			System.out.print(i+" ");
			brojacIspisa++;
			//pravimo novi red ako smo ispisali proslijedjeni broj brojeva po liniji
			if (brojacIspisa % brojBrojevaPoLiniji == 0){
				System.out.println();
			}
		}
	}

}
