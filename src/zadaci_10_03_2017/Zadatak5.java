package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime fajla: (Zadatak5.txt)");
		String imeFajla = input.next();
		Path path = Paths.get(imeFajla);
		input.close();
		
		//prolazimo kroz fajl
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			
			ArrayList<Double> list = new ArrayList<>();
			String line;
			while((line = reader.readLine()) != null){
				
				//stavljamo ocjene u niz
				String[] scores = line.split(" ");
				for (String string : scores) {
					list.add(Double.parseDouble(string));
				}
			}
			System.out.println(list);
			
			double sum = 0;
			int total = 0;
			
			for (int i = 0; i<list.size(); i++){
				sum = sum + list.get(i);
				total++;
			}
			
			System.out.println("Suma ocjena je: " + sum);
			System.out.println("Ukupan broj ocjena je: " + total);
			System.out.println("Prosjek ocjena je " + (sum/total));
			
		} catch (IOException e) {
			System.out.println("Fajl ne postoji");
			System.exit(1);
		}

	}
}
