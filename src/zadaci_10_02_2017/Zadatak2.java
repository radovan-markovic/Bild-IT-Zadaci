package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;

//pronalazenje najmanjeg elementa u nizu
public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[]niz = new double[10];
		
		System.out.println("Unesite 10 elemenata u niz:");
		//punimo niz
		for(int i = 0; i<niz.length; i++){
			niz[i] = input.nextDouble();
		}
		
		//ispisujemo najmanji element u nizu
		System.out.println("Najmanji element u nizu je: " + min(niz));

	}
	
	public static double min(double[] array){
		
		//sortiramo niz
		Arrays.sort(array);
		
		//posle sortiranja najmanji niz je na indeksu 0
		double min = array[0];
		
		//vracamo najmanji element u nizu
		return min;
		
	}

}
