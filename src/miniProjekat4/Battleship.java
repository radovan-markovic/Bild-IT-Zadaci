package miniProjekat4;

import java.util.ArrayList;
import java.util.Scanner;

public class Battleship {
	
	//cuvamo tacne koordinate brodovo kako bismo znali koji brod napadamo
	static ArrayList <Integer> poljaIgraca1 = new ArrayList<>();
	static ArrayList <Integer> poljaIgraca2 = new ArrayList<>();
	//brojimo pogotke za svakog igraca
	static int brojPogodakaIgraca1 = 0;
	static int brojPogodakaIgraca2 = 0;
	
	//pravimo niz koji ce ispisati pokusaje igraca kako bi
	//igraci lakse prepoznali gdje da gadjaju sledeci put
	static String [][] pokusajiIgraca1 = new String[10][10];
	static	String [][] pokusajiIgraca2 = new String[10][10];

	public static void main(String[] args) {
		
		//pozivamo metodu za igranje
		igraj();

	}
	
	public static void igraj(){
		
		boolean igrac1 = true;
		boolean igrac2 = false;
		String matricaIgraca2[][] = new String [10][10];
		String matricaIgraca1[][] = new String [10][10];
		
		//punimo matricu igraca 1
		matricaIgraca1 = popuniMatricu(matricaIgraca1 , igrac1, igrac2);
		
		igrac1 = false;
		igrac2 = true;
		
		//punimo matricu igraca 2
		matricaIgraca2 = popuniMatricu(matricaIgraca2, igrac1, igrac2);
		
		//UKOLIKO ZELITE VIDJETI POZICIJE BRODOVA MOZETE 
		//UKLONITI KOMENTAR SA DVIJE LINIJE ISPOD
//		System.out.println(poljaIgraca1);
//		System.out.println(poljaIgraca2);

		boolean igra = true;
	
		System.out.println("Dobrodosli u igru Battleship. Igrac1 prvi igra.");
		
		while (igra){

			igrac1 = true;
			igrac2 = false;
			
			//metoda provjerava da li je unos dobar i broji broj pogodaka;
			provjeraUnosa(matricaIgraca1, matricaIgraca2, igrac1, igrac2);
			
			igrac1 = false;
			igrac2 = true;
			provjeraUnosa(matricaIgraca1, matricaIgraca2, igrac1, igrac2);
			
		}
		
	}
	
	//metoda postavlja nasumicno brodice u matricu
	public static String[][] popuniMatricu(String niz[][] , boolean igrac1, boolean igrac2){
		
		//vrste brodova	(uzeto sa wikipedie)
		int carrier = 5;
		int battleship = 4;
		int cruiser = 3;
		int submarine = 3;
		int destroyer = 2;
		
		//ako metoda vodoravno vraca true popunjavamo matricu vodoravno
		//ako je false brod ce biti prikazan vertikalno
		boolean smjer = smjer();
		//provjeravamo slobodnu poziciju za svaki od brodova
		niz = provjeriSlobodnuPoziciju(niz ,carrier, smjer, igrac1, igrac2);
		smjer = smjer();
		niz = provjeriSlobodnuPoziciju(niz ,battleship, smjer, igrac1, igrac2);
		smjer = smjer();
		niz = provjeriSlobodnuPoziciju(niz ,cruiser ,smjer, igrac1, igrac2);
		smjer = smjer();
		niz = provjeriSlobodnuPoziciju(niz ,submarine,smjer, igrac1, igrac2);
		smjer = smjer();
		niz = provjeriSlobodnuPoziciju(niz ,destroyer, smjer, igrac1, igrac2);
		
		return niz;
	}
	
	//metoda nasumicno generise da li ce brod u matrici biti okrenut vodoravno
	//ili horizontalno
	public static boolean smjer(){
		
		int broj = 0;
		
		broj = (int)(Math.random()*2);
		
		if (broj == 0){
			return true;
		}
		return false;
	}
	
