package zadaci_06_03_2017;

public class TestMyString1 {
	
	public static void main(String[] args) {
		
		char[] chars = {'z', 'a', 'd', 'a', 'c', 'i'};
		MyString1 myString = new MyString1(chars);
		System.out.println(myString.toString());
		
		//testiramo metode iz klase MyString1
		char ch = myString.charAt(1);
		System.out.println(ch);
		
		System.out.println(myString.length());
		
		System.out.println(myString.substring(1, 3));
		
		char[] lower = {'Z', 'A', 'D', 'A', 'C', 'I'};
		MyString1 malaSlova = new MyString1(lower);
		System.out.println(malaSlova.toLowerCase().toString());
		
		System.out.println(myString.equals(malaSlova));

		System.out.println(MyString1.valueOf(123456).toString());
	}
}
