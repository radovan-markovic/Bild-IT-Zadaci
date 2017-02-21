package zadaci_21_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		double racun = -1;
		double procenatNapojnice = -1;
		
		while (test){//testiramo unos
			try{
				while(racun < 0){
					System.out.println("Unesite iznos racuna:");
					racun = input.nextDouble();
					input.nextLine();
				}
				while(procenatNapojnice < 0){
					System.out.println("Unesite procenat napojnice:");
					procenatNapojnice = input.nextDouble();
					input.nextLine();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
			
		}
		//racunamo procenat napojnice
		double napojnica = (procenatNapojnice / 100) * racun;
		//ispisujemo ukupan iznos rezultat
		System.out.println("Ukupan iznos racuna: " + (racun + napojnica));
		
		input.close();

	}

}
