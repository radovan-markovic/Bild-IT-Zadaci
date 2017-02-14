package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		boolean test = true;
		int broj1 = 0;
		int broj2 = 0;;
		int brojacReda = 0;
		Scanner input = new Scanner(System.in);
		
		while (test){//testiramo unos
			try{
				while (broj1 < 1){
					System.out.println("Unesite pocetnu godinu:");
					broj1 = input.nextInt();
					input.nextLine();
				}
				while (broj2 < 1 || broj2 <= broj1){
					System.out.println("Unesite krajnju godinu, krajnja godina ne moze biti manja ili jednaka pocetnoj:");
					broj2 = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos unesite ponovo:");
				input.nextLine();
			}
		}
		
		//polazimo od 101. godine do 2100. i provjeravamo za svako godinu da li je prestupna
				for (int i = broj1; i<=broj2; i++){
					if((i % 4 == 0 & i %100 != 0) || (i%400 == 0)){
						//ako je godina prestupna ispisujemo je
						System.out.print(i + " ");
						
						brojacReda++;
						
						if(brojacReda % 10 == 0){
							System.out.println();
						}
					}
				}
	}

}

