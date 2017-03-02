package zadaci_02_03_2017;

import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		double x = 0;
		double y = 0;
		boolean test = true;

		while (test) {// pravimo provjeru za unos
			try {
				System.out.println("Unesite a");
				a = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite b");
				b = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite c");
				c = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite d");
				d = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite e");
				e = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite f");
				f = unos.nextDouble();
				unos.nextLine();

				test = false;
			} catch (Exception ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				unos.nextLine();
			}
		}
		unos.close();

		LinearEquation le = new LinearEquation(a, b, c, d, e, f);

		// provjeravamo da li je jednacina rjesiva
		if (le.isSolvable()) {
			x = le.getX();
			System.out.println("x = " + x);
			y = le.getY();
			System.out.println("y = " + y);
		} else {
			System.out.println("Jednacina je nerjesiva.");
		}

	}

}
