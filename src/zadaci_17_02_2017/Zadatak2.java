package zadaci_17_02_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int brojac = 0;
		int noviRed = 0;
		int stanje = 1;
		//prvi brojac za iteracije
		for (int i = 2; i <= 10000;){
			
			//drugi brojac za ispis brojeva
			for(int j = 1; j<=i;){
			
				if(i%j==0){		
					brojac= brojac+1;
				}
				
				if (brojac == 2 & i==j){
					brojac = 0;
					//ispisujemo twin proste brojeve ako je ispunjen uslov
					if (i-stanje == 2){
						System.out.print(stanje+" ");
						System.out.print(i+"   ");
						noviRed++;
					}
					stanje = i;
					//ispisujemo 10 parova u redu
					if (noviRed == 10){	
						System.out.println("\n");
						noviRed=0;			
					}
					
				}
				j++;
			}
			if (brojac != 2){
				brojac = 0;
			}
	
			i++;	
			
		}

	}

}
