package zadaci_06_03_2017;

public class MyCharacter {
	
private char value;
	
	//metoda krira karakter
	public MyCharacter(char value) {
		this.value = value;
	}
	
	//vraca vrijednost karaktera
	public char charValue() {
		return this.value;
	}
	
	//metoda poredi dva karaktera kao brojeve
	public static int compare(char x, char y) {
		if((int) x > (int) y)
			return 1;
		else if((int) x < (int) y)
			return -1;
		else			
			return 0;
	}

	//metoda vraca tue ako je odredjeni karakter broj
	public static boolean isDigit(char ch) {
		return (ch > 47 && ch < 58);
	}
	
	//metoda vraca true ako je odredjeni karakter slovo
	public static boolean isLetter(char ch) {
		return ((ch > 64 && ch < 91) || (ch > 96 && ch < 123));
	}
	
	//metoda vraca true ako je odredjeni karakter malo slovo
	public static boolean isLowerCase(char ch) {
		return (ch > 96 && ch < 123);
	}
	
	//metoda vraca true ako je odredjeni karakter veliko slovo
	public static boolean isUpperCase(char ch) {
		return (ch > 64 && ch < 91);
	}
	
	//metoda pretvara karakter u malo slovo
	public static char toLowerCase(char ch) {
		if(isLowerCase(ch))
			return ch;
		else
			return (char) (ch - 65 + 97);
	}
	
	//metoda pretvara karakter u veliko slovo
	public static char toUpperCase(char ch) {
		if(isUpperCase(ch))
			return ch;
		else
			return (char) (ch - 97 + 65);
	}
	
	//test provjerava da li su karakteri isti
	public boolean equals(MyCharacter ch) {
        return this.value == ch.charValue();
}
}
