package zadaci_27_02_2017;

public class Zadatak4 {
	public static void main(String[] args) {

		int[][] niz = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
		
		System.out.println("Niz prije sortiranja");
		prikaziMatricu(niz);
		System.out.println("Niz posle sortiranja");
		sort(niz);
		prikaziMatricu(niz);

	}
	
	//ispisujemo matricu
	public static void prikaziMatricu(int[][] niz) {
		for(int i = 0; i < niz.length; i++) {
			for(int j = 0; j < niz[i].length; j++)
			System.out.print(niz[i][j] + " ");
			System.out.println();
		}
	}

	//sortiramo matricu
	public static void sort(int[][] m) {
		//sortiramo redove
		for(int i = 0; i < m.length - 1; i++) {
			int min = m[i][0];
			int index = i;

			for(int j = i + 1; j < m.length; j++) {

				if(min > m[j][0]) {
					min = m[j][0];
					index = j;
				}
			}

			if(index != i) {
				int temp0 = m[index][0];
				int temp1 = m[index][1];
				m[index][0] = m[i][0];
				m[index][1] = m[i][1];
				m[i][0] = temp0;
				m[i][1] = temp1;
			}
		}

		//sortiramo kolone
		for (int i = 0; i < m.length; i++) {
			double min = m[i][0];
			int index = i;

			for (int j = i; j < m.length; j++) {
				if (min == m[j][0] && m[index][1] > m[j][1]) {
					min = m[j][0];
					index = j;
				}
			}
			
			if (index != i) {
				int temp0 = m[index][0];
				int temp1 = m[index][1];
				m[index][0] = m[i][0];
				m[index][1] = m[i][1];
				m[i][0] = temp0;
				m[i][1] = temp1;
			}
		}
}
}
