package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
	
		boolean test = true;
		double broj = 0;
		double mjesecnaUplata = 0;
		Scanner input = new Scanner(System.in);
		
		while (test){//testiramo unos
			try{
				while (mjesecnaUplata < 1){
					System.out.println("Unesite mjesecnu uplatnu stopu, npr. 100:");
					mjesecnaUplata = Double.parseDouble(input.nextLine());
				}
				while (broj < 1){
					System.out.println("Unesite mjesece");
					broj = Double.parseDouble(input.nextLine());
				}
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos unesite ponovo");
			}
		}
		double stednja = 0;
		double rezultat = 0;
		
		if (broj == 0){
			System.out.printf("Stednja je: " + "%.3f",  + mjesecnaUplata);
		}else{
		System.out.println("Stednja po mjesecima: ");	
		for (int i=0; i < broj;){
			//racunamo intresnu stopu za svaki mjesec
			rezultat = ((0.05/12) * stednja) + mjesecnaUplata;
			stednja = rezultat + stednja;
			String ispis = String.format("%.3f", (stednja * (1 + (0.05/12))));
			System.out.println(ispis);	
			
			int a = (int)(broj);
			//ispisujemo iznos za posljednji mjesec
			if (broj == (i+1)){	
			System.out.println("\nStednja za " + a + ". mjesec je: ");	
			System.out.println(ispis);
			}
			i++;			
		}
		}
	}

}
