package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime fajla: (Zadatak4.txt)");
		String imeFajla = input.next();
		Path path = Paths.get(imeFajla);
		input.close();
		
		int brojacLinija = 0;
		int brojacRijeci = 0;
		int brojacKaraktera = 0;
		
		//prolazimo kroz fajl
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			while((line = reader.readLine()) != null){
				//brojimo linije
				brojacLinija++;
				//stavljamo rijeci u niz i brojimo ih
				String[] rijeci = line.split(" ");
				for (String string : rijeci) {
					System.out.print(string + " ");
				}
				System.out.println();
				brojacRijeci += rijeci.length;
				//brojimo karaktere
				brojacKaraktera += line.length();
			}
			System.out.println();
			System.out.println("Broj linija: " + brojacLinija);
			System.out.println("Broj rijeci: " + brojacRijeci);
			System.out.println("Broj karaktera: " + brojacKaraktera);
			
		} catch (IOException e) {
			System.out.println("Fajl ne postoji");
			System.exit(1);
		}

	}

}
