package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string koji zelite da uklonite iz fajla: ");
		String stringBrisanje = input.next();
		System.out.println("Unesite ime fajla: (Zadatak3.txt) ");
		String imeFajla = input.next();

		ArrayList<String> list = new ArrayList<>();
		readFromFile(list, imeFajla);
		System.out.println(list);
		obrisiString(list, stringBrisanje);

		input.close();
	}

	// metoda cita svaku rijec iz fajla i smjesta rijeci u listu
	public static void readFromFile(ArrayList<String> list, String imeFajla) {

		Path path = Paths.get(imeFajla);
		
		//prolazimo kroz fajl i smijestamo svaku rijec u niz
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line = "";
			while ((line = reader.readLine()) != null) {

				String[] nizLista = line.split(" ");
				for (int i = 0; i < nizLista.length; i++)
					list.add(nizLista[i]);
			}
		} catch (IOException e) {
			System.out.println("Fajl ne postoji.");
			System.exit(1);
		}
	}

	// metoda ujlanja string iz liste
	public static void obrisiString(ArrayList<String> list, String stringBrisanje) {

		int count = 0;
		//ako je unijeti string u listi uklanjamo ga
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(stringBrisanje)) {
				list.remove(i);
				count++;
			}
		}
		//ispisujemo rezultat
		if (count == 0)
			System.out.println("String koji ste unijeli " + stringBrisanje + " ne postoji u fajlu.");
		else
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
	}
}
