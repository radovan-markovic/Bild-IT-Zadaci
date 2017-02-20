package zadaci_20_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
	boolean test = true;
	int broj1 = 0;
	int broj2 = 0;
	Scanner input = new Scanner(System.in);
		
		while(test){//testiramo unos
			try{
				while (broj1 < 1){
					System.out.println("Unesite pozitivan cijeli broj:");
					broj1 = input.nextInt();
					input.nextLine();
				}
				while (broj2 < 1){
					System.out.println("Unesite drugi pozitivan cijeli broj:");
					broj2 = input.nextInt();
					input.nextLine();
				}
				test = false;
				}catch (Exception e){
					System.out.println("Pogrsan unos, unesite ponovo:");
					input.nextLine();
				}
			}
		
		//najmanji zajednicki djelilac za pozitivne brojeve je uvijek 1 tako da cemo ispisati 1
		System.out.println("Najmanji zajednicki djelilac je 1");
		
		int manji = 0;
		int veci = 0;
		//provjeravamo koji je od brojeva manji;
		if (broj1 <= broj2){
			manji = broj1;
			veci = broj2;
		}else{
			manji = broj2;
			veci = broj1;
		}
		
		//trazimo najveci zajednicki djelilac
		for (int i = manji; i>=1; i--){
			if (veci % i == 0 && manji % i == 0){
				System.out.println("Najveci zajednicki djelilac je " + i);
				break;
			}
		}
		
		input.close();
	}

}
