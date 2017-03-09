package zadaci_06_03_2017;

public class MyStringBuilder1 {
	
private String s;
	
	//kreiramo konstruktor
	public MyStringBuilder1(String s) {
		this.s = s;
	}
	
	//metoda koja dodaje string na postojeci string
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		this.s = this.s + s;
		return new MyStringBuilder1(this.s + s);
	}
	
	//metoda koja dodaje integer na postojeci string
	public MyStringBuilder1 append(int i) {
		String temp = "";
		temp = temp + i+"";
		temp = this.s + temp;
		return new MyStringBuilder1(temp);
	}
	
	//metoda koja vraca duzinu stringa
	public int length() {
		return s.length();
	}
	
	//metoda koja vraca karakter na odredjenom indeksu
	public char charAt(int index) {
		return s.charAt(index);
	}
	
	//metoda vraca mala slova od stringa s
	public MyStringBuilder1 toLowerCase() {
		String result = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				result += s.charAt(i);
			}
			else {
				result += (char) (s.charAt(i) - 65 + 97);
			}
		}
		return new MyStringBuilder1(result);
	}
	
	//metoda vraca substring stringa
	public MyStringBuilder1 substring(int begin, int end) {
		String result = "";
		
		for(int i = begin; i < end; i++) {
			result += s.charAt(i);
		}
		return new MyStringBuilder1(result);
	}
	
	public String toString() {
		return this.s;
}
}
