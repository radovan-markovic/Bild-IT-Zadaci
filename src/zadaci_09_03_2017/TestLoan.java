package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

import zadaci_07_03_2017.Loan;

public class TestLoan {
	
	public static void main(String[] args) {
		
		//testiramo Loan klasu
		
		Scanner input = new Scanner(System.in);
		double amount = 0;
		double interestRate = 0;
		int numberOfYears = 0;
		boolean test = true;
		
		while (test){
		try {
			System.out.println("Unesite iznos pozajmice, godisnju kamatnu stopu i broj godina: ");
			amount = input.nextDouble();
			interestRate = input.nextDouble();
			numberOfYears = input.nextInt();
			Loan l = new Loan(interestRate, numberOfYears, amount);
			System.out.println(l.toString());
			test = false;
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Nepravilan unos, unesite ponovo:");
			input.nextLine();
		}
		}
		
		input.close();
		
		
		
	}
}
