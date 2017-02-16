package zadaci_16_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
	public static void main (String[] args){
		boolean test = true;
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int max = 0;
		int brojac = 0;
		int brojacPrvogUnosa = 0;
		
		System.out.println("Unesite brojeve: ");
		//unosimo brojeve u niz
		
		
		while(test){//pravimo provjeru za unos
			try{
				int unos = input.nextInt();
				//prvi unos odmah stavljamo da je najveci broj
				brojacPrvogUnosa++;
				if (brojacPrvogUnosa == 1){
					max = unos;
				}
				//ako je unos jednak 0 prekida se unos u niz
				while (unos != 0){
					list.add(unos);
					if (max < unos){
						max = unos;
						brojac = 0;
					}
					if (max == unos){
						brojac++;
					}
					System.out.println("Unesite novi broj:");
					unos = input.nextInt();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		if (!list.isEmpty()){
			System.out.println("Najveci broj je: " + max + " ponavlja se "+brojac + " puta.");
			input.close();
		}else{
			System.out.println("Odmah ste prekinuli unos, nema unesenih brojeva.");
		}
	}
}
