package zadaci_20_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		
		//vrsimo nasumicni odabiri velikih slova
		int slovo1 = 65 + ((int)(Math.random() * 26));
		char slovoA = (char) slovo1;
		int slovo2 = 65 + ((int)(Math.random() * 26));
		char slovoB = (char) slovo2;
		int slovo3 = 65 + ((int)(Math.random() * 26));
		char slovoC = (char) slovo3;
		//vrsimo nasumicni odabir brojeva
		int broj1 = ((int)(Math.random() * 10));
		int broj2 = ((int)(Math.random() * 10));
		int broj3 = ((int)(Math.random() * 10));
		int broj4 = ((int)(Math.random() * 10));
		
		System.out.print(slovoA + ""+ slovoB + ""+ slovoC + "-" + broj1 + ""+ broj2 + ""+ broj3 + ""+ broj4);


	}

}
