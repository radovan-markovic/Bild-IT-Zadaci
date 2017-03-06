package zadaci_06_03_2017;

public class MyString2 {
	
	private String str;
	
	//konstruktor za string objekat
	public MyString2(String str) {
		this.str = str;
	}
	
	//metoda za poredjenje stringa
	public int compare(String s) {
		int result = 0;
		
		for(int i = 0; i < Math.min(s.length(), str.length()); i++) {
			
			char ch = s.charAt(i);
			char ch1 = str.charAt(i);
			
			if(ch != ch1) {
				result = (int) ch1 - (int) ch;
			}
		}
		return result;
 	}
	
	//metoda vraca substring od stringa
	public MyString2 substring(int begin) {
		String result = "";
		
		for(int i = begin; i < str.length(); i++) {
			result += str.charAt(i);
		}
		return new MyString2(result);
	}
	
	//metoda pretvara mala slova u velika slova
	public MyString2 toUpperCase() {
		String result = "";

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				result += (char)(str.charAt(i) - 32);
			else
				result += str.charAt(i);
		}

		return new MyString2(result);
	}
	
	//metoda pretvara string u niz karaktera
	public char[] toChars() {
		char[] niz = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			niz[i] = str.charAt(i);
		}
		return niz;
	}
	
	//metoda vraca boolean vrijednost od stringa
	public static MyString2 valueOf(boolean b) {
		if(b)
			return new MyString2("true");
		else
			return new MyString2("false");
	}
	
	public String toString() {
		return str;
	}
}
