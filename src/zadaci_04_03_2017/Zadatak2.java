package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak2 {

	public static void main(String[] args) {
		
		String broj = Long.MAX_VALUE + "";
		
		BigDecimal longMax = new BigDecimal(broj);
		long squareNumber = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal rez = new BigDecimal(squareNumber);
		
		//provjeravamo da li je rezultat veci od long.MAX_VALUE i ako jeste ispisujemo broj
		for(int i = 0; i < 11; i++) {
			if((rez.multiply(rez).compareTo(longMax)) > 0)
				System.out.println((i) + ". " + rez.multiply(rez));
			
			rez = rez.add(BigDecimal.ONE);
}

	}

}
