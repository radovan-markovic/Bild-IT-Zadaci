package zadaci_03_03_2017;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 2; i <= 120; i++) {
			if (isPrime(i))
				//ako je broj prost stavljamo ga u stack
				stack.push(i);
		}
		
		//ispisujemo iz stacka brojeve
		while (!stack.empty()){
			System.out.print(stack.pop() + " ");
		}

	}
	
	//metoda koja provjerava da li je broj prost
		public static boolean isPrime (int value){
			 for(int i=2;i<value;i++) {
			        if(value % i==0)
			            return false;
			    }
			    return true;
		}

}
