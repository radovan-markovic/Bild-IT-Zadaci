package zadaci_18_02_2017;
//ispis prostog broja od 2 do 1000;
public class Zadatak2 {

	public static void main(String[] args) {
		
		int brojac = 0;
		
		for (int i = 2; i<= 1000; i++){
			if (isPrime(i)){
				System.out.print(i + " ");
				brojac++;
				
				if (brojac % 8 == 0){
					System.out.println();
				}
			}
		}

	}
	
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
