package zadaci_11_02_2017;

public class Zadatak4 {
	public static void nasumicni(int broj){
		
		int noviRed = 1;
		//trazimo 100 nasumicnih brojeva
		for (int i=0; i<broj; i++){
			int rezultat1 = ((int)(Math.random() * 100));
			//ispisujemo brojeve, 10 u redu
			if (noviRed == 10){
			System.out.println(rezultat1);
				noviRed = 1;
			}else{
				System.out.print(rezultat1 + " ");
				noviRed++;
			}
		}
		//trazimo 100 nasumicnih karaktera
		for (int i=0; i<broj; i++){
			//dobijamo nasumicne brojeve
			int rezultat1 = (65 + (int)(Math.random() * 26));
			//pretvaramo nasumican broj u karakter
			char ch = (char) rezultat1;
			//ispisujemo 10 karaktera po liniji
			if (noviRed == 10){
				System.out.println(ch);
				noviRed = 1;
			}else{
				System.out.print(ch + " ");
				noviRed++;
			}
		}
	}

	public static void main(String[] args) {
		//pozivamo metodu za printanje nasumicnih karaktera
		nasumicni(100);

	}
}
