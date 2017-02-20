package zadaci_20_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		boolean test = true;
		int broj1 = 0;
		int broj2 = 0;
		int broj3 = 0;
		Scanner input = new Scanner(System.in);
			
			while(test){//testiramo unos
				try{
					
					System.out.println("Unesite prvi cijeli broj:");
					broj1 = input.nextInt();
					input.nextLine();
					System.out.println("Unesite drugi cijeli broj:");
					broj2 = input.nextInt();
					input.nextLine();
					System.out.println("Unesite treci cijeli broj:");
					broj3 = input.nextInt();
					input.nextLine();
					
					test = false;
					}catch (Exception e){
						System.out.println("Pogrsan unos, unesite ponovo:");
						input.nextLine();
					}
				}
			
			//pravimo niz u koji smijestamo cijele brojeve
			int[] niz = {broj1, broj2, broj3}; 
			
			//sortiramo niz
			Arrays.sort(niz);
			
			System.out.println("Brojevi po rastucem redoslijedu su:");
			System.out.println(niz[0]);
			System.out.println(niz[1]);
			System.out.println(niz[2]);
			
			input.close();
	}

}