	//metoda provjerava da li je nasumicno polje slobodno za upis
	public static String[][] provjeriSlobodnuPoziciju(String niz[][], int vrstaBroda, boolean smjer, boolean igrac1, boolean igrac2){
		
		int brojReda = (int)(Math.random()*10);
		if (brojReda > vrstaBroda){
			brojReda = brojReda-vrstaBroda;
		}
		int brojKolone = ((int)(Math.random()*10));
		if (brojKolone > vrstaBroda){
			brojKolone = brojKolone -vrstaBroda;
		}
		boolean popuniPolja = true;
		
		//sluzi da provjeravamo da li je unos u polje preslo granicu matrice
		boolean granica = true;
		
		while (popuniPolja){
			if (smjer){
					//popunjavamo red
					for(int i = brojReda, j = brojKolone; j<brojKolone+vrstaBroda; j++){
						if (niz[i][j] != null || niz[i][j] == "O"){
							popuniPolja = true;
							granica = true;
						}
					}
					if (granica == false){
						for(int i = brojReda, j = brojKolone; j<brojKolone+vrstaBroda; j++){
							//ako zeljeni broj polja po horizontali slobodan vrsimo upis
							niz[i][j] = "X";
							//stavljamo okolo brodica znak "O" da ne bi doslo do ukrstanja brodica
							if (i != 0){
								niz[i-1][j] = "O";
							}
							if (i != 9){
								niz[i+1][j] = "O";
							}
							if (j != 9 && j == brojKolone+vrstaBroda-1){
								niz[i][j+1] = "O";
							}
							if (j != 0 && j == brojKolone){
								niz[i][j-1] = "O";
							}
							//dodajemo u listu upisane koordinate za oba igraca
							if (igrac1){
								poljaIgraca1.add(i);
								poljaIgraca1.add(j);
							}
							if (igrac2){
								poljaIgraca2.add(i);
								poljaIgraca2.add(j);
							}
						}
						popuniPolja = false;
						granica = false;
					}
				
			}else{
				//popunjavamo kolonu
				for(int i = brojReda, j = brojKolone; i<brojReda+vrstaBroda; i++){
					if (niz[i][j] != null || niz[i][j] == "O"){
						popuniPolja = true;
						granica = true;
						}
					}
				if (granica == false){
					for(int i = brojReda, j = brojKolone; i<brojReda+vrstaBroda; i++){
						//ako zeljeni broj polja poziciji po vertikalislobodan vrsimo upis
						niz[i][j] = "X";
						//stavljamo okolo brodica znak "O" da ne bi doslo do ukrstanja brodica
						if (j != 0){
							niz[i][j-1] = "O";
						}
						if (j != 9){
							niz[i][j+1] = "O";
						}
						if (i != 9 && i == brojReda+vrstaBroda-1){
							niz[i+1][j] = "O";
						}
						if (i != 0 && i == brojReda){
							niz[i-1][j] = "O";
						}
						//dodajemo u listu upisane koordinate za oba igraca
						if (igrac1){
							poljaIgraca1.add(i);
							poljaIgraca1.add(j);
						}
						if (igrac2){
							poljaIgraca2.add(i);
							poljaIgraca2.add(j);
						}
					}
					popuniPolja = false;
					granica = false;
				}
			}
			//trazimo nova polja ukoliko nije moguce popuniti postojeca
			if (granica){
				brojReda = (int)(Math.random()*10);
				if (brojReda > vrstaBroda){
					brojReda = brojReda- vrstaBroda;
				}
				brojKolone = ((int)(Math.random()*10));
				if (brojKolone > vrstaBroda){
					brojKolone = brojKolone - vrstaBroda;
				}
			}
			granica = false;
		}
		return niz;
	}
	
