package zadaci_07_03_2017;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		
		//tetsiramo klasu Triangle
		
		Scanner input = new Scanner(System.in);
		double side1 = 101;
		double side2 = 101;
		double side3 = 101;
		String color = "";
		boolean filled = false;
		
		boolean test = true;
		
		while(test){//pravimo provjeru za unos
			try{
				while (side1 < -100 || side1 > 100){
				System.out.println("Unesite stranicu 1, broj izmedju 100 i -100");				
				side1 = input.nextDouble();
				input.nextLine();
				}
				while (side2 < -100 || side2 > 100){
					System.out.println("Unesite stranicu 2, broj izmedju 100 i -100");				
					side2 = input.nextDouble();
					input.nextLine();
				}
				while (side3 < -100 || side3 > 100){
					System.out.println("Unesite stranicu 3, broj izmedju 100 i -100");				
					side3 = input.nextDouble();
					input.nextLine();
				}
				System.out.print("Unesite boju: ");
				color = input.next();
				
				System.out.print("Unesite boolean vrijednost da odlucite hoce li trougao biti"
						+ "popunjen ili ne: ");
				filled = input.nextBoolean();
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		input.close();
		
		Triangle triangle = new Triangle(color, filled, side1, side2, side3);
		
		System.out.println("\nPovrsina trougla je: " + triangle.getArea());
		System.out.println("Obim je: " + triangle.getPerimeter());
		System.out.println("Boja trougla: " + triangle.getColor());
		System.out.println("Da li je popunjen? " + triangle.isFilled());

	}

}
