package zadaci_03_03_2017;

public class TestMyInteger {

	public static void main(String[] args) {
		
		//testiramo klasu My Integer pozivajuci metode iz klase My Integer
		MyInteger i = new MyInteger(13);
		if (i.isEven()){
			System.out.println("Broj je paran");
		}
		if (i.isOdd()){
			System.out.println("Broj je neparan");
		}
		if (i.isPrime()){
			System.out.println("Broj je prost");
		}else{
			System.out.println("Broj nije prost");
		}
		
		if (MyInteger.isEven(12)){
			System.out.println("Broj je paran");
		}
		if (MyInteger.isOdd(12)){
			System.out.println("Broj je neparan");
		}
		if (MyInteger.isPrime(12)){
			System.out.println("Broj je prost");
		}else{
			System.out.println("Broj nije prost");
		}
		
		char [] niz = {'a', 'b', 'c'};
		
		MyInteger.parseChar(niz);
		
		System.out.println("\n" + MyInteger.parseString("123"));

	}

}
