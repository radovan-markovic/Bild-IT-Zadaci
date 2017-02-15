package zadaci_15_02_2017;

public class Zadatak4 {
//ispis savrsenog broja	
public static void main(String[] args) {
		
		int suma = 0;
		
		//ispis savrsenog broja
		for (int i=2; i<=10000; i++){
			
			for (int j=1; j<i; j++){
				
				if (i % j == 0){
					suma = suma +j;			
				}			
			}
			if (suma == i){
				System.out.println(i);
			}
			suma = 0;
		}

	}
}
