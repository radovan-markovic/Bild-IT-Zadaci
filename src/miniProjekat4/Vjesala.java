package miniProjekat4;

import java.util.Scanner;

public class Vjesala {
	
	static char[] pogadjanaSlova = new char[30];
	
	//pravimo niz sa rijecima koje cemo pogadjati
	static String [] rijeci = {"macka", "sunce", "drvo", "kafa", "telefon"};
			
	static int randomBroj = (int)(Math.random()*rijeci.length);
	
	static char[] zvjezdice = new char [rijeci[randomBroj].length()];
	
	static int brojacPogodaka = 0;
	static int brojacPromasaja= 0;
	

	public static void main(String[] args) {
		
		System.out.print("Dobordosli u igru vjesala: ");
		//pozivam metodu igr vjesala
		vjesala();

	}
	
	//metoda igre vjesala
	public static void vjesala(){
		//unosimo zvjezdice da simuliramo skrivenu rijec
		for (int j= 0; j<zvjezdice.length; j++){
			zvjezdice[j] = '*';
		}
		
		boolean igra = true;
		
		System.out.println("Pogadjate rijec sa " + rijeci[randomBroj].length() + " slova:");
		
		while (igra){
			if(provjeraUnosa()){//testiramo igru i provjeravao da li smo pogodili ili promasili rijec
				if (brojacPogodaka == rijeci[randomBroj].length()){
					System.out.println("Pogodili ste rijec!");
					igra = false;
					break;
				}
				
				if (brojacPromasaja == 6){
					System.out.println("Objeseni ste!");
					System.out.println("Trazena rijec je: " + rijeci[randomBroj]);
					igra = false;
				}
				
			}
		}
	}
	
	//provjeravamo unos, da li je unos ponovljen ili nije ispravan
	public static boolean provjeraUnosa(){
		
		Scanner input = new Scanner(System.in);

			System.out.println("Unesite slovo:");
			char slovo = input.next().charAt(0);
			slovo = Character.toLowerCase(slovo); 
			
			while (ponavljanjeSlova(slovo) || !Character.isLetter(slovo)){
				System.out.println("To slovo ste vec pogadjali ili unos nije odgovarajuci pokusajte drugo slovo:");
				slovo = input.next().charAt(0);
				slovo = Character.toLowerCase(slovo); 
			}
			
			int brojac = 0;
			
				System.out.println("Trazena rijec je:");
				for (int i = 0; i<rijeci[randomBroj].length(); i++){
					//ispisujemo slovo koje smo pogodili, skrivena ispisujemo zvjezdicama
					if (rijeci[randomBroj].charAt(i) == slovo){
						zvjezdice[i] = slovo;
						System.out.print(zvjezdice[i]);
						brojacPogodaka++;
						brojac++;
					}else{
						System.out.print(zvjezdice[i]);	
					}
				}
		
		System.out.println();
		//brojimo promasaje i pozivamo metodu za prikaz dijela tijela koji je objesen
		for (int i = 0; i<rijeci[randomBroj].length(); i++){
			if (rijeci[randomBroj].charAt(i) != slovo){
				if (brojac == 0){
					brojacPromasaja++;
					vjesajDijeloveTijela(brojacPromasaja);
				}
				brojac++;
			}
		}
		return true;
		
	}
	
	//metoda provjerava da li je slovo vec pogadjano
	public static boolean ponavljanjeSlova(char slovo){
		
		for (int i = 0; i<pogadjanaSlova.length; i++){
			if (slovo == pogadjanaSlova[i]){
				return true;
			}
			
		}
		
		if (Character.isLetter(slovo)){
			for (int i = 0; i < pogadjanaSlova.length; i++){
					if (pogadjanaSlova[i] == '\u0000'){
						pogadjanaSlova[i] = slovo;
						break;
					}
			}
		}
		
		return false;
	}
	
	//metoda prikazuje koji su dijelovi tijela objeseni
	public static void vjesajDijeloveTijela(int brojac){
		if (brojac > 0){
			System.out.println("Niste pogodili slovo.");
		}
		if (brojac == 1){
			System.out.println("|----|"
					+        "\n|    O "
					+        "\n|"
					+        "\n|"
					+       "\n/\\");
		}
		if (brojac == 2){
			System.out.println("|----|"
					+        "\n|    O "
					+        "\n|    |"
					+        "\n|"
					+       "\n/\\");
		}
		if (brojac == 3){
			System.out.println("|----|"
					+        "\n|    O "
					+        "\n|    |/"
					+        "\n|"
					+       "\n/\\");
		}
		if (brojac == 4){
			System.out.println("|----|"
					+        "\n|    O "
					+        "\n|   \\|/"
					+        "\n|"
					+       "\n/\\");
		}
		if (brojac == 5){
			System.out.println("|----|"
					+        "\n|    O "
					+        "\n|   \\|/"
					+        "\n|     \\"
					+       "\n/\\");
		}
		if (brojac == 6){
			System.out.println("|----|"
					+        "\n|    O "
					+        "\n|   \\|/"
					+        "\n|   / \\"
					+       "\n/\\");
		}
	}

}
