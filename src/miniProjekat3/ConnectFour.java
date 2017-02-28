package miniProjekat3;

import java.util.Arrays;
import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {
		
		System.out.println("Dobrodošli u igru Connect Four");
		boolean igraj = true;
		Scanner input = new Scanner (System.in);
		int broj = 0;
		
		while (igraj){
		System.out.println("\n1 - Nova igra");
		System.out.println("2 - Izlaz");
		while (broj < 1 || broj > 2){
			try{
				System.out.println("Unesite broj 1 ili 2:");
				broj = input.nextInt();
				input.nextLine();
			}catch(Exception e){
				System.out.println("Nepravilan unos, unesite ponovo:");
				input.nextLine();
			}
		}
			if (broj == 1){
				connectFour();
				broj = 0;
			}
			if (broj == 2){
				System.exit(0);
			}
		}	
	}
	
	//metoda igre connect four
	public static void connectFour(){
		
		String[][] niz = new String [6][7];
		boolean igra = true;
		int brojacPoteza = 0;
		
		//provjeravamo status igre
		while (igra){
			
			//provjeravamo unos igraca 1
			int kolona = provjeriUnos(1);
			//pozicija na koju prvi igrac igra (pozicija, niz, broj igraca) i upisuje svoj potez
			provjeriPozicijuIUpisi(kolona , niz, 1);
			//provjeravamo da li je igrac 1 pobjednik
			if (ChekGameConnectFour.provjeriPobjednikaRed(niz) || ChekGameConnectFour.provjeriPobjednikaKolona(niz) || ChekGameConnectFour.provjeriPobjednikaDijagonala(niz)
					|| ChekGameConnectFour.provjeriPobjednikaObrnutaDijagonala(niz)){
				System.out.println("Igrac 1 je pobijedio!");
				break;
			}
			brojacPoteza++;
			
			//provjeravamo unos igraca 2
			kolona = provjeriUnos(2);
			//pozicija na koju prvi igrac igra (pozicija, niz, broj igraca) i upisuje svoj potez
			provjeriPozicijuIUpisi(kolona , niz, 2);
			if (ChekGameConnectFour.provjeriPobjednikaRed(niz) || ChekGameConnectFour.provjeriPobjednikaKolona(niz) || ChekGameConnectFour.provjeriPobjednikaDijagonala(niz) 
					|| ChekGameConnectFour.provjeriPobjednikaObrnutaDijagonala(niz)){
				System.out.println("Igrac 2 je pobijedio!");
				break;
			}
			brojacPoteza++;
			
			if (brojacPoteza == 42){
				System.out.println("Nerijeseno!");
				break;
			}
		}
	}
	
	//metoda provjerava da li je broj kolone koju korisnik unese odgovarajuci
	public static int provjeriUnos(int brojIgraca){
		
		Scanner input = new Scanner (System.in);
		boolean testIgrac1 = true;
		int pozicija = 0;
		
		//provjeravamo unos igraca 1
		if (brojIgraca == 1 || brojIgraca == 2){
			while (testIgrac1){
				try{
					System.out.println("Igrac " + brojIgraca + ". " + "Unesite broj kolone izmedju 0 i 6:");
						pozicija = input.nextInt();
					while (pozicija < 0 || pozicija > 6){
						System.out.println("Igrac " + brojIgraca + ". " + "Unesite broj kolone izmedju 0 i 6:");
						pozicija = input.nextInt();
					}
					testIgrac1 = false;	
				}catch (Exception e){
					System.out.println("Nepravilan unos, unesite ponovo!");
					input.nextLine();
				}
			}
			
		}
		//vracamo broj kolone
		return pozicija;
	}
	
	//metoda provjerava da li je moguce odigrati u toj koloni, ako jeste smjestamo
	//unos na najnizu poziciju u koloni, ako nije, trazi se od igraca da izabere drugu kolonu
	public static void provjeriPozicijuIUpisi(int kolona, String[][] niz, int igrac){
		
		//ako je kolona popunjena od igraca se trazi da unese neku drugu kolonu
		while (niz[0][kolona] != null){
			System.out.println("Ta kolona je popunjena, unesite neku drugu kolonu:");
			//nova pozicija na koju ce igrac igrati
			kolona = provjeriUnos(1);
			System.out.println(kolona);
		}
		
		//ako kolona nije popunjena upisuje se potez na najnizoj poziciji u koloni	
		int red = 5;
		while (niz[red][kolona] != null){
			red--;
		}
		//igrac 1 upsuje svoj potez kao "X"
		if (igrac == 1){
			niz[red][kolona] = "X";
		}
		//igrac 2 upsuje svoj potez kao "O"
		if (igrac == 2){
			niz[red][kolona] = "O";
		}
		
		for(int i = 0; i<niz.length; i++){
			for(int j = 0; j<niz[i].length; j++){
				if (j == 0){
					System.out.print(" | ");
				}
				
				if (niz[i][j] == null){
					//ako je polje prazno ispisujemo prazninu 
					System.out.print("  | ");
				}
				if (niz[i][j] != null){
					System.out.print(niz[i][j]);
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
		System.out.print(" -----------------------------");
		System.out.println();
		
	}

}
