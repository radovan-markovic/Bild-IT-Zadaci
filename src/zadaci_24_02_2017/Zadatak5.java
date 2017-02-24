package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		boolean test = true;
		int broj = 0;
		int brojac = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> listJedinstveniBrojevi = new ArrayList<>();
		
		System.out.print("Unesite 10 brojeva. ");
		while (test){//testiramo unos
			try{
				while (brojac < 10){
					System.out.println("Unesite broj:");
					broj = input.nextInt();
					list.add(broj);
					brojac++;
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, unesite broj!");
				input.nextLine();
			}
		}
		
		//prolazimo kroz listu u kojoj se nalazi 10 unijetih brojeva
		//ako broj ne postoji u listi jedinstvni brojevi dodajemo ga u tu listu
		for (int i = 0; i < list.size(); i++) {
			if (!(listJedinstveniBrojevi).contains(list.get(i))) {
				listJedinstveniBrojevi.add(list.get(i));
			}
		}
		//ispisujemo koliko ima jedinstvenih brojeva
		System.out.println("\nJedinstvenih brojeva ima: " + listJedinstveniBrojevi.size());
		
		//ispisujemo jedinstvene brojeve
		System.out.println("Jedinstveni brojevi su: ");
		for(int i = 0; i<listJedinstveniBrojevi.size(); i++){
			System.out.print(listJedinstveniBrojevi.get(i)+ " ");
		}
		input.close();
	}

}
