package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		boolean test = true;
		double brzina = 0;
		double ubrzanje = 0;
		Scanner input = new Scanner(System.in);
		
		while (test){//testiramo unos
			try{
				while (brzina < 1){
					System.out.println("Unesite brzinu v:");
					brzina = input.nextDouble();
					input.nextLine();
				}
				while (ubrzanje < 1){
					System.out.println("Unesite ubrzanje a:");
					ubrzanje = input.nextDouble();
					input.nextLine();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos unesite ponovo:");
				input.nextLine();
			}
		}
		
		//ispisujemo rezultat
		double rezultat = ((brzina*brzina) / (2*ubrzanje));
		
		System.out.printf("Duzina piste je: " + "%.3f" , rezultat);
		
		input.close();

	}

}
