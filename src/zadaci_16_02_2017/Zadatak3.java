package zadaci_16_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int brojac = 0;
		
		System.out.println("Brojevi djeljivi sa 5 i sa 6 su:");
		
		//ispisujemo brojeve djeljive sa 5 i sa 6
		for (int i = 100; i<=1000; i++){
			if ((i % 5 == 0) && (i % 6 == 0)){
				System.out.print(i + " ");
				brojac++;
				//ako imamo 10 brojeva u redu prelazimo u novi red
				if (brojac % 10 == 0){
					System.out.println();
				}
			}
			
		}

	}

}
