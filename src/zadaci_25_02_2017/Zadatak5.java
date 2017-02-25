package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean test = true;
		double niz[][] = new double[3][3];
		double niz2[][] = new double[3][3];

		while (test) {// testiramo unos u prvu matricu
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
		while (test) {// testiramo unos u drugu matricu
			System.out.println("Unesite 9 elementa u drugu matricu");
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
		double sum[][] = addMatrix(niz, niz2);
		
		//prolazimo kroz svaki element matrice i ispisujemo ga
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");
				
			}
			for (int j = 0; j < niz[i].length; j++) {
				if (i == 1){
					//provjeravamo brojac da bi smo ispisali znak
					if (brojacZnakaPlus == 1){
						System.out.print(" + ");
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
				System.out.print(sum[i][j] + " ");
			}
			
			System.out.println();
			
		}

	}
	
	//metoda koja vraca sumu matrice
	public static double[][] addMatrix(double[][] a, double[][] b) {

		double sum[][] = new double[3][3];
		
		//prolazimo kroz svaki element matrice i sabiramo elmente na istim mjestima u matrici
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		return sum;
	}

}
