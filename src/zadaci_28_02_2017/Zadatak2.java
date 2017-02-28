package zadaci_28_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		
		int[][] niz = new int[3][3]; 
		int[][] niz2 = new int[3][3]; 
		
		while (test) {//testiramo unos u prvu matricu
			System.out.println("Unesite 9 elementa u prvu matricu");
			try {
				for (int i = 0; i < niz.length; i++) {
					for (int j = 0; j < niz[i].length; j++) {
						System.out.println("Unesite broj u matricu:");
						niz[i][j] = input.nextInt();
						input.nextLine();
					}
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		
		test = true;
		
		while (test) {//testiramo unos u drugu matricu
			System.out.println("Unesite 9 elementa u drugu matricu matricu");
			try {
				for (int i = 0; i < niz2.length; i++) {
					for (int j = 0; j < niz2[i].length; j++) {
						System.out.println("Unesite broj u matricu:");
						niz2[i][j] = input.nextInt();
						input.nextLine();
					}
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		
		input.close();
		
		equals(niz, niz2);

	}
	
	public static boolean equals(int[][] array1, int[][] array2){
		
		if (Arrays.deepEquals(array1, array2)){
			System.out.println("Identicni su");
			return true;
		}else{
			System.out.println("Nisu identicni");
			return false;
		}

	}


}
