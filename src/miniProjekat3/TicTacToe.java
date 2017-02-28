package miniProjekat3;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		int brojac = 0;
		int igracPobjede = 0;
		int igrac2Pobjede = 0;
		
		System.out.println("Dobrodosli u igru iks oks. Unesite 1, 2 ili 3 da uneste vrijednost u red ili kolonu.");
		
		while (brojac == 0){
			//pozivamo metodu za ogru
			int rezultat = ticTacToe();
			//na osnovu return vrijednosti iz metode biljezimo ko je pobijedio
			if(rezultat == 1){
				igracPobjede++;
				System.out.println("Trenutni rezultat je: Igrac1: " + igracPobjede + " Igrac2: " + igrac2Pobjede);
				System.out.println();
			} 
			if (rezultat == 2){
				igrac2Pobjede++;
				System.out.println("Trenutni rezultat je: Igrac1: " + igracPobjede + " Igrac2: " + igrac2Pobjede);
				System.out.println();
			}
			if (rezultat == 3){
				System.out.println("Trenutni rezultat je: Igrac1: " + igracPobjede + " Igrac2: " + igrac2Pobjede);
				System.out.println();
				brojac = 0;
			}
			if (rezultat == 4){
				System.out.println("Zavrsili ste igru. Krajnji rezultat je: Igrac: " + igracPobjede + " Igrac2: " + igrac2Pobjede);
				System.exit(0);
			}
		}

	}
	
	//metoda igre
	public static int ticTacToe(){
		
		String[][] niz = new String [3][3];
		int brojReda = -1;
		int brojKolone = -1;
		boolean test = true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nova igra...Za prekid igre pritisnite 0");
		
		//testiramo da li je igra zavrsena
		while (pobjednik(niz) == false){
			//Igrac1 igra
			//testiramo unos reda
			System.out.println("Unesite broj reda:");
			while (test){
				try{
					brojReda = input.nextInt();
					input.nextLine();
					test = false;
				}catch (Exception e){
					System.out.println("Nepravilan unos, unesite ponovo:");
					input.nextLine();
				}
			}
			test = true;
			
			if (brojReda == 0){
				return 4;
			}
			//provjeravamo da li je unos reda ili kolone prekoracen
			brojReda = provjeraUnosa(brojReda) - 1;
			
			//provjeravamo unos kolone
			System.out.println("Unesite broj kolone:");
			while (test){
				try{
					brojKolone = input.nextInt();
					input.nextLine();
					test = false;
				}catch (Exception e){
					System.out.println("Nepravilan unos, unesite ponovo:");
					input.nextLine();
				}
			}
			test = true;
			
			if (brojKolone == 0){
				return 4;
			}
			//provjeravamo da li je unos reda ili kolone prekoracen
			brojKolone = provjeraUnosa(brojKolone) - 1;
			
			boolean igrac1 = true;
			boolean igrac2 = false;
			
			//upisujemo u niz potez igraca1
			String[][] nizIgra = upisUNiz(niz, brojReda, brojKolone, igrac1, igrac2);
			System.out.println(" -----------");
			for (int i = 0; i<nizIgra.length; i++){
				for (int j = 0; j <nizIgra[i].length; j++){
					if (j == 0){
						System.out.print("| ");
					}
					if (niz[i][j] != null){
						System.out.print(nizIgra[i][j] + " | ");
					}
					if (niz[i][j] == null){
						System.out.print("  | ");
					}
				}
				System.out.print("\n -----------");
				System.out.println();
			}
			//provjeravamo da li ima pobjednika
			if (pobjednik(niz)== true){
				System.out.println("Pobijedili ste!");
				return 1;
				//return-1;
			}
			
			//slucaj ako je nerijeseno
			int brojac = 0;
			for (int i = 0; i<nizIgra.length; i++){
				for (int j = 0; j <nizIgra[i].length; j++){
					if (nizIgra[i][j] != null){
						brojac++;
					}
				}
			}
			if (brojac == 9){
				System.out.println("Nerijeseno!");
				return 3;
			}
			
			// Igrac2 igra:
			igrac1 = false;
			
			igrac2 = true;
			//igrac2 igra
			//testiramo unos reda
			System.out.println("Unesite broj reda:");
			while (test){
				try{
					brojReda = input.nextInt();
					input.nextLine();
					test = false;
				}catch (Exception e){
					System.out.println("Nepravilan unos, unesite ponovo:");
					input.nextLine();
				}
			}
			test = true;
			
			if (brojReda == 0){
				return 4;
			}
			//provjeravamo da li je unos reda ili kolone prekoracen
			brojReda = provjeraUnosa(brojReda) - 1;

			System.out.println("Unesite broj kolone:");
			//testiramo unos kolone
			while (test){
				try{
					brojKolone = input.nextInt();
					input.nextLine();
					test = false;
				}catch (Exception e){
					System.out.println("Nepravilan unos, unesite ponovo:");
					input.nextLine();
				}
			}
			test = true;
			
			if (brojKolone == 0){
				return 4;
			}
			//provjeravamo da li je unos reda ili kolone prekoracen
			brojKolone = provjeraUnosa(brojKolone) - 1;
			//upisujemo potez igraca2
			nizIgra = upisUNiz(niz, brojReda, brojKolone, igrac1,  igrac2);
			System.out.println(" -----------");
			for (int i = 0; i<nizIgra.length; i++){
				for (int j = 0; j <nizIgra[i].length; j++){
					if (j == 0){
						System.out.print("| ");
					}
					if (niz[i][j] != null){
						System.out.print(nizIgra[i][j] + " | ");
					}
					if (niz[i][j] == null){
						System.out.print("  | ");
					}
				}
				System.out.print("\n -----------");
				System.out.println();
			}
			//provjeravamo da li ima pobjednika
			if (pobjednik(niz)== true){
				System.out.println("Pobijedili ste!");
				return 2;
			}
			igrac2 = false;
		
		}
		return-1;
		
	}
	
	//metoda koja provjerava da li su zadovoljeni uslovi za pobjedu
	public static boolean pobjednik(String niz[][]){
		
		if ((niz[0][0] == "X" && niz[0][1] == "X" && niz[0][2] == "X") || (niz[0][0] == "O" && niz[0][1] == "O" && niz[0][2] == "O")){
			return true;
		}
		if ((niz[1][0] == "X" && niz[1][1] == "X" && niz[1][2] == "X") || (niz[1][0] == "O" && niz[1][1] == "O" && niz[1][2] == "O")){
			return true;
		}
		if ((niz[2][0] == "X" && niz[2][1] == "X" && niz[2][2] == "X") || (niz[2][0] == "O" && niz[2][1] == "O" && niz[2][2] == "O")){
			return true;
		}
		if ((niz[0][0] == "X" && niz[1][0] == "X" && niz[2][0] == "X") || (niz[0][0] == "O" && niz[1][0] == "O" && niz[2][0] == "O")){
			return true;
		}
		if ((niz[0][1] == "X" && niz[1][1] == "X" && niz[2][1] == "X") || (niz[0][1] == "O" && niz[1][1] == "O" && niz[2][1] == "O")){
			return true;
		}
		if ((niz[0][2] == "X" && niz[1][2] == "X" && niz[2][2] == "X") || (niz[0][2] == "O" && niz[1][2] == "O" && niz[2][2] == "O")){
			return true;
		}
		if ((niz[0][0] == "X" && niz[1][1] == "X" && niz[2][2] == "X") || (niz[0][0] == "O" && niz[1][1] == "O" && niz[2][2] == "O")){
			return true;
		}
		if ((niz[2][0] == "X" && niz[1][1] == "X" && niz[0][2] == "X") || (niz[2][0] == "O" && niz[1][1] == "O" && niz[0][2] == "O")){
			return true;
		}
		return false;
	}
	
	//metoda za upis poteza u iks oks tabelu
	public static String[][] upisUNiz(String[][] niz, int red, int kolona, boolean igrac1, boolean igrac2){
		
		Scanner input = new Scanner(System.in);
		boolean test = true;
		
		if (igrac1) {
			while (niz[red][kolona] != null) {
				System.out.println("Ta pozicija je zauzeta, odigrajte neku drugu:");
				System.out.println("Unesite red:");
				//testiramo ponovo unos ako unos nije odgovarajuci
				while (test){
					try{
						red = input.nextInt();
						input.nextLine();
						test = false;
					}catch (Exception e){
						System.out.println("Nepravilan unos, unesite ponovo:");
						input.nextLine();
					}
				}
				test = true;
				red = provjeraUnosa(red)-1;
				System.out.println("Unesite kolonu:");
				//testiramo ponovo unos ako unos nije odgovarajuci
				while (test){
					try{
						kolona = input.nextInt();
						input.nextLine();
						test = false;
					}catch (Exception e){
						System.out.println("Nepravilan unos, unesite ponovo:");
						input.nextLine();
					}
				}
				test = true;				
				kolona = provjeraUnosa(kolona)-1;
			}
			niz[red][kolona] = "X";
		}
		if (igrac2) {
			while (niz[red][kolona] != null) {
				System.out.println("Ta pozicija je zauzeta, odigrajte neku drugu:");
				System.out.println("Unesite red:");
				//testiramo ponovo unos ako unos nije odgovarajuci
				while (test){
					try{
						red = input.nextInt();
						input.nextLine();
						test = false;
					}catch (Exception e){
						System.out.println("Nepravilan unos, unesite ponovo:");
						input.nextLine();
					}
				}
				test = true;
				red = provjeraUnosa(red)-1;
				System.out.println("Unesite kolonu:");
				//testiramo ponovo unos ako unos nije odgovarajuci
				while (test){
					try{
						kolona = input.nextInt();
						input.nextLine();
						test = false;
					}catch (Exception e){
						System.out.println("Nepravilan unos, unesite ponovo:");
						input.nextLine();
					}
				}
				test = true;
				kolona = provjeraUnosa(kolona)-1;
			}
			niz[red][kolona] = "O";
		}
		return niz;
	}
	
	//metoda provjerava da li je igrac prekoracio unos reda ili kolone
	public static int provjeraUnosa(int broj){
		Scanner input = new Scanner(System.in);
		boolean test = true;
		
		while(broj != 1 && broj != 2 && broj != 3){
			System.out.println("Broj koji ste unijeli nije odgovarajuci za red ili kolonu.");
			System.out.println("Unesite ponovo:");
				try{
					broj = input.nextInt();
					input.nextLine();
					test = false;
				}catch (Exception e){
					System.out.println("Pogresan unos");
					input.nextLine();
				}
			
		}
		
		return broj;
	}

}

