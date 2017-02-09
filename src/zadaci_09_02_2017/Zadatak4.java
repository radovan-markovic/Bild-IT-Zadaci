package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko elemenata po redu i koloni zelite u matrici:");
		int brojBacanja = input.nextInt();
		
		//prosljedjujemo metodi koliko elemenata zelimo u matrici
		printMatrix(brojBacanja);

	}
	
	//metoda prima broj elemenata reda odnosno kolone
	public static void printMatrix(int n){
		
		//kreiramo 2D niz koji ce sadrzati n redova i n kolona
		int niz[][] = new int[n][n];
		
		//kriramo redove
		for (int i = 0; i<niz.length; i++){
			//kreiramo elemente u redu
			for (int j = 0; j< niz[i].length; j++){
				//elemnt u redu ce biti nasumican, 0 ili 1
				int broj = (int)(Math.random()*2);
				System.out.print(broj + " ");
			}
			System.out.println();
		}
		
	}

}
