package zadaci_21_02_2017;
//emirp brojevi
public class Zadatak3 {

	public static void main(String[] args) {
		
		int brojac = 0;
		
		for (int i = 2; i < 3050; i++){
			//provjeravamo da li je broj prost, da li je broj prost kad
			//je okrenut naopako
			//takodje provjeravamo da li je broj palindrom, ako nije ispisujemo ga
			if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)){
				System.out.printf("%4d ", i);
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
	
	//metoda vraca broj naopako
	public static int reverse(int number) {
		
		int reverse = 0;

			while(number != 0) {
			reverse *= 10;
			reverse += number % 10;
			number /= 10;
		}
		return reverse;
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
