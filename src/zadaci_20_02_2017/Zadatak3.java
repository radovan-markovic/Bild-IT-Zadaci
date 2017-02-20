package zadaci_20_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int brojac = 0;
		
		//0 i 1 nisu prosti brojevi pa provjeravamo proste brojeve pocevsi od 2
		for (int i = 2; i<= 100000; i++){
			
			if(isPrime(i) != -1){
				System.out.print(isPrime(i) + " ");
				brojac++;
				//radi lakseg pregleda ispisujemo po 10 brojeva u redu
				if (brojac % 10 == 0){
					System.out.println();
				}	
			}
		}

	}
	
	//metoda provjerava da li je broj prost
	public static int isPrime(int n) {
	    for(int i=2; i<n; i++) {
	        if(n%i==0)
	        	//ako broj nije prost metoda vraca -1 kao rezultat
	            return -1;
	    }
	    //vracamo prost broj
	    return n;
	}

}
