package zadaci_10_03_2017;

import java.util.Scanner;

public class Zadatak1 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite binarni broj: ");
		String binaryString = input.next();
		
		try {
			System.out.println("Decimalna vrijednost binarnog broja " + binaryString + " je " + binToDec(binaryString));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		
		input.close();
	}

	//metoda konvertuje binarni string u decimalan broj
	public static int binToDec(String binaryString) {

		long sum = 0;
		if(isBinary(binaryString)) {
			long broj = Long.parseLong(binaryString);
			long n = 0;

			while(broj != 0) {
				long b = broj % 10;
				sum += b * (Math.pow(2, n));
				n++;
				broj /= 10;
			}
		}
		return (int)sum;
	}

	//metoda provjerava da li je string binaran ili ne
	public static boolean isBinary(String binaryString) {
		boolean binarni = false;
		for(int i = 0; i < binaryString.length(); i++) {

			if(binaryString.charAt(i) == '1' || binaryString.charAt(i) == '0')
				binarni = true;
			else {
				binarni = false;
				throw new NumberFormatException("Broj " + binaryString.charAt(i) + " nije binaran broj.");
			}
				
		}
		return binarni;
}
}
