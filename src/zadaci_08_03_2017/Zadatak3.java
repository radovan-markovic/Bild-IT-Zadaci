package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		int brojac = 0;
		boolean test = true;
		
		while(test) {//testiramo unos
			
			try {
				System.out.println("Unesite 5 brojeva:");
				while(brojac < 5) {
					double broj = input.nextInt();
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
		
		 sum(list);
	}
	
	//metoda za sabiranje elemenata u listi liste
	public static void sum(ArrayList<Double> list){
		
		double sum = 0;
		
		for(int i = 0; i<list.size(); i++){
			sum = sum + list.get(i);
		}
		System.out.println("Suma liste je: " +  sum);
	}
	
}
