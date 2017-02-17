package zadaci_16_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x1 = 91.0;
		double x2 = 91.0;
		double y1 = 181.0;
		double y2 = 181.0;
		boolean test = true;
		
		while (test){  // ako je input pogresan unosimo ponovo
			try {
				while (x1< -90 || x1 > 90){
					System.out.println("Unesite x1: ");
					x1 = input.nextDouble();
					input.nextLine();
				}
				while (y1< -180 || y1 > 180){
					System.out.println("Unesite y1: ");
					y1 = input.nextDouble();
					input.nextLine();
				}
				test = false;
			}
			catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		test = true;
		while (test){  // ako je input pogresan unosimo ponovo
			try {
				while (x2< -90 || x2 > 90){
					System.out.println("Unesite x2: ");
					x2 = input.nextDouble();
					input.nextLine();
				}
				while (y2< -180 || y2 > 180){
					System.out.println("Unesite y2: ");
					y2 = input.nextDouble();
					input.nextLine();
				}
				test = false;
			}
			catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		//prosjecni radius zemlje
		double radius = 6371.01;
		
		//racunamo radius pomocu formule
		double rezultat = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("\nGreat circle distanca iznosi: " + rezultat + " km");		
		input.close();

	}

}
