package zadaci_02_03_2017;

import java.util.Scanner;

public class TestIntersectingPoint {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double x3 = 0;
		double y3 = 0;
		double x4 = 0;
		double y4 = 0;
		boolean test = true;

		while (test) {// pravimo provjeru za unos
			try {
				System.out.println("Unesite x1");
				x1 = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite y1");
				y1 = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite x2");
				x2 = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite y2");
				y2 = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite x3");
				x3 = unos.nextDouble();
				unos.nextLine();

				System.out.println("Unesite y3");
				y3 = unos.nextDouble();
				unos.nextLine();
				
				System.out.println("Unesite x4");
				x4 = unos.nextDouble();
				unos.nextLine();
				
				System.out.println("Unesite y4");
				y4 = unos.nextDouble();
				unos.nextLine();

				test = false;
			} catch (Exception ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				unos.nextLine();
			}
		}
		unos.close();
		
		//racunamo tacke
		IntersectingPoint ip = new IntersectingPoint();
		ip.getIntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);

		if (ip.isSolvable()) {
			System.out.println("Tacka je na: (" + ip.getX() + ", " + ip.getY() + ")");
		} 
		else {
			System.out.println("Dvije linije su paralelne.");
		}




	}

}
