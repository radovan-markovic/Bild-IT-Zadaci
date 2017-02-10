package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;
//pronalazenje najveceg elementa u 2D nizu
public class Zadatak4 {
	public static int[] locateLargest(double[][] a){
		
		//pravimo niz koji ce sadrzati indeks najveceg elementa
		int largest [] = new int [2];
		double max = 0;
		
		//prolazimo kroz 2D niz sa petljom
		for (int i = 0; i<a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if (a[i][j] > max){
					max = a[i][j];
					//upisujemo indeks reda
					largest[0]=i;
					//upisujemo indeks kolone
					largest[1]=j;
				}
			}
		}
		//vracamo indekse najveceg elementa u nizu
		return largest;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//unosimo koliko zelimo redova u 2D nizu
		System.out.println("Unesite broj redova");
		int redovi = input.nextInt();
		
		//unosimo koliko zelimo kolona u 2D nizu
		System.out.println("Unesite broj kolona");
		int kolone = input.nextInt();
		
		double niz[][] = new double [redovi][kolone];
		
		//punimo niz
		System.out.println("Unesite elemente niza:");
		for (int i = 0; i<niz.length; i++){
			for (int j = 0; j < niz[i].length; j++){
				niz[i][j] = input.nextDouble();
			}
		}
		
		//ispisujemo niz
		for (int i = 0; i<niz.length; i++){
			for (int j = 0; j < niz[i].length; j++){
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		
		//pozivamo metodu koja pronalazi najveci element u nizu
		int rezultat[] = locateLargest(niz);
		System.out.println();
		System.out.println("Najveci element je na ideksima: " + Arrays.toString(rezultat));
	}
}
