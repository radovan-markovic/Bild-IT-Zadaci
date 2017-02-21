package zadaci_21_02_2017;

public class Zadatak4 {

public static void main(String[] args) {
		
		int brojac = 0;
		//ispitujemo da li broj prost i da li je taj isti broj u obrnutom stanju prost
		for (int i = 2; i < 94050; i++){
			if (isPrime(i) && isPalindrome(i)){
				System.out.printf("%5d ", i);
				brojac++;
				if (brojac % 10 == 0){
					System.out.println();
				}
			}
		}

	}
	
	//provjeravamo da li je broj prost
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	//metoda provjerava da li je broj polindrom
	public static boolean isPalindrome(int number) {
		
		int temp = number;
		int reverse = 0;

			while(number != 0) {
			reverse *= 10;
			reverse += number % 10;
			number /= 10;
		}
		if (reverse == temp){
			return true;
		}
		return false;
	}

}
