package zadaci_22_02_2017;

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
				System.out.println("Pogresan unos, morate unijeti broj");
				input.nextLine();
			}
		}
		
		//ispisujemo matricu pozivom metode
		printMatrix(broj);
		input.close();
	}
	
	//printamo matricu nxn
	public static void printMatrix(int n){
		
		int broj = 0;
		
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				broj = (int)(Math.random()*2);
				System.out.print(broj + " ");
			}
			System.out.println();
		}
	}

}
