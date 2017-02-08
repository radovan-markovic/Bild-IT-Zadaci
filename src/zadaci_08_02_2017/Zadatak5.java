package zadaci_08_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5 {

	//pronalazenje najveceg broja u nizu i broj ponavljanja tog broja
	public static void main(String[] args) {
		
		//kreiramo niz za unos 20 brojeva
		int[] niz = new int [20];
		
		Scanner input = new Scanner(System.in);
		
		//punimo niz brojevima
		System.out.println("Unesite broj:");
		int unos = input.nextInt();
		
		int i = 0;
		
		while (unos != 0){
			niz[i] = unos;
			i++;
			System.out.println("Unesite novi broj:");
			unos = input.nextInt();
		}
		
		//trazimo najveci clan u nizu
		int max = 0;
		//pravimo brojac da izbrojimo koliko se puta najveci broj ponovio u nizu
		int brojac = 0;
		
		//prolazimo kroz niz i provjeravamo koji je broj veci
		for(int j = 0; j<niz.length; j++){
			if (niz[j] == max){
				brojac++;
			}
			if (niz[j] > max){
				max = niz[j];
				brojac = 0;
				brojac++;
			}
		}
		
		//ispis najveceg broja
		System.out.println("Najveci broj u nizu je: " + max);
		//ispis ponavljanja najveceg broja
		System.out.println("Ponovio se " + brojac + " puta.");
	}

}

