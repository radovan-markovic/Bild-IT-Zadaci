package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		
		System.out.println("Unesite SSN u formatu DDD-DD-DDDD. D predstavlja broj:");
		String str = input.nextLine();
		
		while (test){//provjeravamo unos
			//provjeravamo unos sa regexom
			if (str.matches("^(?!000)[0-9]{3}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$")){
				System.out.println("SSN je validan.");
			test = false;	
			}else{
				System.out.println("SSN nije validan. Unesite ponovo:");
				str = input.nextLine();
			}
		}
		input.close();
	}

}
