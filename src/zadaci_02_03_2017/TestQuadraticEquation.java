package zadaci_02_03_2017;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
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
				test  =false;
			} catch (Exception e) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				unos.nextLine();
			}
		}

		// testiramo kvadratnu jednacinu
		QuadraticEquation qe = new QuadraticEquation(a, b, c);

		// racunamo diskriminantu
		qe.getDiscriminant();

		// ako je rezultat pozitivan prikazujemo dva rjesenja
		if (qe.getDiscriminant() > 0) {
			System.out.println(qe.getRoot1() + " " + qe.getRoot2());
		}
		// ako je rezultat jednak 0 prikazujemo jedno rjesenje
		if (qe.getDiscriminant() == 0) {
			System.out.println(qe.getRoot1());
		}
		// ako je rezultat manji od nule nema pravih rjesenja
		if (qe.getDiscriminant() < 0) {
			System.out.println("Nema pravih rješenja");
		}

		unos.close();

	}

}
