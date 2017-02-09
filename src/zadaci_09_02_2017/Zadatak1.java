package zadaci_09_02_2017;

//ispis prestupnih godina
public class Zadatak1 {
	
	public static void main(String[] args) {
		
		//kreiramo brojac 
		int brojacPrestupnihGodina = 0;
		
		//pravimo brojac da bismo mogli preci u novi red posle 10 ispisa
		int brojacReda = 0;
		
		//polazimo od 101. godine do 2100. i provjeravamo za svako godinu da li je prestupna
		for (int i = 101; i<=2100; i++){
			if((i % 4 == 0 & i %100 != 0) || (i%400 == 0)){
				//ako je godina prestupna ispisujemo je
				System.out.print(i + " ");
				
				brojacReda++;
				brojacPrestupnihGodina++;
				
				if(brojacReda % 10 == 0){
					System.out.println();
				}
			}
		}
		//ispisujemo ukupan broj prestupnih godina
		System.out.println("\nUkupan broj prestupnih godina: "+ brojacPrestupnihGodina);

	}

}
