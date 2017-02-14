package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	public static void main(String[] args) {
		
		//Helper help = new Helper();
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		int broj = 0;
		
			while(test){//provjeravamo unos
				try{
					System.out.println("Unesite cijeli broj: ");
					broj = input.nextInt();
					input.nextLine();
					test = false;	
				}catch (Exception e){
					System.out.println("Pogresan unos:");
					input.nextLine();
				}
			}
			
			System.out.println("Obrnuti broj je: " + reverse(broj));
			
			//ispisujemo da li je broj palindrom ili ne
			if (isPalindrome(broj)){
				System.out.println("Broj je palindrom.");
			}else{
				System.out.println("Broj nije palindrom.");
			}
		
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
	
	//metoda provjerava da li su dva broja palindrom
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
