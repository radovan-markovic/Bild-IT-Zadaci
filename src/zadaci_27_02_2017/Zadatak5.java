package zadaci_27_02_2017;

public class Zadatak5 {

	public static void main(String[] args) {

		int[][] matrix = new int[6][6];

		//generisemo matricu 6x6 sa nasumicnim 0 i 1
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
		int sumaKolone5 = 0;
		int sumaKolone6 = 0;
		int sumaReda1 = 0;
		int sumaReda2 = 0;
		int sumaReda3 = 0;
		int sumaReda4 = 0;
		int sumaReda5 = 0;
		int sumaReda6 = 0;
		
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
				if (row == 4 && matrix[4][column] == 1) {
					sumaReda5++;
				}
				if (row == 5 && matrix[5][column] == 1) {
					sumaReda6++;
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
			if (matrix[row][4] == 1) {
				sumaKolone5++;
			}
			if (matrix[row][5] == 1) {
				sumaKolone6++;
			}

		}
		
		//ispisujemo rezultat
		System.out.println();
		
		if (sumaReda1 % 2 == 0){
			System.out.println("Prvi red ima paran broj jedinica.");
		}else{
			System.out.println("Prvi red nema paran broj jedinica.");
		}
		if (sumaReda2 % 2 == 0){
			System.out.println("Drugi red ima paran broj jedinica.");
		}else{
			System.out.println("Drugi red nema paran broj jedinica.");
		}
		if (sumaReda3 % 2 == 0){
			System.out.println("Treci red ima paran broj jedinica.");
		}else{
			System.out.println("Treci red nema paran broj jedinica.");
		}
		if (sumaReda4 % 2 == 0){
			System.out.println("Cetvrti red ima paran broj jedinica.");
		}else{
			System.out.println("Cetvrti red nema paran broj jedinica.");
		}
		if (sumaReda5 % 2 == 0){
			System.out.println("Peti red ima paran broj jedinica.");
		}else{
			System.out.println("Peti red nema paran broj jedinica.");
		}
		if (sumaReda6 % 2 == 0){
			System.out.println("Sesti red ima paran broj jedinica.");
		}else{
			System.out.println("Sesti red nema paran broj jedinica.");
		}
		
		if (sumaKolone1 % 2 == 0){
			System.out.println("Prva kolona ima paran broj jedinica.");
		}else{
			System.out.println("Prva kolona nema paran broj jedinica.");
		}
		if (sumaKolone2 % 2 == 0){
			System.out.println("Druga kolona ima paran broj jedinica.");
		}else{
			System.out.println("Druga kolona nema paran broj jedinica.");
		}
		if (sumaKolone3 % 2 == 0){
			System.out.println("Treca kolona ima paran broj jedinica.");
		}else{
			System.out.println("Treca kolona nema paran broj jedinica.");
		}
		if (sumaKolone4 % 2 == 0){
			System.out.println("Cetvrta kolona ima paran broj jedinica.");
		}else{
			System.out.println("Cetvrta kolona nema paran broj jedinica.");
		}
		if (sumaKolone5 % 2 == 0){
			System.out.println("Peta kolona ima paran broj jedinica.");
		}else{
			System.out.println("Peta kolona nema paran broj jedinica.");
		}
		if (sumaKolone6 % 2 == 0){
			System.out.println("Sesta kolona ima paran broj jedinica.");
		}else{
			System.out.println("Sesta kolona nema paran broj jedinica.");
		}
	}

}
