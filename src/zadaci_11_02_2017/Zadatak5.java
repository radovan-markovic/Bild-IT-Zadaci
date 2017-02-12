package zadaci_11_02_2017;

import java.util.Arrays;
import java.util.Scanner;

//brojevi u nizu iznad i ispod prosjeka
public class Zadatak5 {
	
public static void main(String[] args) {
		
		boolean test = true;
		//kreiramo niz za unos do 100 brojeva
		double[] niz = new double [100];
		
		double suma = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite brojeve: ");
		
		int i = 0;
		
		while(test){//pravimo provjeru za unos
			try{
				//unosimo brojeve u niz
				double unos = input.nextDouble();
				
				//ako je uno jednak 0 prekida se unosu niz
				while (unos != 0){
					niz[i] = unos;
					suma = suma + niz[i];
					i++;
					unos = input.nextDouble();
					if (unos == 0){
						test = false;
					}
				}
			}catch(Exception e){
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}		
		int brojac = 0;
		
		//provjeravamo koliko imamo unesenih brojeva u niz
		for (int k = 0; k<niz.length; k++){
			if (niz[k] != 0){
				brojac++;
			}
		}
		
		//racunamo prosjek
		double prosjek = suma / brojac;
		
		System.out.println("Prosjek je: " + prosjek);
		
		int brojacIznadProsjeka = 0;
		//trazimo brojeve koji su jednaki ili iznad prosjeka
		for (int j= 0; j < niz.length; j++){
			if (niz[j] >= prosjek && niz[j] != 0){
				brojacIznadProsjeka++;
			}
		}
		
		System.out.println("Brojevi u nizu su: " + Arrays.toString(niz)); //ispis niza
		
		System.out.println("Broj brojeva koji su jednaki prosjeku ili iznad prosjeka je: " + brojacIznadProsjeka);
		
		int brojacIspodProsjeka = 0;
		//trazimo brojeve ispod prosjeka
		for (int k= 0; k < niz.length; k++){
			if (prosjek>niz[k] && niz[k] != 0){
				brojacIspodProsjeka++;
			}
		}
		
		System.out.println("Broj brojeva ispod prosjeka je: " + brojacIspodProsjeka);
	}

}
