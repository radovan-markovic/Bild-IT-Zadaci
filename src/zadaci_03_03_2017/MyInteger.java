package zadaci_03_03_2017;

public class MyInteger {

	private int value;
	
	MyInteger (int value){
		
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	//metoda provjerava da li je broj paran
	public boolean isEven(){
		if (getValue() %2 == 0){
			return true;
		}
		return false;
	}
	//metoda provjerava da li je broj neparan
	public boolean isOdd(){
		if (getValue() % 2 != 0){
			return true;
		}
		return false;
	}
	//metoda provjerava da li je broj prost
	public boolean isPrime(){
		for(int i=2; i<getValue(); i++) {
	        if(getValue() %i == 0)
	            return false;
	    }
	    return true;
	}
	
	//staticna metoda koja provjerava da li je broj paran
	public static boolean isEven(int value){
		if (value % 2 == 0){
			return true;
		}
		return false;
	}
	
	//staticna metoda koja provjerava da li je broj neparan
	public static boolean isOdd(int value){
		if (value % 2 != 0){
			return true;
		}
		return false;
	}
	
	//staticna metoda koja provjerava da li je broj prost
	public static boolean isPrime (int value){
		 for(int i=2;i<value;i++) {
		        if(value % i==0)
		            return false;
		    }
		    return true;
	}
	//staticna metoda koja provjerava da li je proslijedjeni objekat paran broj
	public static boolean isEven(MyInteger number){
		if ((MyInteger.isEven(number))){
			return true;
		}
		return false;
	}
	//staticna metoda koja provjerava da li je proslijedjeni objekat neparan broj
	public static boolean isOdd(MyInteger number){
		if ((MyInteger.isOdd(number))){
			return true;
		}
		return false;
	}
	
	//staticna metoda koja provjerava da li je proslijedjeni objekat prost broj
	public static boolean isPrime (MyInteger number){
		 if (MyInteger.isPrime(number)){
			 return true;
		 }
		 return false;
	}
	
	//metoda koja vraca int brojeve od char niza
	public static int parseChar(char[] niz){
		int broj = 0;
		for (int i = 0; i<niz.length; i++){
			broj = (int) niz[i];
			System.out.print(broj + " ");
		}
		return broj;
	}
	
	//metoda koja vraca int brojeve od stringa
	public static int parseString(String str){
		int broj = Integer.parseInt(str);
		return broj;
	}
}
