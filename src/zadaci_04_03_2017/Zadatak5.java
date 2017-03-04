package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak5 {

	public static void main(String[] args) {
		
		String longValue = Long.MAX_VALUE + "";

		BigDecimal maxLong = new BigDecimal(longValue);
		BigDecimal pet;
		BigDecimal sest;
		int brojac = 0;
		BigDecimal rez = maxLong.add(BigDecimal.ONE);
		

		while(brojac < 10) { 
			
			// provjeravamo da li je broj djeljiv sa 5 ili sa 6
			pet = rez.remainder(new BigDecimal(5));
			sest = rez.remainder(new BigDecimal(6));
			
			if(rez.compareTo(maxLong) > 0 && (sest.equals(BigDecimal.ZERO)
					|| pet.equals(BigDecimal.ZERO))) {
				System.out.println((brojac + 1) + ". " + rez);
				brojac++;
			}
			rez = rez.add(BigDecimal.ONE); 
}

	}

}
