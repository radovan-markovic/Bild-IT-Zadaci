package zadaci_22_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long broj = 0;
		boolean test = true;
		
		while (test){//testiramo unos
			try{
				System.out.println("Unesite broj:");
				broj = input.nextLong();
				input.nextLine();
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, morate unijeti broj");
				input.nextLine();
			}
		}
		
		//izracunavamo apsolutnu vrijednost broja ukoliko unesemo negativan broj
		broj = Math.abs(broj);
		
		//pozivamo metodu za sabiranje cifara i ispisujemo sumu
		System.out.println("Suma cifara unesenog broja je: " + sumDigits(broj));
		
		input.close();
	}
	
	// metoda koja sabira cifre broja
	static int sumDigits(long n) {
			
			int suma = 0;
	
			while(n != 0) {
			suma += n % 10;
			n /= 10;
			}
			return suma;
		}

}
