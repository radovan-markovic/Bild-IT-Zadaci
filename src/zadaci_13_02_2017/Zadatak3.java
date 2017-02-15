package zadaci_13_02_2017;

import java.util.Scanner;

//zajednicki prefiks za dva znaka
public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//kriramo dva stringa
		System.out.println("Unesite prvi string");
		String s = input.nextLine();
		System.out.println("Unesite drugi string");
		String s2 = input.nextLine();
	
		String mali, veliki;
		
		//poredimo koji je string veci i dodjeljujemo stringove promjenljivim mali odnosno veliki
		if (s.length() > s2.length()) {
			mali = s2;
			veliki = s;
		} else {
			mali = s;
			veliki = s2;
		}
		int index = 0;
		
		//pravimo niz karaktera od veceg stringa i prolazimo kroz niz
		for (char c : veliki.toCharArray()) {
			//provjeravamo duzinu malog stringa da odredimo duzinu prefixa
			if (index == mali.length())
				break;
			//kada se karakteri u stringovima ne podudaraju vise izlazimo iz petlje
			if (c != mali.charAt(index))
				break;
			index++;
		}
		//ako je index 0 stringovi nemaju isti prefix
		if (index == 0)
			System.out.println("" + s + " i " + s2 + " nemaju isti prefix");
		//ispisujemo zajednicki prefix
		else
			System.out.println("Najveci zajednicki prefix je: "+ veliki.substring(0, index));
	    input.close();
	}


}
