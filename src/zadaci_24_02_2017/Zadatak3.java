package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		short broj = -1;
		boolean test = true;
		
		while (test){//testiramo unos
			try{
				while (broj < 0){
					System.out.println("Unesite broj:");
					broj = input.nextShort();
					input.nextLine();
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, morate unijeti broj");
				input.nextLine();
			}
		}
		
		//pretvaramo broj u binarni broj
		String binarniBroj = Integer.toBinaryString(broj);
		
		//dodajemo nule sa lijeve strane
		int dodajNulu = 16 - binarniBroj.length();
		
		System.out.println("Binarna reprezentacija broja je: ");
		
		//ispisujemo broj
		for (int i = 0; i<dodajNulu; i++){
			System.out.print("0");
		}
		System.out.print(binarniBroj);
		
		input.close();
	}

}
