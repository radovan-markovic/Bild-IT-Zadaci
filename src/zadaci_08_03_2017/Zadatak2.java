package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int brojac = 0;
		boolean test = true;
		
		while(test) {//testiramo unos
			
			try {
				System.out.println("Unesite 5 brojeva:");
				while(brojac < 5) {
					int broj = input.nextInt();
					list.add(broj);
					brojac++;
				}
				
				test = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}
			
		}
		input.close();
		
		 sort(list);
	}
	
	//metoda za sortiranje liste
	public static void sort(ArrayList<Integer> list){
		Collections.sort(list);
		System.out.println("Sortirana lista: " +  list);
	}

}
