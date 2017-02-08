package zadaci_08_02_2017;

public class Zadatak4 {

	//ispis broja ponavljanja random brojeva od 0 do 9 100 puta
	public static void main(String[] args) {
		
		//pravimo brojace da izbrojimo koliko se puta ponovio isti broj
		int brojac0 = 0;
		int brojac1 = 0;
		int brojac2 = 0;
		int brojac3 = 0;
		int brojac4 = 0;
		int brojac5 = 0;
		int brojac6 = 0;
		int brojac7 = 0;
		int brojac8 = 0;
		int brojac9 = 0;
		
		//dobijamo 100 nasumicnih brojeva i pamtimo ih u promjenljivim
		for (int i = 0; i<100; i++){
			
			//kreiramo nasumican broj
			int broj = (int)(Math.random()*10);
			
			if (broj == 0){
				brojac0++;
			}
			if (broj == 1){
				brojac1++;
			}
			if (broj == 2){
				brojac2++;
			}
			if (broj == 3){
				brojac3++;
			}
			if (broj == 4){
				brojac4++;
			}
			if (broj == 5){
				brojac5++;
			}
			if (broj == 6){
				brojac6++;
			}
			if (broj == 7){
				brojac7++;
			}
			if (broj == 8){
				brojac8++;
			}
			if (broj == 9){
				brojac9++;
			}
		}
		
		//ispisujemo broj ponavljanja svakog broja
		System.out.println("0 se pojavljuje " + brojac0 + " puta.");
		System.out.println("1 se pojavljuje " + brojac1 + " puta.");
		System.out.println("2 se pojavljuje " + brojac2 + " puta.");
		System.out.println("3 se pojavljuje " + brojac3 + " puta.");
		System.out.println("4 se pojavljuje " + brojac4 + " puta.");
		System.out.println("5 se pojavljuje " + brojac5 + " puta.");
		System.out.println("6 se pojavljuje " + brojac6 + " puta.");
		System.out.println("7 se pojavljuje " + brojac7 + " puta.");
		System.out.println("8 se pojavljuje " + brojac8 + " puta.");
		System.out.println("9 se pojavljuje " + brojac9 + " puta.");

	}

}

