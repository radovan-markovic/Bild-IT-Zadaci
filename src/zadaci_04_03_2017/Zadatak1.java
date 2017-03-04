package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak1 {
	public static void main(String[] args) {
	
		
		String broj =1+ "";

		for(int i = 0; i < 50; i++) {
			broj += "0";
		}
		
		//pravimo BigDecimal objekte
		BigDecimal brojDjeliv2ili3  = new BigDecimal(broj);
		BigDecimal dva  = new BigDecimal(2);
		BigDecimal tri  = new BigDecimal(3);
		
		int brojac = 0;
		int noviBroj = 1;
		
		while (brojac < 10){
			//provjeravamo da li je broj djeljiv sa 2 ili sa 3
			if (brojDjeliv2ili3.remainder(dva)== BigDecimal.ZERO || brojDjeliv2ili3.remainder(tri) == BigDecimal.ZERO){
				brojac++;
				System.out.println(brojac+". " +brojDjeliv2ili3);
			}
			//inkrementiramo broj
			broj = 1+"";
			for(int i = 0; i < 50; i++) {
				if (i == 49){
					broj += noviBroj;
				}else{
					broj += "0";
				}
				
			}
			noviBroj++;
			brojDjeliv2ili3 = new BigDecimal(broj);
		}
	}
}
