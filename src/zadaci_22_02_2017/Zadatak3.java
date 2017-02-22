package zadaci_22_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		
		double suma = 0;
		
		//racunamo sumu po datoj formuli
		for (double i = 1; i<=97; i+=2){
			suma = suma + (i / (i+2));
		}
		System.out.printf("%.2f",suma);
	}

}
