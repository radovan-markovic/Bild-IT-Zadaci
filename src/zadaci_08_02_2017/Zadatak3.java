package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	// pronaci najveci zajednicki djelilac za dva cijela broja
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Unesite prvi broj: ");
		a = input.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		b = input.nextInt();
		
		//pozivamo metodu da nadjemo najveci zajednicki djelilac
		najveciZajednickiDjelilac(a, b);
		
	}
	
	public static void najveciZajednickiDjelilac(int a, int b){
		
		int manjiBroj = 0;
		
		//poredimo koji broj od unesenih je manji
		if (a <= b){
			manjiBroj = a;
		}else{
			manjiBroj = b;
		}
		
		//kroz petlju trazimo najveci zajednicki djelilac
		for (int i = manjiBroj; i >= 1; i--){
		
			if ((a % i == 0) && (b % i == 0)){
				System.out.println("Najveci zajednici djelilac za brojeve "
			+ a +" i "+ b + " je " +i);
				break;
			}
		}
	}

}
