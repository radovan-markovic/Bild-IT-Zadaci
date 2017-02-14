package bonus_zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		long godine = 0;
		
		while (test){
			try{
				System.out.println("Unesite godine:");
				godine = Long.parseLong(input.nextLine());
				test = false;
			}catch (Exception e){
				System.out.println("Nepravilan unos.");
			}
		}
		
		long temp1 = godine;
		long temp2 = godine;
		
		long sati = godine / 3600;
		godine = godine % 3600;
		long minuti = godine / 60;
		godine = godine % 60;
		long sekundi = godine;

		System.out.println(sati + " sati, " + minuti + " minuta, i " + sekundi + " sekundi.");
		
		//racunamo broj godina mjeseci i dana
		 
		long godina = temp1 / 31557600;	
		temp1 = temp1 % 31557600;			
		long mjeseci = temp1 / 2629800;
		temp1 = temp1 % 2629800;
		double dani = temp1 / 86400.0;
		


		System.out.println("\nTakodje je potrebno: ");
		System.out.printf(godina + " godina, " + mjeseci + " mjeseci, i %.3f dana.\n", dani);
		
		//u decenijama i vijekovima
		long vijekovi = temp2 / 3155760000L;				
		temp2 = temp2 % 3155760000L;
		double dekade = temp2 / 315576000.0;
		
		System.out.println("Ili u dekadama  odnosno vijekovima je potrebno: " + vijekovi +" "
				+ "vijekova i " + dekade + " dekada.");
		
		double milenijumi = temp2 / 31557600000.0; 
		
		System.out.println();
		System.out.println("I, u milenijumima je potrebno: " + milenijumi);
		
	}

}
