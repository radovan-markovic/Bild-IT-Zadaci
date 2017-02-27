package zadaci_27_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak2 {

public static double[][] multiplyMatrix(double[][] matrica1, double[][] matrica2){
		
		double suma = 0;
		double rezultat[][] = new double [matrica1.length][matrica1[0].length];
		
		//uvodimo nove brojace kako bismo mogli smjestati privremene rezultate
		//i kako bismo mogli vrsiti pomjeranje po matrici
		int r = 0;
		int k = 0;
		int i= 0;
		int m = 0;
		int brojac = 0;
		int brojac2 = 0;
		int brojac3 = 0;
		
		//racunanje prvog reda matrice
		while (brojac < 3){
		
			for (int j =0; j < matrica1.length;){
				for (int s= 0; s<matrica2.length;){
					suma = suma + matrica1[i][j] * matrica2[s][m];
					rezultat[r][k] = suma;
					j++;
					s++;
					}
				
				}
			suma = 0;
			
			if (brojac <= 2){
				i=0;
				m++;
				k++;
			}
			
			brojac++;
		}
		
		//racunanje drugog reda matrice
		i = 1;
		r = 1;
		m = 0;
		k = 0;
		
		while (brojac2 < 3){

			for (int j =0; j < matrica1.length;){
				for (int s= 0; s<matrica2.length;){
					suma = suma + matrica1[i][j] * matrica2[s][m];
					rezultat[r][k] = suma;
					
					j++;
					s++;
					
					}
				
				}
			suma = 0;
			
			if (brojac2 <= 2){
				i=1;
				m++;
				k++;
			}
			brojac2++;
		}
		
		//racunanje treceg reda matrice
		i = 2;
		r = 2;
		m = 0;
		k = 0;
		
		while (brojac3 < 3){

			for (int j =0; j < matrica1.length;){
				for (int s= 0; s<matrica2.length;){
					suma = suma + matrica1[i][j] * matrica2[s][m];
					rezultat[r][k] = suma;
					
					j++;
					s++;
					
					}
				
				}
			suma = 0;
			
			if (brojac3 <= 2){
				i=2;
				m++;
				k++;
			}
			brojac3++;
		}
		
		return rezultat;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		
		double[][] niz = new double[3][3]; 
		double[][] niz2 = new double[3][3]; 
		
		while (test) {//testiramo unos u prvu matricu
			System.out.println("Unesite 9 elementa u prvu matricu");
			try {
				for (int i = 0; i < niz.length; i++) {
					for (int j = 0; j < niz[i].length; j++) {
						System.out.println("Unesite broj u matricu:");
						niz[i][j] = input.nextDouble();
						input.nextLine();
					}
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		
		test = true;
		
		while (test) {//testiramo unos u drugu matricu
			System.out.println("Unesite 9 elementa u drugu matricu matricu");
			try {
				for (int i = 0; i < niz2.length; i++) {
					for (int j = 0; j < niz2[i].length; j++) {
						System.out.println("Unesite broj u matricu:");
						niz2[i][j] = input.nextDouble();
						input.nextLine();
					}
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		
		input.close();
		
		int brojacZnakaPlus = 1;
		int brojacZnakaJednako = 1;
		//pozivamo metodu za sumu matrice i smjestamo sumu u niz sum
		double result[][] = multiplyMatrix(niz, niz2);
		
		//prolazimo kroz svaki element matrice i ispisujemo ga
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");
				
			}
			for (int j = 0; j < niz[i].length; j++) {
				if (i == 1){
					//provjeravamo brojac da bi smo ispisali znak
					if (brojacZnakaPlus == 1){
						System.out.print(" * ");
						brojacZnakaPlus++;
					}
				}else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz2[i][j] + " ");
			}
			for (int j = 0; j < niz[i].length; j++) {
				if (i == 1){
					//provjeravamo brojac da bi smo ispisali znak
					if (brojacZnakaJednako == 1){
						System.out.print(" = ");
						brojacZnakaJednako++;
					}
				}else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(Double.parseDouble(new DecimalFormat("##.##").format(result[i][j])));
				System.out.print(" ");
			}
			
			System.out.println();
			
		}

	}

}
