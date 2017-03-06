package zadaci_06_03_2017;

public class Split {
	
	public static void main(String[] args) {
		
		String s = "a?b?gf#e";
		String[] sp = split(s, "[?#]");
		
		for(int i = 0; i < sp.length; i++) {
			if(sp[i] != null)
				System.out.print(sp[i]);
		}
		
		System.out.println();
		
		String str = "ab#12#453";
		String[] niz = split(str, "#");
		
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] != null)
				System.out.print(niz[i]);
		}
	}
	
	//metoda vraca true ako je regex niz
	public static boolean isRegexArray(String regex) {
		return (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']');
	}
	
	//metoda vraca regex
	public static String getRegex(String regex) {
		if(isRegexArray(regex)) 
			return regex.substring(1, regex.length() - 1);
		else
			return regex;
	}
	
	//metoda vraca true ako se ni jedan karakter iz regexa ne poklapa sa stringom
	public static boolean provjeriKarakter(String s, String regex, int index) {

		boolean is = false;
		String reg = getRegex(regex);
		
		for(int i = 0; i < reg.length(); i++) {

			if(s.charAt(index) != reg.charAt(i))
				is = true;
			else {
				is = false;
				break;
			}
		}
		return is;
	}
	
	//metoda razdvaja rijeci
	public static String[] razdvojiRijeci(String s, String regex) {
		//"a?b?gf#e"
		String[] newString = new String[s.length() * 2];
		String rege = getRegex(regex);
		int index = 0;

		for(int i = 0; i < s.length(); i++) {

			if(provjeriKarakter(s, rege, i)) {
				newString[index++] = String.valueOf(s.charAt(i));
			}
			else {
				for(int j = 0; j < rege.length(); j++) {
					if(rege.charAt(j) == s.charAt(i))
						newString[index++] = ", " + String.valueOf(rege.charAt(j)) + ", ";
				}
			}
		}
		return newString;
	}
	
	//metoda razdvaja rijec
	public static String[] razdvojRijec(String s, String regex) {

		String[] newString = new String[s.length() * 2];
		int index = 0;

		for(int i = 0; i < s.length(); i++) {

			if(s.charAt(i) != regex.charAt(0)) {
				newString[index++] = String.valueOf(s.charAt(i));
			}
			else {
				newString[index++] = ", " + String.valueOf(regex) + ", ";
			}
		}
		return newString;
	}
	
	//metoda vraca strin u zavosnositi od toga kako je razdvojen
	public static String[] split(String s, String regex) {

		if(isRegexArray(regex))
			return razdvojiRijeci(s, regex);
		else
			return razdvojRijec(s, regex);
}
}
