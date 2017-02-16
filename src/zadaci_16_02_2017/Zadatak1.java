package zadaci_16_02_2017;

import java.util.Scanner;
//dan u sedmici
public class Zadatak1{

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			int danasnjiDan = -1;
			int brojDanaNakonDanasnjegDana = 0;
			boolean test = true;
			
			//pravimo niz od dana u sedmici
			String [] niz = {"Ponedeljak", "Utorak", "Srijeda", "Cetvrtak", 
					"Petak", "Subota", "Nedelja"};
			
			while(test){//testiramo unos
				try{
					while (danasnjiDan < 0 || danasnjiDan > 6){
						System.out.println("Unesite danasnji dan brojem, 0 oznacava Ponedeljak, 1 Utorak...");
						danasnjiDan = input.nextInt();
						input.nextLine();
					}
					while (brojDanaNakonDanasnjegDana < 1){
						System.out.println("Unesite broj dana od danasnjeg dana:");
						brojDanaNakonDanasnjegDana = input.nextInt();
						input.nextLine();
					}
					test = false;
				}catch(Exception e){
					System.out.println("Morate unijeti broj");
					input.nextLine();
				}
			}
			
			int rezultat = (danasnjiDan + 1) + (brojDanaNakonDanasnjegDana);
			
			//oduzimamo broj dana dok ne dobijemo 7 ili manje i na taj nacin
			//mozemo odrediti dan u sedmici
			while (rezultat >= 7){
				rezultat = rezultat - 7;
			}
			
			System.out.println("Danas je " + niz[danasnjiDan] + " za " + brojDanaNakonDanasnjegDana + " dana ce biti "
					+ niz[rezultat-1] );
			
			input.close();
		}

}

