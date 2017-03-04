package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak4 {
	public static void main(String[] args) {

		System.out.printf("%-6s%6s\n", "p", "2^p - 1");
		BigInteger i;
		BigInteger granica = new BigInteger("100");
		
		//prolazimo kroz BigInteger petlju
		for(i = new BigInteger("2"); i.compareTo(granica) <= 0; i = i.add(BigInteger.ONE)) {
			
			if(Zadatak3.isPrime(i)) {
				BigInteger mersennePrime = getPow(i);
				
				if(Zadatak3.isPrime(mersennePrime)) {
					System.out.printf("%-6s%6s\n", i, mersennePrime);
				}
			}
		}
	}

	//metoda vraca BigInteger po formuli 2^p – 1
	public static BigInteger getPow(BigInteger i) {
		return new BigInteger("2").pow(i.intValue()).subtract(BigInteger.ONE);
}
}
