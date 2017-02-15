package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		boolean test = true;
		double iznosInvesticije = 0;
		double interesnaStopa = 0;
		int brojGodina = 0;
		Scanner input = new Scanner(System.in);
		
		while (test){//testiramo unos
			try{
				while (iznosInvesticije < 1){
					System.out.println("Unesite iznos investicije:");
					iznosInvesticije = input.nextDouble();
					input.nextLine();
				}
				while (interesnaStopa < 1){
					System.out.println("Unesite interesnu stopu:");
					interesnaStopa = input.nextDouble();
					input.nextLine();
				}
				while (brojGodina < 1){
					System.out.println("Unesite godine:");
					brojGodina =  input.nextInt();
					input.nextLine(); 
				}
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos unesite ponovo");
				input.nextLine();
			}
		}
		
		//racunamo buducu vrijednost investicije
		double mjesecnaInteresnaStopa = (interesnaStopa/12/100);
		double buducaVrijednostInvesticije = iznosInvesticije * Math.pow(1 + mjesecnaInteresnaStopa, (brojGodina * 12));
		System.out.printf("%.3f",buducaVrijednostInvesticije);
		input.close();
	}

}
