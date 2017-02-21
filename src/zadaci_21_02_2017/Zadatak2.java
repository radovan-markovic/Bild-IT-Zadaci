package zadaci_21_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		int broj = 0;
		
		while(test){//provjeravamo unos
			try{//testiramo unos
				System.out.println("Unesite cijeli broj: ");
				broj = input.nextInt();
				input.nextLine();
				test = false;	
			}catch (Exception e){
				System.out.println("Pogresan unos:");
				input.nextLine();
			}
		}
			
		//pozivamo metodu koja vraca broj naopako
		reverse(broj);
		
		input.close();
	}
	
	//metoda vraca broj naopako
		public static void reverse(int number) {
			
			int reverse = 0;

				while(number != 0) {
				reverse *= 10;
				reverse += number % 10;
				number /= 10;
			}
			System.out.println(reverse);
		}

}
