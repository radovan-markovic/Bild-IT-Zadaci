package zadaci_28_02_2017;

import java.util.Scanner;

public class Location {
	
	//pravimo data fildove
	public int row;
	public int column;
	public double maxValue;
	
	
	//kreiramo konstruktor
	public Location(int row, int column, double maxValue) {
		super();
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	//metoda vraca najveci element i njegovu lokaciju u nizu
	public static Location locateLargest(double[][] a){
		
		int row = 0;
		int column = 0;
		double maxValue = a[0][0];
		
		for (int i = 0; i<a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if (a[i][j] > maxValue){
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		return new Location(row, column, maxValue);
	}
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		boolean test = true;

		int brojRedova = 0;
		int brojKolona = 0;
		
		while(test){
			try{
				while (brojRedova <= 0){
					System.out.println("Unesite broj redova:");
					brojRedova = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos, unesite ponovo");
				input.nextLine();
			}
		}
		test = true;
		
		while(test){
			try{
				while (brojKolona <= 0){
					System.out.println("Unesite broj kolona:");
					brojKolona = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch(Exception e){
				System.out.println("Nepravilan unos, unesite ponovo");
				input.nextLine();
			}
		}
		
		test = true;
		
		double[][] niz = new double[brojRedova][brojKolona];
		
		while (test) {// testiramo unos u matricu
			System.out.println("Unesite elemente u matricu");
			try {
				for (int i = 0; i < brojRedova; i++) {
					for (int j = 0; j < brojKolona; j++) {
						System.out.println("Unesite broj u matricu:");
						niz[i][j] = input.nextDouble();
						input.nextLine();
					}
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}
		input.close();
		
		Location largest = Location.locateLargest(niz);

		System.out.println("Najveci element je " + largest.maxValue + " na indeksima " 
				+ "(" + largest.row + ", " + largest.column + ")");
	}

}
