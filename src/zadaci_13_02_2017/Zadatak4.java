package zadaci_13_02_2017;

import java.util.Scanner;

//ispisivanje brojeva u obrnutom redoslijedu
public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		int[] niz = new int[10];
			
		while(test){//pravimo provjeru za unos
			try{
				System.out.println("Unesite brojeve:");
				//punimo niz
				for(int i = (niz.length -1); i>=0; i--){
					niz[i] = input.nextInt();
				}
				test = false;
		}catch(Exception e){
			System.out.println("Pogresan unos, unesite ponovo:");
			input.nextLine();
			}
		}
		
		//ispisujemo niz
		for(int i = 0; i<niz.length; i++){
			System.out.print(niz[i] + " ");
		}
		input.close();
	}

}
