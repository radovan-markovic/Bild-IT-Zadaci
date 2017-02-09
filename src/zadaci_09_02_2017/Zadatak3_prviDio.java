package zadaci_09_02_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//prvio dio treceg zadatka - logika za prebrojavanje linija, rijeci i karaktera unutar fajla
public class Zadatak3_prviDio {
	
	//metoda dobija fajl kao argument iz fajla Zadatak3_drugiDio
	public static void main(String[] args) {
		
		//uzima prvi argument iz main metode (ime fajla)
		String fileName = args[0];
		//deklarisemo objekat tipa Path
		Path path = Paths.get(fileName);
		
		int brojLinija = 0;
		int brojRijeci = 0;
		int brojKaraktera = 0;
		
		//provjravamo da li je putanja ispravana i kreiramo objekat reader kako bismo
		//citali sadrzaj iz fajla
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			
			//prolazimo kroz svaku liniju u fajlu
			while((line = reader.readLine()) != null){
				//povecavamo broj linija za jedan nakon svake procitane linije
				brojLinija++;
				String[] rijeci = line.split(" ");
				//povecavamo broj rijeci za jedan nakon svake procitane rijeci
				brojRijeci += rijeci.length;
				//povecavamo broj karaktera za jedan nakon svakog procitanog karaktera
				brojKaraktera += line.length();
			}
			
			//ispis broja linaj/rijeci/karaktera
			System.out.println("Broj linija: " + brojLinija);
			System.out.println("Broj rijeci: " + brojRijeci);
			System.out.println("Broj karaktera: " + brojKaraktera);
		
		} catch (IOException e) {
			System.out.println("Fajl nie pronadjen");
		}

	}
}
