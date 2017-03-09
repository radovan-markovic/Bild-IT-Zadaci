package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tacke = 0;
		double[] xTacke;
		double[] yTacke;

		while (true) {

			try {//testiramo unos
				System.out.print("Unesite broj tacaka: ");
				tacke = input.nextInt();
				while (tacke <= 4 || tacke >= 10) {
					System.out.println("Broj mora biti izmedju 4 i 10: ");
					tacke = input.nextInt();
				}
				xTacke = new double[tacke];
				yTacke = new double[tacke];

				for (int i = 0; i < tacke; i++) {
					System.out.print((i + 1) + " Unesite x-koordinate: ");
					xTacke[i] = input.nextDouble();
					System.out.print((i + 1) + " Unesite y-koordinate: ");
					yTacke[i] = input.nextDouble();
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo: ");
				input.nextLine();
			}
		}

		System.out.println("\nPovrsina konveksnog poligona je: " + getAreaOfConvexPolygon(xTacke, yTacke, tacke));
		input.close();
	}

	//metoda vraca povrsinu konveksnog poligona
	public static double getAreaOfConvexPolygon(double[] x, double[] y, int tacke) {

		double povrsina = 0;
		int j = tacke - 1;

		for (int i = 0; i < tacke; i++) {
			povrsina += ((x[j] + x[i]) * (y[j] - y[i]));
			j = i;
		}
		return povrsina / 2;
	}

}
