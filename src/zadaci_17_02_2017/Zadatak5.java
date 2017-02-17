package zadaci_17_02_2017;

import java.util.Scanner;
//provjeri da li je string sadrzan u prvom stringu
public class Zadatak5 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite prvi string");
		String str = input.nextLine();
		
		System.out.println("Unesite drugi string");
		String str2 = input.nextLine();
		
		//provjeravamo da li je string sadrzan u prvom stringu
		if (str.indexOf(str2) != -1){
			System.out.println(str2 + " je substring prvog stringa.");
		}else{
			System.out.println(str2 + " nije substring prvog stringa.");
		}
		input.close();
	}

}
