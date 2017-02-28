package zadaci_28_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;

		double[][] niz = new double[3][3];

		while (test) {// testiramo unos u matricu
			System.out.println("Unesite 9 elementa u matricu");
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
		input.close();
		
		//pravimo nova tri niza
		double[] kopija1 = new double [3];
		double[] kopija2 = new double [3];
		double[] kopija3 = new double [3];
		
		int brojac = 0;
		//smjestamo svaki red u 1D niz
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (brojac < 3){
					kopija1[j] = niz[i][j];
				}
				if (brojac >= 3 && brojac <6){
					kopija2[j] = niz[i][j];
				}
				if (brojac >= 6 && brojac < 9){
					kopija3[j] = niz[i][j];
				}
				brojac++;
			}
		}
		//sortiramo nizove
		Arrays.sort(kopija1);
		Arrays.sort(kopija2);
		Arrays.sort(kopija3);
		//upisujemo nizove u 2D niz
		double[][]rezultat = {{kopija1[0], kopija1[1], kopija1[2]},
						      {kopija2[0], kopija2[1], kopija2[2]},
		                      {kopija3[0], kopija3[1], kopija3[2]}};
		//ispisujemo sortiranu matricu
		System.out.println("Sortirana matrica:");
		for (int i = 0; i < rezultat.length; i++) {
			for (int j = 0; j < rezultat[i].length; j++) {
				System.out.print(rezultat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
