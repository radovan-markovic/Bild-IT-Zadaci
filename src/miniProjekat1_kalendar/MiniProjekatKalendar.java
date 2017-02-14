package miniProjekat1_kalendar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//kalendar-podsjetnik
public class MiniProjekatKalendar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dobrodosli u kalendar i podsjetnik, " + "izaberite jednu od ponudjenih opcija:\n");

		boolean reminder = true;
		boolean testUnosa1 = true;
		boolean testUnosa2 = true;
		boolean testUnosa3 = true;
		boolean testUnosa4 = true;
		boolean testUnosa5 = true;
		int unos = 0;
		int unos2 = 0;
		int mjesec = 0;
		int godina = 0;
		int unosDatuma = 0;

		while (reminder) {
			
					// opcije programa
					System.out.println("1 - Izlistaj sve podsjetnike");
					System.out.println("2 - Pogledaj kalendar i dodaj podsjetnik");
					System.out.println("3 - Izlaz");
	
					
			while (testUnosa5){
				try {
					unos = Integer.parseInt(input.nextLine());
					// ako unos nije ispravan ponavlja se
					while (unos != 1 && unos != 2 && unos != 3) {
						System.out.println("Nepravilan unos, unesite ponovo:");
						System.out.println("Molimo unesite 1, 2 ili 3:");
						unos = Integer.parseInt(input.nextLine());
					}
					testUnosa5 = false;
				} catch (Exception e) {
					System.out.println("Nepravilan unos, unesite ponovo:");
					System.out.println("Molimo unesite 1, 2 ili 3:");
				}
			}
			
			testUnosa5 = true;
			// opcija 1
			if (unos == 1) {
				// ispisujemo sve sacuvane podsjetnike
				izlistajSvePodsjetnike();
				testUnosa5 = false;
			}
			
			testUnosa5 = true;
			// opcija 2
			while (unos == 2) {

				while (testUnosa1) {
					try {
						System.out.println("Unesite mjesec, npr. za Februar unesite 02 ili 2: ");
						mjesec = Integer.parseInt(input.nextLine());
						// provjeravamo da li je mjesec ispravno unesen
						while (mjesec < 1 || mjesec > 12) {
							System.out.println("Nepravilan unos, unesite ponovo:");
							System.out.println("Unesite mjesec, npr. za Februar unesite 02 ili 2: ");
							mjesec = Integer.parseInt(input.nextLine());
						}
						testUnosa1 = false;
					} catch (Exception e) {
						System.out.println("Nepravilan unos, unesite ponovo:");
					}
				}
				testUnosa1 = true;
				
				while (testUnosa2) {
					try {
						System.out.println("Unesite godinu, npr. za 2017. godinu unesite \"2017\". Podrzane su godine od 2000 do 2050. ");
						godina = Integer.parseInt(input.nextLine());
							// provjeravamo da li je godina ispravno unesena
							while (godina < 2000 || godina > 2050) {
								System.out.println("Nepravilan unos, unesite ponovo:");
								System.out.println("Unesite godinu, npr. za 2017. godinu unesite \"2017\". Podrzane su godine od 2000 do 2050. ");
								godina = Integer.parseInt(input.nextLine());
							}
							testUnosa2 = false;
						}catch (Exception e) {
							System.out.println("Nepravilan unos, unesite ponovo:");
						}	
				}
				testUnosa2 = true;
				
				// dobijamo ispravan broj dana u mjesecu ukljucujuci i
				// prestupnu godinu
				int brojDanaUMjesecu = vratiBrojDanaUmjesecu(mjesec, godina);

				// dobijamo u koji dan pada 1. u mjesecu, npr. ako je to
				// cetvrtak prviDanUsedmici = 4
				int prviDanUSedmici = vratiPrviDanUSedmici(mjesec, godina);

				// ispisujemo kalendar u konzoli
				ispisKalendara(prviDanUSedmici, brojDanaUMjesecu, godina, mjesec);

				System.out.println("1 - Dodaj podsjetnik");
				System.out.println("2 - Unesi drugi datum");
				System.out.println("3 - Izlaz");
				
				while (testUnosa3) {
					try {
					unos2 = Integer.parseInt(input.nextLine());
						while (unos2 != 1 && unos2 != 2 && unos2 != 3) {
							System.out.println("Nepravilan unos, unesite ponovo:");
							System.out.println("Molimo unesite 1, 2 ili 3:");
							unos2 = Integer.parseInt(input.nextLine());
						}
						testUnosa3 = false;	
					}catch (Exception e){
						System.out.println("Nepravilan unos, unesite ponovo:");
						System.out.println("Molimo unesite 1, 2 ili 3:");
					}
				}
				testUnosa3 = true;
				
				// dodajemo novi podsjetnik
				if (unos2 == 1) {
					System.out.println("Unesite datum u mjesecu za dan podsjetnika, " + "npr. za 3. u mjesecu unesite 03 ili 3");
					
					while (testUnosa4){
						try{
							unosDatuma = Integer.parseInt(input.nextLine());
							// provjeravamo da li je unos datuma ispravan
							while (unosDatuma < 1 || unosDatuma > brojDanaUMjesecu) {
								System.out.println("Nepravilan unos datuma, unesite ponovo:");
								System.out.println("Unesite datum u mjesecu za dan podsjetnika, " + "npr. za 3. u mjesecu unesite 03 ili 3");
								unosDatuma = Integer.parseInt(input.nextLine());
							}
							testUnosa4 = false;
						}catch (Exception e){
							System.out.println("Nepravilan unos datuma, unesite ponovo:");
							System.out.println("Unesite datum u mjesecu za dan podsjetnika, " + "npr. za 3. u mjesecu unesite 03 ili 3");
						}
					}
					testUnosa4 = true;
					
					// kreiramo novi podsjetnik
					try {
						kreirajPodsjetnik(unosDatuma, mjesec, godina);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("Nije moguce sacuvati podsjetnik");
					}
					unos = -1;
					reminder = true;
				}
				// unosimo novi datum
				if (unos2 == 2) {
					unos = 2;
				}

				// izlazimo na pocetne opcije
				if (unos2 == 3) {
					unos = -1;
					reminder = true;

				}
			}
			// opcija 3 izlazak iz programa
			if (unos == 3) {
				System.exit(1);
			}

		}
	}

	// metoda nam sluzi da saznamo koliko imamo dana u mjesecu
	public static int vratiBrojDanaUmjesecu(int mjesec, int godina) {

		int Month = 0;

		// pronalazimo dati mjesec na osnovu proslijedjenog mjeseca i godine
		if (mjesec == 1) {
			Month = Calendar.JANUARY;
		}
		if (mjesec == 2) {
			Month = Calendar.FEBRUARY;
		}
		if (mjesec == 3) {
			Month = Calendar.MARCH;
		}
		if (mjesec == 4) {
			Month = Calendar.APRIL;
		}
		if (mjesec == 5) {
			Month = Calendar.MAY;
		}
		if (mjesec == 6) {
			Month = Calendar.JUNE;
		}
		if (mjesec == 7) {
			Month = Calendar.JULY;
		}
		if (mjesec == 8) {
			Month = Calendar.AUGUST;
		}
		if (mjesec == 9) {
			Month = Calendar.SEPTEMBER;
		}
		if (mjesec == 10) {
			Month = Calendar.OCTOBER;
		}
		if (mjesec == 11) {
			Month = Calendar.NOVEMBER;
		}
		if (mjesec == 12) {
			Month = Calendar.DECEMBER;
		}

		// postavljamo pocetnu vrijednost dana na 1
		int dan = 1;

		// kreiramo kalendar objekat i setujemo dan,mjesec i godinu
		Calendar mycal = new GregorianCalendar(godina, Month, dan);

		// dobijamo broj dana u zeljenom mjesecu
		int brojDanaUMjesecu = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);

		return brojDanaUMjesecu;

	}

	// metoda vraca na koji dan pada 1. u mjesecu, ako je 1. u srijedu metoda
	// vraca 3
	public static int vratiPrviDanUSedmici(int mjesec, int godina) {

		int dan = 1;

		// kreiramo objekat localDate i setujemo zeljeni datum
		LocalDate localDate = LocalDate.of(godina, mjesec, dan);

		// dobijamo dan u DayOfWeek formatu
		DayOfWeek day = localDate.getDayOfWeek();
		// pretvaramo DayOfWeek objekat u string
		String strDanUSedmici = day + "";

		int pocetniDanUsedmici = 0;

		// kada se string poklopi sa danom dobijamo koji dan po redu
		// ce biti 1. u mjesecu
		if (strDanUSedmici.contains("MONDAY")) {
			pocetniDanUsedmici = 1;
		}
		if (strDanUSedmici.contains("TUESDAY")) {
			pocetniDanUsedmici = 2;
		}
		if (strDanUSedmici.contains("WEDNESDAY")) {
			pocetniDanUsedmici = 3;
		}
		if (strDanUSedmici.contains("THURSDAY")) {
			pocetniDanUsedmici = 4;
		}
		if (strDanUSedmici.contains("FRIDAY")) {
			pocetniDanUsedmici = 5;
		}
		if (strDanUSedmici.contains("SATURDAY")) {
			pocetniDanUsedmici = 6;
		}
		if (strDanUSedmici.contains("SUNDAY")) {
			pocetniDanUsedmici = 7;
		}

		return pocetniDanUsedmici;

	}

	// metoda ispisuje kalendar na osnovu pocetnog polozaja 1. u mjesecu i broja
	// dana u mjesecu
	public static void ispisKalendara(int pocetniDanUsedmici, int brojDanaUMjesecu, int godina, int mjesec) {

		// stavljamo pocetni datum u mjesecu na prvi
		int daniBrojac = 1;

		String str = "";

		// pravimo promjenljivu za poravnanje prvog reda u kalendaru
		int poravnanjeReda = 0;

		// racunamo koliko cemo napraviti praznina sa lijeve strane kako bi
		// kalendar izgledao ispravno
		int brojDanaUPrvomRedu = 7 - (pocetniDanUsedmici - 1);
		poravnanjeReda = 7 - brojDanaUPrvomRedu;

		// formatiranje ispisa mjeseca
		String imeMjeseca = vratiImeMjeseca(mjesec);
		imeMjeseca = String.format("%4s", imeMjeseca);
		System.out.print("\t" + imeMjeseca);

		// formatiranje ispisa godine u kalendaru
		str = String.format("%6s", godina);
		System.out.println(str);

		// formatiranje ispisa dana u sedmici u kalendaru
		System.out.println("  Po  Ut  Sr  Ce  Pe  Su  Ne");

		System.out.println("  --------------------------");

		int brojacRedova = 0;

		for (int i = 1; i < 43; i++) {

			// pravimo praznine u prvom redu sa lijeve strane kako bi kalendar
			// izgledao ispravno
			if (i <= poravnanjeReda) {
				str = String.format("%4s", " ");
				System.out.print(str);
			}

			// ispisujemo sve datume mjesecu do poslednjeg, tj onoliko koliko
			// mjesec ima dana
			if (i == pocetniDanUsedmici && daniBrojac <= brojDanaUMjesecu) {
				str = String.format("%4d", daniBrojac);
				System.out.print(str);
				daniBrojac++;
				pocetniDanUsedmici++;
			}
			// prelazimo u novi red kada ispisemo 7 karaktera, tako dobijamo
			// izgled kalendara

			if (i % 7 == 0 && daniBrojac <= brojDanaUMjesecu) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("  --------------------------");
	}

	// metoda ispisuje sve sacuvane podsjetnike
	public static void izlistajSvePodsjetnike() {

		// Kreiramo fajl objekat da bismo provjerili da li je fajl prazan
		File file = new File("reminder.txt");

		// ako fajl nije prazan citamo sadrzaj iz fajla i ispisujemo ga
		if (file.length() != 0) {

			// kreiramo putanju do fajla gdje se nalaze sacuvani podsjetnici
			Path path = Paths.get("reminder.txt");

			// provjravamo da li je putanja ispravana
			try (BufferedReader reader = Files.newBufferedReader(path)) {

				String line;

				// prolazimo kroz svaku liniju u fajlu
				while ((line = reader.readLine()) != null) {
					// ispisujemo svaku liniju iz fajla
					System.out.println(line);
				}
				System.out.println();

			} catch (IOException e) {
				System.out.println("Fajl nie pronadjen");
			}
		} else {
			// vracamo poruku ako nema sacuvanih podsjetnika u fajlu
			System.out.println("Nema sacuvanih podsjetnika.");
			System.out.println();
		}
	}

	public static void kreirajPodsjetnik(int datum, int mjesec, int godina) throws IOException {

		// kreiramo listu u koju cemo smijestati sadrzaj iz fajla
		ArrayList<String> list = new ArrayList<>();

		// kreiramo objekat/putanju koji sadrzi referencu na fajl u kome se
		// nalaze
		// podsjetnici
		Path path = Paths.get("reminder.txt");

		// ako fajl ne postoji kreiramo ga da bismo mogli upisati sadrzaj novog
		// podsjetnika
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		// Kreiramo fajl objekat da bismo provjerili da li je fajl prazan
		File file = new File("reminder.txt");

		// ako fajl nije prazan citamo sadrzaj iz fajla i upsujemo u listu
		if (file.length() != 0) {

			// brisemo stari sadrzaj iz liste
			list.clear();

			// kreiram objekat reader za citanje iz fajla
			BufferedReader reader = Files.newBufferedReader(path);

			String line;
			// prolazimo kroz svaku liniju fajla i spremamo liniju u listu
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}
			reader.close();
		}

		// unosimo sadrzaj podsjetnika
		Scanner sadrzaj = new Scanner(System.in);
		System.out.println("Unesite tekst podsjetnika:");
		String sadrzajPodsjetnika = sadrzaj.nextLine();

		// provjeravamo da li je dan podsjetnika jednocifren, ako jeste dodajemo
		// mu 0
		// da bi bolje formatirali datum
		int duzinaDatuma = (int) (Math.log10(datum) + 1);
		String formatDatuma = "";
		if (duzinaDatuma == 1) {
			formatDatuma = "0" + datum;
		} else {
			formatDatuma = datum + "";
		}

		// provjeravamo da li je mjesec podsjetnika jednocifren, ako jeste
		// dodajemo mu 0
		// da bi bolje formatirali datum
		int duzinaMjeseca = (int) (Math.log10(mjesec) + 1);
		String formatMjeseca = "";
		if (duzinaMjeseca == 1) {
			formatMjeseca = "0" + mjesec;
		} else {
			formatMjeseca = mjesec + "";
		}

		// dodajemo novi podsjetnik u listu
		list.add("Podsjetnik za dan: " + formatDatuma + ". " + formatMjeseca + ". " + godina + ". " + "Podsjeti na: "
				+ sadrzajPodsjetnika);

		// kreiramo objekat za upis sadrzaja iz liste u fajl
		BufferedWriter writer = Files.newBufferedWriter(path);

		// upsisujemo sadrzaj iz liste, svaki indeks u novi red
		for (int i = 0; i < list.size(); i++) {
			writer.write(list.get(i));
			// kada se upisuje sadrzaj sa poslednjeg indeksa iz liste ne pravi
			// se noci red na kraju
			if (i != (list.size() - 1))
				writer.newLine();
		}
		writer.close();
		System.out.println("Podsjetnik je kreiran.");
		System.out.println();
	}

	public static String vratiImeMjeseca(int mjesec) {
		if (mjesec == 1) {
			return "Januar";
		}
		if (mjesec == 2) {
			return "Februar";
		}
		if (mjesec == 3) {
			return "Mart";
		}
		if (mjesec == 4) {
			return "April";
		}
		if (mjesec == 5) {
			return "Maj";
		}
		if (mjesec == 6) {
			return "Jun";
		}
		if (mjesec == 7) {
			return "Jul";
		}
		if (mjesec == 8) {
			return "Avgust";
		}
		if (mjesec == 9) {
			return "Septembar";
		}
		if (mjesec == 10) {
			return "Oktobar";
		}
		if (mjesec == 11) {
			return "Novembar";
		}
		if (mjesec == 12) {
			return "Decembar";
		}
		return null;
	}

}