	//metoda za provjeru unosa, provjeravamo ispravnost unosa i da li je unos ponovljen
	public static void provjeraUnosa(String matricaIgraca1[][], String matricaIgraca2[][], boolean igrac1, boolean igrac2){
		
		Scanner input = new Scanner(System.in);
		
		boolean test = true;
		int brojReda = -1;
		int brojKolone = -1;
		
		while(igrac1){
			//ispisujemo matricu za kako bismo vidjeli pokusaje
			System.out.println("Igrac1 Do sada ste gadjali ove pozicije: ");
			System.out.println(" ---------------------------------------");
			for (int i = 0; i<pokusajiIgraca1.length; i++){
				for (int j = 0; j <pokusajiIgraca1[i].length; j++){
					if (j == 0){
						System.out.print("| ");
					}
					if (pokusajiIgraca1[i][j] != null){
						System.out.print(pokusajiIgraca1[i][j] + " | ");
					}
					if (pokusajiIgraca1[i][j] == null){
						System.out.print("  | ");
					}
				}
				System.out.print("\n ---------------------------------------");
				System.out.println();
			}
			
			while(test){//pravimo provjeru za unos
				try{
					while (brojReda < 0 || brojReda > 9){
						System.out.println("Igrac1 - Unesite broj reda izmedju 0 i 9:");				
						brojReda = input.nextInt();
						input.nextLine();
					}
					while (brojKolone < 0 || brojKolone > 9){
						System.out.println("Igrac1 - Unesite broj kolone izmedju 0 i 9:");				
						brojKolone = input.nextInt();
						input.nextLine();
					}
					if(pokusajiIgraca1[brojReda][brojKolone] == "X"){
						System.out.println("Vec ste odigrali tu poziciju, pokusajte ponovo:");
						brojReda = -1;
						brojKolone = -1;
						test = true;
					}else{
						test = false;
					}
				}catch(Exception e){
					System.out.println("Nepravilan unos, unesite ponovo:");
					input.nextLine();
				}
			}
			test = true;
			
			//provjeravamo pogodak igraca 1
			if (matricaIgraca2[brojReda][brojKolone] == "X"){
				System.out.println("Pogodak!");
				provjeriVrstuBroda(brojReda, brojKolone, igrac1, igrac2);
				brojPogodakaIgraca1++;
				pokusajiIgraca1[brojReda][brojKolone] = "X";
				
				if (brojPogodakaIgraca1 == 17){
					input.close();
					System.out.println("Igrac 1 je pobijedio!");
					isipisiMatrice(matricaIgraca1, matricaIgraca2);
					System.exit(1);
				}
			}else{
				System.out.println("Promasaj! Drugi igrac igra.");
				System.out.println();
				pokusajiIgraca1[brojReda][brojKolone] = "X";
				igrac1 = false;
			}
			brojReda = -1;
			brojKolone = -1;
		}
		
		while(igrac2){
			
			//ispisujemo matricu za kako bismo vidjeli pokusaje
			System.out.println("Igrac2 Do sada ste gadjali ove pozicije: ");
			System.out.println(" ---------------------------------------");
			for (int i = 0; i<pokusajiIgraca2.length; i++){
				for (int j = 0; j <pokusajiIgraca2[i].length; j++){
					if (j == 0){
						System.out.print("| ");
					}
					if (pokusajiIgraca2[i][j] != null){
						System.out.print(pokusajiIgraca2[i][j] + " | ");
					}
					if (pokusajiIgraca2[i][j] == null){
						System.out.print("  | ");
					}
				}
				System.out.print("\n ---------------------------------------");
				System.out.println();
			}
			
			while(test){//pravimo provjeru za unos
				try{
					while (brojReda < 0 || brojReda > 9){
						System.out.println("Igrac 2 - Unesite broj reda izmedju 0 i 9:");				
						brojReda = input.nextInt();
						input.nextLine();
					}
					while (brojKolone < 0 || brojKolone > 9){
						System.out.println("Igrac2 - Unesite broj kolone izmedju 0 i 9:");				
						brojKolone = input.nextInt();
						input.nextLine();
					}
					if(pokusajiIgraca2[brojReda][brojKolone] == "X"){
						System.out.println("Vec ste odigrali tu poziciju, pokusajte ponovo:");
						brojReda = -1;
						brojKolone = -1;
						test = true;
					}else{
						test = false;
					}
				}catch(Exception e){
					System.out.println("Nepravilan unos, unesite ponovo:");
					input.nextLine();
				}
			}
			test = true;
			
			//provjeravamo pogodak igraca 2
			if (matricaIgraca1[brojReda][brojKolone] == "X"){
				System.out.println("Pogodak!");
				provjeriVrstuBroda(brojReda, brojKolone, igrac1, igrac2);
				brojPogodakaIgraca2++;
				pokusajiIgraca2[brojReda][brojKolone] = "X";
				
				if (brojPogodakaIgraca2 == 17){
					input.close();
					System.out.println("Igrac 2 je pobijedio!");
					isipisiMatrice(matricaIgraca1, matricaIgraca2);
					System.exit(1);
				}
			}else{
				System.out.println("Promasaj! Drugi igrac igra.");
				System.out.println();
				igrac2 = false;
				pokusajiIgraca2[brojReda][brojKolone] = "X";
			}
			
			brojReda = -1;
			brojKolone = -1;
		}
	}
	
