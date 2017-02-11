package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;

//provjeri identicnost dva niza
public class Zadatak3 {

	public static boolean equals(int[] array1, int[] array2){
		//poredimo identicnost niza sa Arrays copy metodom
		if (Arrays.equals(array1, array2)){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		
		boolean test = true;
		int[] niz = new int [5];
		int[] niz2 = new int [5];
		
		Scanner input = new Scanner(System.in);
		
		while(test){//pravimo provjeru za unos
			try{
				//punimo prvi niz brojevima
				System.out.println("Unesite 5 brojeva u prvi niz");
				for (int i = 0; i < niz.length; i++){
					 niz[i] = input.nextInt();
				}
				
				//punimo drugi niz brojevima
				System.out.println("Unesite 5 brojeva u u drugi niz");
				for (int i = 0; i < niz2.length; i++){
					niz2[i] = input.nextInt();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		//pozivamo metodu koja ce porediti elemente dva niza
		System.out.println(equals(niz, niz2));

	}


}
