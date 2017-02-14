package zadaci_11_02_2017;

import java.util.Arrays;
import java.util.Scanner;

//sortiranje tri broja
public class Zadatak3 {

	public static void main(String[] args) {
		int x = 1;
		double broj1 = 0;
		double broj2 = 0;
		double broj3 = 0;
		Scanner input = new Scanner(System.in);
		
		while (x == 1){  // ako je input pogresan unosimo ponovo
				try {
					
					System.out.println("Unesite prvi broj: ");
					broj1 = Double.parseDouble(input.nextLine());
					
					System.out.println("Unesite drugi broj: ");
					broj2 = Double.parseDouble(input.nextLine());
					
					System.out.println("Unesite treci broj: ");
					broj3 = Double.parseDouble(input.nextLine());
					x = 0;
				}
				catch (Exception e) {
					System.out.println("Pogresan unos, unesite ponovo:");
				}
			
		 } 
				
		displaySortedNumbers(broj1, broj2, broj3); // method calling
		
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		
		//kreikramo niz u koji smjestamo brojeve
		double[] niz = new double[3];
		niz[0] = num1;
		niz[1] = num2;
		niz[2] = num3;
		
		//sortiramo niz
		Arrays.sort(niz);
		
		//ispisujemo niz po rastucem redoslijedu
		for (int i = 0; i<niz.length; i++){
			System.out.print(niz[i] + " ");
		}
	}

}
