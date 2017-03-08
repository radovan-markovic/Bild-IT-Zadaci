package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int brojac = 0;
		boolean test = true;
		
		while(test) {//testiramo unos
			
			try {
				System.out.println("Unesite 10 brojeva:");
				while(brojac < 10) {
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
		
		removeDuplicate(list);
	}
	
	//metoda za uklanjanje duplikata iz liste
	public static void removeDuplicate(ArrayList<Integer> list){
		
		ArrayList<Integer> uniqueList = new ArrayList<>();
		
		for(int i = 0; i<list.size(); i++){
			if (!uniqueList.contains(list.get(i))){
				uniqueList.add(list.get(i));
			}
		}
		System.out.println("Jedinstveni elementi iz liste su: " +  uniqueList);
	}

}

