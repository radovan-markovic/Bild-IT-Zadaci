package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean test = true;
		double niz[][] = new double[3][4];

		while (test) {//testiramo unos
			System.out.println("Unesite 12 elementa u matricu");
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
		
		//ispisujemo matricu
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j]);
			}
			System.out.println();
		}
		
		//pozivamo metodu i ispisujemo sumu svake kolone
		System.out.println("Suma kolone 0 je: " + sumColumn(niz, 0));
		System.out.println("Suma kolone 1 je: " + sumColumn(niz, 1));
		System.out.println("Suma kolone 2 je: " + sumColumn(niz, 2));
		System.out.println("Suma kolone 3 je: " + sumColumn(niz, 3));
		input.close();
		
	}
	
	//metoda koja vraca sumu kolone u matrici
	public static double sumColumn(double[][] m, int columnIndex){
		
		double sumaKolone = 0;
		//prolazimo kroz matricu i sabiramo elemente u istoj koloni
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				if (columnIndex == j){
					sumaKolone = sumaKolone + m[i][j];
				}
			}
		}
		
		return sumaKolone;
	}
}
