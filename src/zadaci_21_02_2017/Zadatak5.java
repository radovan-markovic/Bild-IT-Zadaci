package zadaci_21_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double cijena1 = -1;
		double cijena2 = -1;
		double tezina1 = -1;
		double tezina2 = -1;
		boolean test = true;
		
		while(test){//testiramo unos cijena
			try{
				while (cijena1 < 1){
					System.out.println("Unesite cijenu prvog pakovanja:");
					cijena1 = input.nextDouble();
					input.nextLine();
				}
				while (cijena2 < 1){
					System.out.println("Unesite cijenu drugog pakovanja:");
					cijena2 = input.nextDouble();
					input.nextLine();
				}
				test = false;
				}catch (Exception e){
					System.out.println("Pogrsan unos, unesite ponovo:");
					input.nextLine();
				}
			}
		
		test = true;
		while(test){//testiramo unos tezina
			try{
				while (tezina1 < 1){
					System.out.println("Unesite tezinu prvog pakovanja:");
					tezina1 = input.nextDouble();
					input.nextLine();
				}
				while (tezina2 < 1){
					System.out.println("Unesite tezinu drugog pakovanja:");
					tezina2 = input.nextDouble();
					input.nextLine();
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogrsan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		//racunamo koje pakovanje ima bolju cijenu
		if((tezina1/cijena1) > (tezina2/cijena2)){
			System.out.println("Bolju cijenu ima prvo pakovanje.");
		}else if ((tezina2/cijena2) > (tezina1/cijena1)){
			System.out.println("Bolju cijenu ima drugo pakovanje.");
		}else if ((tezina2/cijena2) == (tezina1/cijena1)){
			System.out.println("Oba pakovanja imaju istu cijenu.");
		}
		input.close();
	}

}
