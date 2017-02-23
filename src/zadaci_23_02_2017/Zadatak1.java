package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int broj = 0;
		boolean test = true;
		int duzinaBroja = 0;
		
		while (test){//testiramo unos
			try{
				while (duzinaBroja != 3){
					System.out.println("Unesite trocifreni broj:");
					broj = input.nextInt();
					//uzimamo apsolutnu vrijednost broja
					broj = Math.abs(broj);
					//provjeravamo da li broj ima 3 cifre
					duzinaBroja = (int)(Math.log10(broj)+1);
					input.nextLine();
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, morate unijeti broj");
				input.nextLine();
			}
		}
		
		if (isPalindrome(broj)){
			System.out.println("Broj je palindrom.");
		}else{
			System.out.println("Broj nije palindrom.");
		}
		input.close();
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
