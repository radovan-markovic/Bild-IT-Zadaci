package zadaci_13_02_2017;

//ispis nasumicno dobijene karte
public class Zadatak2 {
	public static void main(String[] args) {
		
		// pravimo nasumican broj od 1 do 14 za ispis znaka
		int rez1 = 2 + ((int)(Math.random() * 13));
		
		//u zavisnosti od dobijenog nasumicnog broja ispisujemo znak
		if (rez1 == 2 || rez1 == 3 || rez1 == 4 || rez1 == 5 || rez1 == 6 || rez1 == 7
				|| rez1 == 8 || rez1 == 9 || rez1 == 10 ){
			System.out.print("Karta je: " + rez1 );
		}
		if (rez1 == 11){
			System.out.print("Karta je: zandar" );
		}
		if (rez1 == 12){
			System.out.print("Karta je: dama" );
		}
		if (rez1 == 13){
			System.out.print("Karta je: kralj" );
		}
		if (rez1 == 14){
			System.out.print("Karta je: kec" );
		}
		
		//pravimo nasumican broj za ispis boje
		int rez2 = ((int)(Math.random() * 4));
		//ispisujemo boju
		if (rez2 == 0){
			System.out.print(" srce" );
		}
		if (rez2 == 1){
			System.out.print(" kocka" );
		}
		if (rez2 == 2){
			System.out.print(" list" );
		}
		if (rez2 == 3){
			System.out.print(" mak" );
		}
	}
}
