package zadaci_17_02_2017;
//ispis mogucih kombinacija do 7
public class Zadatak3 {
	public static void main(String[] args) {
		
		int brojac = 0;
		System.out.println("Moguce kombinacije su:");
		//postavljamo prvi brojac do 6
		for (int i = 1; i < 7; i++) {
			//postavljamo drugi brojac koji se moze inkrementirati do 7 
			for (int j = 2; j <= 7; j++) {
				if (i != j & i < j) {
					System.out.print(i);
					System.out.print(j + " ");
					brojac++;
				}
			}
		}
		System.out.println("\nBroj mogucih kombinacija je: " + brojac);

	}
}
