package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int broj = -1;
		boolean test = true;
		
		while (test){//testiramo unos
			try{
				while (broj < 0 || broj > 127){
					System.out.println("Unesite broj:");
					broj = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, morate unijeti pozitivan broj");
				input.nextLine();
			}
		}
		
		//pretvaramo broj u karakter
		char ch = (char)broj;
		//ispisujemo karakter
		System.out.println("To je karakter: " + ch);
		input.close();
	}

}
