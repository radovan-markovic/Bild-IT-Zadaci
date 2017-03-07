package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxElementInArrayList {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int broj = 0;
		boolean test = true;
		
		while(test) {
			
			try {
				System.out.println("Unesite broj, 0 zavrsava unos: ");
				broj = input.nextInt();
				
				while(broj != 0) {
					list.add(broj);
					broj = input.nextInt();
				}
				
				test = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}
			
		}
		input.close();
		
		Integer max = max(list);
		if (max == null){
			System.out.println("Lista je prazna");
		}else{
			System.out.println("Najveci element u listi je: " + max);
		}
		
		
	}
	
	//metoda vraca najveci element iz liste
	public static Integer max(ArrayList<Integer> list) {
		
		if(list == null || list.size() == 0) {
			return null;
		}
		else {
			Integer max = list.get(0);
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) > max)
					max = list.get(i);
			}
			return max;
		}
}
}
