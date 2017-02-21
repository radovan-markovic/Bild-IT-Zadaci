package miniProjekat2_Craps_Credits;

import java.util.Scanner;

//check is credit card valid
public class Credits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		long cardNumber = 0;
		boolean test = true;
		
		while (test){//input testing
			try{
				while(cardNumber < 1){
					System.out.println("Input credit card number:");
					cardNumber = input.nextLong();
					input.nextLine();
				}
				test = false;
				}catch (Exception e){
					System.out.println("Wrong input!");
					input.nextLine();
				}
		}
		
		if (isValid (cardNumber)){
			
			int oddPlaceDigitsSum = sumOfOddPlace(cardNumber);
			int evenPlaceDigitSum = sumOfDoubleEvenPlace(cardNumber);
			
			if ((oddPlaceDigitsSum + evenPlaceDigitSum) % 10 == 0){
				System.out.println(cardNumber + " is valid number.");
			}else{
				System.out.println(cardNumber + " is invalid number.");
			}
		}
	}
	
	//check if credit card number is valid
	public static boolean isValid(long number){
		
		int size = getSize(number);
		//check size
		if (size > 12 && size < 17){
			//check prefix
			if (prefixMatched(number)){
				return true;
			}
			
		}
		
		System.out.println("Not a valid number!");
		return false;
	}
	
	//return number of digits in number
	public static int getSize(long d){
		
		String s = d+"";
		int size = s.length();
		
		return size;
	}
	
	/*method returns true if prefix digit of credit card matches 
	 international standards*/
	public static boolean prefixMatched(long number){
		
		String str = number + "";
		
		if (str.charAt(0) == '4'){
			return true;
		}
		if (str.charAt(0) == '5'){
			return true;
		}
		if (str.charAt(0) == '6'){
			return true;
		}
		if ((str.charAt(0) == '3') && (str.charAt(1) == '7')){
			return true;
		}
		
		return false;
	}
	
	//return the sum of odd place digits
	public static int sumOfOddPlace(long number){
		
		int sumOfOddPlace = 0;
		long resultMulitpliedByTwo = 0;	
		long result = 0;
		
		//get odd place digits from the number;
		String str = number + "";
		String oddPlaceDigits = "";
		for(int i = str.length()-2; i>=0; i-=2){
			oddPlaceDigits = oddPlaceDigits + str.charAt(i);
		}
		number = Long.parseLong(oddPlaceDigits);
		
		//multiply every digit in number by 2
	    while (number > 0) {
		    result =  number % 10;
		    resultMulitpliedByTwo = result * 2;
		    sumOfOddPlace = sumOfOddPlace + getDigit((int)resultMulitpliedByTwo);
		    number = number / 10;
		}
		
		return sumOfOddPlace;
	}
	
	//return the sum even of place digits
	public static int sumOfDoubleEvenPlace(long number){
		
		long result = 0;
		int sum = 0;
		String str = number + "";
		String evenPlaceDigits = "";
		//get even place digits from the number
		for(int i = str.length()-1; i>=0; i-=2){
			evenPlaceDigits = evenPlaceDigits + str.charAt(i);
		}
		
		number = Long.parseLong(evenPlaceDigits);
		
		while (number > 0) {
		    result =  number % 10;
		    sum = sum + (int)result;
		    number = number / 10;
		}
		
		return sum;
	}
	
	/* Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number){
		
		String str = number+"";
		int sum = 0;
		int result = 0;
		
		if (str.length() == 2){
			while (number > 0) {
			    result = number % 10;
			    sum = sum +result;
			    number = number / 10;
			}
			return sum;
		}
		return number;
	}

}
