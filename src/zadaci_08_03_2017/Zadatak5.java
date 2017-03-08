package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int brojac = 0;
		int brojac2 = 0;
		boolean test = true;
		
		while(test) {//testiramo unos
			
			try {
				System.out.println("Unesite 5 brojeva u prvu listu:");
				while(brojac < 5) {
					int broj = input.nextInt();
					list1.add(broj);
					brojac++;
				}
				System.out.println("Unesite 5 brojeva u drugu listu:");
				while(brojac2 < 5) {
					int broj = input.nextInt();
					list2.add(broj);
					brojac2++;
				}
				
				test = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}
			
		}
		input.close();
		
		System.out.println("Spojene elementi iz obje liste: " + union(list1, list2));
	}
	
	//metoda spaja liste
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		for(int i = 0; i<list2.size(); i++){
			
			list1.add(list2.get(i));
		}
		
		return list1;
		
	}

}
