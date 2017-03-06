package zadaci_06_03_2017;

public class TestMyString2 {

	public static void main(String[] args) {
		
		//testiramo metode iz klase MyString2
		MyString2 myString = new MyString2("Zadaci");
	
		System.out.println(myString.compare("Zadaci"));
		System.out.println(myString.compare("Zadace"));
		System.out.println(myString.compare("Zadatak"));
		
		MyString2 sub = myString.substring(1);
		System.out.println(sub.toString());
	
		System.out.println(myString.toUpperCase().toString());
		
		char[] test = myString.toChars();
		
		for(int i = 0; i < test.length; i++){
			System.out.print(test[i] + " ");
		}
	
		MyString2 value = MyString2.valueOf(true);
		System.out.println("\n" + value.toString());

	}

}
