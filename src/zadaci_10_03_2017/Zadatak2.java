package zadaci_10_03_2017;

public class Zadatak2 {

	public static void main(String[] args) {

			try {
				@SuppressWarnings("unused")
				char[] chArray;
				//izaivamo namjerno prekoracenje memorije
				chArray = new char[1000000000];
			}
			catch(OutOfMemoryError ex) {
				System.out.println(ex.getMessage());
			}
	}

}
