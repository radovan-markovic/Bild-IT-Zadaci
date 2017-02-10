package zadaci_10_02_2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite velicinu matrice, npr. 3 ce dati matricu 3x3");
		int matrica = input.nextInt();
		//definisemo velicinu 2D niza
		double niz[][] = new double [matrica][matrica];
		
		System.out.println("Unesite brojeve");
		//punimo 2D niz
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = input.nextDouble();
			}
		}
		//pozivamo metodu za sortiranje redova u matrici
		sortRows(niz);
	}
	
	public static double[][] sortRows(double[][] array){
		
		//kreiramo listu pomocu koje cemo sortirati redove
		ArrayList<Double> list = new ArrayList<>();
		
		//kreiramo listu pomocu koje cemo sortirati redove
		ArrayList<Double> listSorted = new ArrayList<>();
		
		//prolazimo kroz sve elemente u matrici 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				    //dodajemo svaki element u listu
					list.add(array[i][j]);
					//sortiramo svaki elemnt u listi
					Collections.sort(list);
					
				}
			//svaki sortirani red u listi kopiramo u novu listu
			for (int k = 0; k < list.size(); k++){
				listSorted.add(list.get(k));
			}
			//cistimo listu da bi mogli sortirati novi red
			list.clear();
		}
		
		//postavljamo sortirane elemente/redove iz liste u niz
		int brojac = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = listSorted.get(brojac);
				brojac++;
			}
		}
		//ispisujemo sortirane redove u nizu
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		return null;
	}
}
	
	
