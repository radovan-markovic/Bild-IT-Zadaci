package zadaci_03_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int broj = 0;
		
		while(true) { //testiramo unos
			
			try {
				while(broj < 2) {
					System.out.println("Unesite broj veci od 2: ");
					broj = input.nextInt();
					input.nextLine();
				}
				break;
			}
			catch(InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo ");
				input.nextLine();
			}
		}
		
		input.close();
		
		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 2; i <= broj; i++) {

			while (broj % i == 0) {
				stack.push(i); //ubacujemo faktor u stack
				broj /= i;
			}
		}

		//ispisujemo rezultate12
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}

	}

}
