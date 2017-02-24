package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int broj = 0;
		int duzina = 0;
		boolean test = true;
		
		while (test){//testiramo unos
			try{
				while (broj <= 0){
					System.out.println("Unesite broj:");
					broj = input.nextInt();
					input.nextLine();
				}
				while (duzina <= 0){
					System.out.println("Unesite duzinu:");
					duzina = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, morate unijeti pozitivan broj");
				input.nextLine();
			}
		}
		
		format(broj, duzina);
		input.close();
	}
	
	//metoda koja formatira broj
	public static String format(int number, int width){
		
		//pretvaramo broj u string
		String str  = number+"";
		
		//ako je broj manji od duzine dodajemo mu nule sa lijeve strane
		if (str.length() < width){
			
			//broj nula koje treba dodati
			int brojNula = width - str.length();
			
			for (int i = 0; i<brojNula; i++){
				System.out.print("0");
			}
			System.out.print(str);
		
		//ako nije ispisujemo broj
		}else{
			System.out.println(str);
		}
		
		return null;
	}

}
