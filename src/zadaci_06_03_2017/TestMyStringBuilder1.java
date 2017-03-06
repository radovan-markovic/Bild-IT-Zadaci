package zadaci_06_03_2017;

public class TestMyStringBuilder1 {

	public static void main(String[] args) {
		
		//testiramo metode iz klase string MyStringBuilder1
		MyStringBuilder1 stringBuilder = new MyStringBuilder1("Zadaci");

		System.out.println(stringBuilder.append(new MyStringBuilder1("Abc")));

		System.out.println(stringBuilder.append(123));

		System.out.println(stringBuilder.length());

		System.out.println(stringBuilder.charAt(1));

		System.out.println(stringBuilder.toLowerCase());

		System.out.println(stringBuilder.substring(1, 3));

		System.out.println(stringBuilder.toString());

	}

}
