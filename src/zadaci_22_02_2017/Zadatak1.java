package zadaci_22_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		
		//trazimo nasumicni broj mjeseca
		int mjesec = (int)(1+(Math.random()*12));
		System.out.println(mjesec);
		
		//ispisujemo mjesec u zavisnosti od dobijenog broja
		if (mjesec == 1){
			System.out.println("Januar");
		}
		if (mjesec == 2 ){
			System.out.println("Februar");
		}
		if (mjesec == 3){
			System.out.println("Mart");
		}
		if (mjesec == 4){
			System.out.println("April");
		}
		if (mjesec == 5){
			System.out.println("Maj");
		}
		if (mjesec == 6){
			System.out.println("Jun");
		}
		if (mjesec == 7){
			System.out.println("Jul");
		}
		if (mjesec == 8){
			System.out.println("Avgust");
		}
		if (mjesec == 9){
			System.out.println("Septembar");
		}
		if (mjesec == 10){
			System.out.println("Oktobar");
		}
		if (mjesec == 11){
			System.out.println("Novembar");
		}
		if (mjesec == 12){
			System.out.println("Decembar ");
		}
	}

}
