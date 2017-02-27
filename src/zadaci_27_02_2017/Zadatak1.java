package zadaci_27_02_2017;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean test = true;

		int[] r1 = new int[7];
		int[] r2 = new int[7];
		int[] r3 = new int[7];
		int[] r4 = new int[7];
		int[] r5 = new int[7];
		int[] r6 = new int[7];
		int[] r7 = new int[7];
		int[] r8 = new int[7];

		while (test) {// testiramo unos
			System.out.println("Unesite 7 radnih sati za prvog radnika:");
			try {
				for (int i = 0; i < r1.length; i++) {
					System.out.println("Unesite broj u sati u danu:");
					r1[i] = input.nextInt();
					input.nextLine();
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}

		test = true;

		while (test) {// testiramo unos
			System.out.println("Unesite 7 radnih sati za drugog radnika:");
			try {
				for (int i = 0; i < r2.length; i++) {
					System.out.println("Unesite broj u sati u danu:");
					r2[i] = input.nextInt();
					input.nextLine();
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}

		test = true;
		while (test) {// testiramo unos
			System.out.println("Unesite 7 radnih sati za treceg radnika:");
			try {
				for (int i = 0; i < r3.length; i++) {
					System.out.println("Unesite broj u sati u danu:");
					r3[i] = input.nextInt();
					input.nextLine();
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}

		test = true;
		while (test) {// testiramo unos
			System.out.println("Unesite 7 radnih sati za cetvrtog radnika:");
			try {
				for (int i = 0; i < r4.length; i++) {
					System.out.println("Unesite broj u sati u danu:");
					r4[i] = input.nextInt();
					input.nextLine();
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}

		test = true;
		while (test) {// testiramo unos
			System.out.println("Unesite 7 radnih sati za petog radnika:");
			try {
				for (int i = 0; i < r5.length; i++) {
					System.out.println("Unesite broj u sati u danu:");
					r5[i] = input.nextInt();
					input.nextLine();
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}

		test = true;
		while (test) {// testiramo unos
			System.out.println("Unesite 7 radnih sati za sestog radnika:");
			try {
				for (int i = 0; i < r6.length; i++) {
					System.out.println("Unesite broj u sati u danu:");
					r6[i] = input.nextInt();
					input.nextLine();
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}

		test = true;
		while (test) {// testiramo unos
			System.out.println("Unesite 7 radnih sati za sedmog radnika:");
			try {
				for (int i = 0; i < r7.length; i++) {
					System.out.println("Unesite broj u sati u danu:");
					r7[i] = input.nextInt();
					input.nextLine();
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}

		test = true;

		while (test) {// testiramo unos
			System.out.println("Unesite 7 radnih sati za osmog radnika:");
			try {
				for (int i = 0; i < r8.length; i++) {
					System.out.println("Unesite broj u sati u danu:");
					r8[i] = input.nextInt();
					input.nextLine();
				}
				test = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos, unesite ponovo:");
				input.nextLine();
			}
		}

		input.close();
		
		//unosimo u 2D niz broj sati sod svakog radnika
		int niz[][] = { { r1[0], r1[1], r1[2], r1[3], r1[4], r1[5], r1[6] },
				{ r2[0], r2[1], r2[2], r2[3], r2[4], r2[5], r2[6] },
				{ r3[0], r3[1], r3[2], r3[3], r3[4], r3[5], r3[6] },
				{ r4[0], r4[1], r4[2], r4[3], r4[4], r4[5], r4[6] },
				{ r5[0], r5[1], r5[2], r5[3], r5[4], r5[5], r5[6] },
				{ r6[0], r6[1], r6[2], r6[3], r6[4], r6[5], r6[6] },
				{ r7[0], r7[1], r7[2], r6[3], r7[4], r7[5], r7[6] },
				{ r8[0], r8[1], r8[2], r8[3], r8[4], r8[5], r8[6] } };

		int suma = 0;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int max4 = 0;
		int max5 = 0;
		int max6 = 0;
		int max7 = 0;
		int max8 = 0;
		int radnik1 = 0;
		int radnik2 = 0;
		int radnik3 = 0;
		int radnik4 = 0;
		int radnik5 = 0;
		int radnik6 = 0;
		int radnik7 = 0;
		int radnik8 = 0;

		// racunamo sumu sati za svakog od radnika
		for (int i = 0, k = 0; i < niz.length; i++, k++) {
			for (int j = 0; j < niz[i].length; j++) {
				suma = suma + niz[i][j];

				if (i == 0) {
					max1 = suma;
					radnik1 = k + 1;

				}
				if (i == 1) {
					max2 = suma;
					radnik2 = k + 1;
				}
				if (i == 2) {
					max3 = suma;
					radnik3 = k + 1;

				}
				if (i == 3) {
					max4 = suma;
					radnik4 = k + 1;
				}
				if (i == 4) {
					max5 = suma;
					radnik5 = k + 1;
				}
				if (i == 5) {
					max6 = suma;
					radnik6 = k + 1;
				}
				if (i == 6) {
					max7 = suma;
					radnik7 = k + 1;
				}
				if (i == 7) {
					max8 = suma;
					radnik8 = k + 1;
				}

			}
			suma = 0;
		}

		int nizSuma[] = { max1, max2, max3, max4, max5, max6, max7, max8 };
		int nizRadnici[] = { radnik1, radnik2, radnik3, radnik4, radnik5, radnik6, radnik7, radnik8 };

		int length = nizSuma.length - 1;

		// koristimo bubble sort da sortiramo na iste pozicije radnike i sate
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (nizSuma[j] < nizSuma[j + 1]) {
					int zamjena = nizSuma[j];
					nizSuma[j] = nizSuma[j + 1];
					nizSuma[j + 1] = zamjena;
					int zamjenaRadnici = nizRadnici[j];
					nizRadnici[j] = nizRadnici[j + 1];
					nizRadnici[j + 1] = zamjenaRadnici;
				}
			}
		}

		System.out.println("Radnik " + nizRadnici[0] + " je imao sati: " + nizSuma[0]);
		System.out.println("Radnik " + nizRadnici[1] + " je imao sati: " + nizSuma[1]);
		System.out.println("Radnik " + nizRadnici[2] + " je imao sati: " + nizSuma[2]);
		System.out.println("Radnik " + nizRadnici[3] + " je imao sati: " + nizSuma[3]);
		System.out.println("Radnik " + nizRadnici[4] + " je imao sati: " + nizSuma[4]);
		System.out.println("Radnik " + nizRadnici[5] + " je imao sati: " + nizSuma[5]);
		System.out.println("Radnik " + nizRadnici[6] + " je imao sati: " + nizSuma[6]);
		System.out.println("Radnik " + nizRadnici[7] + " je imao sati: " + nizSuma[7]);
	}

}
