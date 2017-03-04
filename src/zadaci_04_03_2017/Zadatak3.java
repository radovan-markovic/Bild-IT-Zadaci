package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {
		
		//kreiramo novi objekat BigInteger
		BigInteger broj = new BigInteger(Long.MAX_VALUE + "");
		broj.add(BigInteger.ONE);
		int brojac = 0;
		
		while(brojac < 5) {
			if(isPrime(broj)) {
				brojac++;
				//ispisujemo prost broj
				System.out.println(brojac + " " + broj);
			}
			broj = broj.add(BigInteger.ONE);
		}
	}
	//metoda provjerava da li je BigInteger prost broj
	public static boolean isPrime(BigInteger broj) {

		BigInteger djelilac;
		BigInteger dijeli = broj.divide(new BigInteger("2"));

		for(djelilac = new BigInteger("2"); djelilac.compareTo(dijeli) <= 0; djelilac = djelilac.add(BigInteger.ONE)) 
			if(broj.remainder(djelilac).equals(BigInteger.ZERO)){
				return false;
			}
		return true;
	}

}
