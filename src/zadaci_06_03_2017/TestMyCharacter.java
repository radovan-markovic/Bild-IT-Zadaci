package zadaci_06_03_2017;

public class TestMyCharacter {

	public static void main(String[] args) {
		
		//testiramo metode iz klase MyCharacter
		MyCharacter ch = new MyCharacter('a');

		System.out.println(MyCharacter.compare('b', 'a'));

		System.out.println(MyCharacter.isDigit('7'));

		System.out.println(MyCharacter.isLetter('A'));

		System.out.println(MyCharacter.isLowerCase('B'));

		//Test isUpperCase method
		System.out.println(MyCharacter.isUpperCase('C'));

		//Test toLowerCase method
		System.out.println(MyCharacter.toLowerCase('A'));

		//Test toUpperCase method
		System.out.println(MyCharacter.toUpperCase('n'));
		
		//Test equals method
		System.out.println(ch.equals(new MyCharacter('a')));
}

	

}
