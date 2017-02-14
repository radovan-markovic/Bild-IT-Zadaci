package bonus_zadaci_13_02_2017;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		long svjetlosneGodine = 0;
		boolean test = true;
		while (test) {
			try {
				
				boolean test2 = true;
				
				//unos broja svjetlosnih godina 
				while (test2){
					System.out.println("Unesite broj svjetlosnih godina: ");
					svjetlosneGodine = input.nextLong();
					if (svjetlosneGodine <= 0) {
						System.out.println("Pogresan unos, unesite ponovo:");
						test2 = true;
					} else {
						test2 = false;
					}
				}
				
				test = false;
				
				String godine = svjetlosneGodine+"";                                    //pretvaranje broja godina u string
				
				BigDecimal temp1 = new BigDecimal (godine);						//pretvaranje broja godina u velliki decimalni broj
				
				BigDecimal kilometriPoGodini = new BigDecimal ("9460730472580.8");	//broj kilometara koje svjetlost prijedje za jednu godinu
				
				BigDecimal ukupnoKilometara = temp1.multiply(kilometriPoGodini);  	//ukupan broj kilometara koje svjetlost prijedje za uneseni broj 
																					//svjetlosnih godina
				
				System.out.println("Za "+svjetlosneGodine+" svjetlosnih godina, svjetlost prijedje "+ukupnoKilometara+" kilometara.");
				
				BigDecimal astronomicalUnit = new BigDecimal("149600000.0");		//duzina astronomske jedinice u kilometrima		
				
				//ukupan broj astronomskih jedinica koje svjetlost prijedje za 
				//odredjeni broj svjetlosnih godina
				BigDecimal astronomskeJedinice = ukupnoKilometara.divide(astronomicalUnit, 5, BigDecimal.ROUND_UP); 
				
				System.out.println("\nZa " + svjetlosneGodine + " svjetlosnih godina svjetlost prijedje " + astronomskeJedinice + " astronomskih jedinica");
				
				
				//broj parseka koje svjetlost prijedje za odredjeni broj svjetlosnih godina
				double parsecs = svjetlosneGodine / 3.26;
				
				System.out.printf("\nZa vrijeme od " + svjetlosneGodine + " svjetlosnih godina, svjetlost prijedje %.3f parseka.", parsecs );
				
				double brzinaHeliosa = 252792.537; // brzina Heliosa2 km/h
				
				double svjetlosnaGodina = 9460730472580.800; //svjetlosna godina u km
				
				double brojSatiHelios = svjetlosnaGodina / brzinaHeliosa; //broj sati da za koje Helios predje godinu
				
				double satiUGodini = 8766;  //ukupan broj sati koji ima jedna godina
				
				double totalgodine = brojSatiHelios / satiUGodini;
				totalgodine = Math.floor(totalgodine);
				
				brojSatiHelios = brojSatiHelios - (totalgodine * satiUGodini);
				
				double months = brojSatiHelios / 730.5;   //broj sati u mjesecu
				months = Math.floor(months);
				
				brojSatiHelios = brojSatiHelios - (months * 730.5);
				
				double days = brojSatiHelios / 24;			
				
				System.out.printf("\n\nDa bi presli udaljenost od " + svjetlosneGodine + " svjetlosnih godina, sa Helios 2 objektom"
						+ " potrebno nam je " + totalgodine +" godina, " + months + " mjeseci, i %.1f dana.\n", days);
				
				
			} catch (InputMismatchException ex) {
				System.out.println("Unesite broj:");
				test = true;
				input.nextLine();
			}
		}
		
		
		input.close();

	}

}