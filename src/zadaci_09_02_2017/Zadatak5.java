package zadaci_09_02_2017;

import java.util.Scanner;

//bacanje novcica
public class Zadatak5 {

public static void bacaj(int brojac){
		
		int pismo = 0;
		int glava = 0;
		
		//prolazimo kroz petlju da simuliramo bacanje novcica
		for (int i = 0; i < brojac; i++){
			
			//dobijamo nasumican broj 0 ili 1
			int broj = (int)(Math.random()*2);
			
			if (broj == 0){
				pismo++;
			}else{
				glava++;
			}
		}
		
		//ispisujemo koliko se puta pojavila glava odnosno pismo
		System.out.println("Glava je bila: " + glava + " puta" );
		System.out.println("Pismo je bilo: " + pismo + " puta" );
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int brojBacanja = 0;
		boolean test = true;
		
		while(test){//pravimo provjeru za unos
			try{
				System.out.println("Koliko zelite puta baciti novcic?");
				brojBacanja = input.nextInt();
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		//prosljedjujemo metodi koliko puta zelimo baciti novcic
		bacaj(brojBacanja);
	
	}

}
