package zadaci_27_02_2017;

public class Zadatak3 {
	public static void main(String[] args) {

		int[][] matrix = new int[4][4];

		//generisemo matricu 4x4 sa nasumicnim 0 i 1
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);
			}
		}
		
		//ispisujemo matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		
		//postavljamo brojace
		int sumaKolone1 = 0;
		int sumaKolone2 = 0;
		int sumaKolone3 = 0;
		int sumaKolone4 = 0;
		int sumaReda1 = 0;
		int sumaReda2 = 0;
		int sumaReda3 = 0;
		int sumaReda4 = 0;
		
		//racunamo sumu za red i kolonu prolazeci kroz matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				//racunamo sumu prolazeci kroz red
				if (row == 0 && matrix[0][column] == 1) {
					sumaReda1++;
				}
				if (row == 1 && matrix[1][column] == 1) {
					sumaReda2++;
				}
				if (row == 2 && matrix[2][column] == 1) {
					sumaReda3++;
				}
				if (row == 3 && matrix[3][column] == 1) {
					sumaReda4++;
				}

			}
			//racunamo sumu za svaku od kolone
			if (matrix[row][0] == 1) {
				sumaKolone1++;
			}
			if (matrix[row][1] == 1) {
				sumaKolone2++;
			}
			if (matrix[row][2] == 1) {
				sumaKolone3++;
			}
			if (matrix[row][3] == 1) {
				sumaKolone4++;
			}

		}

		int maxKolone = 0;
		int kolona = 0;
		int maxReda = 0;
		int red = 0;
		
		//trazimo prvu kolonu/red sa najvise jedinica
		for (int i = 0; i <= 1; i++) {
			if (sumaKolone1 > maxKolone) {
				maxKolone = sumaKolone1;
				kolona = 1;
			}
			if (sumaKolone2 > maxKolone) {
				maxKolone = sumaKolone2;
				kolona = 2;
			}
			if (sumaKolone3 > maxKolone) {
				maxKolone = sumaKolone3;
				kolona = 3;
			}
			if (sumaKolone4 > maxKolone) {
				maxKolone = sumaKolone4;
				kolona = 4;
			}
			if (sumaReda1 > maxReda) {
				maxReda = sumaReda1;
				red = 1;
			}
			if (sumaReda2 > maxReda) {
				maxReda = sumaReda2;
				red = 2;
			}
			if (sumaReda3 > maxReda) {
				maxReda = sumaReda3;
				red = 3;
			}
			if (sumaReda4 > maxReda) {
				maxReda = sumaReda4;
				red = 4;
			}
		}
		//ispisujemo rezultat
		System.out.println();
		System.out.println("Najvise jedinica ima u redu: " + red);
		System.out.println("Najvise jedinica ima u koloni: " + kolona);

	}

}
