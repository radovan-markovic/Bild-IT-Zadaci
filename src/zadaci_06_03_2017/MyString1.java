package zadaci_06_03_2017;

public class MyString1 {

	private char[] chars;
	
	//kreiramo konstruktor za niz karaktera
	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++)
			this.chars[i] = chars[i];
	}
	
	//metoda vraca duzinu stringa
	public int length() {

		int brojac = 0;
		for(int i = 0; i < chars.length; i++)
			brojac++;
		return brojac;
	}
	
	//metoda vraca karakter na zeljenom indeksu
	public char charAt(int index) {
		return chars[index];
	}
	
	//metoda vraca substring stringa
	public MyString1 substring(int begin, int end) {
		char[] niz = new char[end - begin];
		for(int i = begin; i < end; i++) {
			niz[i - begin] = chars[i];
		}
		return new MyString1(niz);
	}
	
	//metoda vraca mala slova od velikih slova
	public MyString1 toLowerCase() {

		char[] malaSlova = new char[chars.length];

		for(int i = 0; i < chars.length; i++) {
			if(chars[i] >= 'A' && chars[i] <= 'Z')
				malaSlova[i] = (char)(chars[i] + 32);
			else
				malaSlova[i] = chars[i];
		}

		return new MyString1(malaSlova);
	}
	
	//metoda vraca true ako je string jednak stringu s
	public boolean equals(MyString1 s){
		
		int brojac = 0;
		
		for(int i = 0; i < chars.length; i++) {
			if(chars[i]==s.charAt(i)){
				
				brojac++;
			}
		}
		
		if (brojac == s.length()){
			return true;
		}
		return false;
		
	}
	
	//metoda vraca string od int argumenta
	public static MyString1 valueOf(int i) {

		char[] niz = new char[MyString1.count(i)];

		for(int j = niz.length - 1; j >= 0; j--) {
			int broj = i % 10;
			niz[j] = (char)('0' + broj);
			i /= 10;
		}
		return new MyString1(niz);
	}

	//metoda vraca duzinu broja
	public static int count(int i) {

		int brojac = 0;
		while(i != 0) {
			i /= 10;
			brojac++;
		}
		return brojac;
	}
	
	//accessor metoda 
	public char[] getChars() {
		return chars;
	}
	
	//toString metoda
	public String toString() {
		return String.valueOf(chars);
}
}
