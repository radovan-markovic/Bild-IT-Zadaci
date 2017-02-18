package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int max = 0;
		int brojac = 0;
		int brojacPozitivnih = 0;
		int brojacNegativnih = 0;
		int suma = 0;
		int brojacPrvogUnosa = 0;
		boolean test = true;
		
		System.out.println("Unesite brojeve: ");
		//unosimo brojeve u niz
		
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
					list.add(unos);
					brojac++;
					if (unos > 0){
						brojacPozitivnih++;
					}
					if (unos < 0){
						brojacNegativnih++;
					}
					
					suma = suma + unos;
					
					System.out.println("Unesite novi broj:");
					unos = input.nextInt();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		
		double prosjek = (double)suma / brojac;
		
		if(brojacPrvogUnosa != 0){
			System.out.println("Broj pozitivnih brojeva: " + brojacPozitivnih);
			System.out.println("Broj negativnih brojeva: " + brojacNegativnih);
			System.out.println("Suma unijetih brojeva: " + suma);
			System.out.println("Prosjek unijetih brojeva: " + prosjek);
		}
	}

}
