package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int broj = 0;
		boolean test = true;
		
		while (test){//testiramo unos
			try{
				while (broj <= 0){
					System.out.println("Unesite broj:");
					broj = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, morate unijeti pozitivan broj");
				input.nextLine();
			}
		}
		
		int space = broj-1;
		
		//pravimo broj redova u odnosu na uneseni broj
		for(int i = 1; i <= broj; i++){
			
			//pravimo razmake da bismo dobili izgled piramide
			for (int a = space; a>0; a--){
				System.out.print("  ");
			}
			
			//ispisujemo brojeve s lijeve strane do 2 u opadajucem redoslijedu
			if (i != 1){
				for (int k = i; k>1; k--){
					System.out.print(k + " ");
				}
			}
			//ispisujemo brojeve od 1 u rastucem redoslijedu
			for (int j = 1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
			space--;
		}
		input.close();
	}

}