	//metoda provjerava i ispisuje vrstu broda koju je igrac pogodio
	public static void provjeriVrstuBroda(int broj1, int broj2, boolean igrac1, boolean igrac2){
	
		if (igrac1){
			for(int i = 0; i<poljaIgraca2.size()-1; i+=2){
				if (broj1 == poljaIgraca2.get(i) && broj2 == poljaIgraca2.get(i+1)){
					if (i<9){
						System.out.println("Pogodili ste nosac brodova.");
					}
					if (i>9 && i<=17){
						System.out.println("Pogodili ste vojni brod.");
					}
					if (i>17 && i<=23){
						System.out.println("Pogodili ste krstaricu.");
					}
					if (i>23 && i<=29){
						System.out.println("Pogodili ste podmornicu.");
					}
					if (i>29){
						System.out.println("Pogodili ste razarac.");
					}
				}
			}
		}
		if (igrac2){
			for(int i = 0; i<poljaIgraca1.size()-1; i+=2){
				if (broj1 == poljaIgraca1.get(i) && broj2 == poljaIgraca1.get(i+1)){
					if (i<9){
						System.out.println("Pogodili ste nosac brodova.");
					}
					if (i>9 && i<=17){
						System.out.println("Pogodili ste vojni brod.");
					}
					if (i>17 && i<=23){
						System.out.println("Pogodili ste krstaricu.");
					}
					if (i>23 && i<=29){
						System.out.println("Pogodili ste podmornicu.");
					}
					if (i>29){
						System.out.println("Pogodili ste razarac.");
					}
				}
			}
		}
	}
	
	//na kraju igre prikazujemo raspored brodovo igraca 1 i igraca 2
	public static void isipisiMatrice(String matricaIgraca1[][], String matricaIgraca2[][]){
		
		System.out.println("Matrica igraca 1");
		for(int i = 0; i<matricaIgraca1.length; i++){
			for(int j = 0; j<matricaIgraca1[i].length; j++){
				if (matricaIgraca1[i][j] == null || matricaIgraca1[i][j] == "O"){
					System.out.print(" | ");
				}else{
				System.out.print(" "+ matricaIgraca1[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Matrica igraca 2");
		for(int i = 0; i<matricaIgraca2.length; i++){
			for(int j = 0; j<matricaIgraca2[i].length; j++){
				if (matricaIgraca2[i][j] == null || matricaIgraca2[i][j] == "O"){
					System.out.print(" | ");
				}else{
					System.out.print(" "+ matricaIgraca2[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
