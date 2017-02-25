package zadaci_25_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		
		//pravimo niz u koji cemo smijestati broj pojavljivanja broja
		int[] counts = new int[10];
		
		//generisemo 100 nasumicnih brojeva 100 puta
		for (int i = 0; i<100; i++){
			int broj = (int)(Math.random()*10);
			//u zavisnosti od toga koji smo broj dobili inkrementiramo brojac
			if (broj == 0){
				counts[0]++;
			}
			if (broj == 1){
				counts[1]++;
			}
			if (broj == 2){
				counts[2]++;
			}
			if (broj == 3){
				counts[3]++;
			}
			if (broj == 4){
				counts[4]++;
			}
			if (broj == 5){
				counts[5]++;
			}
			if (broj == 6){
				counts[6]++;
			}
			if (broj == 7){
				counts[7]++;
			}
			if (broj == 8){
				counts[8]++;
			}
			if (broj == 9){
				counts[9]++;
			}
		}
		
		//ispisujemo broj pojavljivanja broja
		System.out.println("0 se pojavljuje " + counts[0]);
		System.out.println("1 se pojavljuje " + counts[1]);
		System.out.println("2 se pojavljuje " + counts[2]);
		System.out.println("3 se pojavljuje " + counts[3]);
		System.out.println("4 se pojavljuje " + counts[4]);
		System.out.println("5 se pojavljuje " + counts[5]);
		System.out.println("6 se pojavljuje " + counts[6]);
		System.out.println("7 se pojavljuje " + counts[7]);
		System.out.println("8 se pojavljuje " + counts[8]);
		System.out.println("9 se pojavljuje " + counts[9]);
	}

}
