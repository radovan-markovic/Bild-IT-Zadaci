package zadaci_11_02_2017;

import java.util.Scanner;

//rastavljanje broja na proste faktore
public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean unos = true;
		int broj = 0;
		System.out.println("Unesite broj:");
		
		while (unos){
			try{
			//unosimo broj koji  cemo rastaviti na proste faktore
			broj = Integer.parseInt(input.nextLine());
			unos = false;
			}catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
			}
		}
		
		
		int rezultat = 1;
		//postavljamo pocetno stanje djelilca
		int djelilac = 2;
		
		int brojac = 0;
		//provjeravamo da li je broj negativan
		if (broj < 0){
			
			brojac++;
			String str = broj+"";
			String str2= "";
			for (int i = 1; i<str.length(); i++){
				str2 = str2 + str.charAt(i);
			}
			broj = Integer.parseInt(str2);
		}
		
		//pamtimo pocetno stanje broja
		int pocetnoStanje = broj;
		
		//vrsimo rastavljanje na proste faktore sve dok proizvod faktora ne bude
		//jednak broju koji smo unijeli
		if (broj == 0 || broj == 1){
			System.out.println(broj);
		}else{
			while (rezultat != pocetnoStanje){	
				//provjeravamo da li se broj moze dijeliti, ako ne inkrementujemo djelilac
				if (broj % djelilac == 0){
					//ispisujemo prost faktor
					System.out.print(djelilac + " ");
					//provjeravamo da li je proizvod djelilaca jednak unesenom broju
					rezultat = rezultat * djelilac;
					//broj koji je podijeljen dijelimo ponovo i rastavljamo ga
					broj = broj / djelilac;
				}else{
					djelilac++;
				}
			}
		}
		
	}

}
