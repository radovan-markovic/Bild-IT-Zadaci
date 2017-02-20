package zadaci_20_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int brojacPrvogUnosa = 0;
		boolean test = true;
		
		System.out.println("Unesite brojeve:");
		while(test){//pravimo provjeru za unos
			try{
				int unos = input.nextInt();
				
				//provjeravamo da li je prvi unos 0
				if (brojacPrvogUnosa == 0 && unos == 0){
					System.out.println("Nema unesenih brojeva.");
					break;
				}
				brojacPrvogUnosa++;
				
				//ako je unos jednak 0 prekida se unos u niz
				while (unos != 0){
					while (unos < 1 || unos > 100){ 
						System.out.println("Broj mora biti veci od 1 ili manji od 100:");
						unos = input.nextInt();
					}
					list.add(unos);
					System.out.println("Unesite novi broj:");
					unos = input.nextInt();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
			
		}
		
		int brojac = 0;
		
		//prolazimo kroz svaki broj od 1 do 100
		for (int i = 1; i<=100; i++){
			//inkrementiramo brojac ako se broj pojavljuje u listi
			for (int j=0; j<list.size();j++){
				if (i == list.get(j)){
					brojac++;
				}
				
			}
			//ispis broja pojavljivanja broja
			if (brojac > 0){
				System.out.println("Broj pojavljivanja unesenog broja " + i + " je: " + brojac);
			}
			brojac = 0;
		}
		input.close();
	}

}
