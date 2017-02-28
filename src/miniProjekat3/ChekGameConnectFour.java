package miniProjekat3;

public class ChekGameConnectFour {

	//metoda koja provjerava da li je igrac imao 4 uzastopna znaka u redu
	public static boolean provjeriPobjednikaRed(String[][] niz) {

		int brojacX0 = 0;
		int brojacO0 = 0;
		int brojacX1 = 0;
		int brojacO1 = 0;
		int brojacX2 = 0;
		int brojacO2 = 0;
		int brojacX3 = 0;
		int brojacO3 = 0;
		int brojacX4 = 0;
		int brojacO4 = 0;
		int brojacX5 = 0;
		int brojacO5 = 0;

		// provjeravamo da li u redu imamo 4 uzastopna ista znaka
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				//procjeravamo treci red
				if (i == 0) {
					if (niz[i][j] == "X") {
						brojacX0++;
						if (brojacX0 == 4){
							return true;
						}
					}else{
						brojacX0 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO0++;
						if (brojacO0 == 4){
							return true;
						}
					}else{
						brojacO0 = 0;
					}
				}
				//provjeravamo drugi red
				if (i == 1) {
					if (niz[i][j] == "X") {
						brojacX1++;
						if (brojacX1 == 4){
							return true;
						}
					}else{
						brojacX1 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO1++;
						if (brojacO1 == 4){
							return true;
						}
					}else{
						brojacO1 = 0;
					}
				}
				//provjeravamo treci red
				if (i == 2) {
					if (niz[i][j] == "X") {
						brojacX2++;
						if (brojacX2 == 4){
							return true;
						}
					}else{
						brojacX2 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO2++;
						if (brojacO2 == 4){
							return true;
						}
					}else{
						brojacO2 = 0;
					}
				}
				//provjeravamo cetvrti red
				if (i == 3) {
					if (niz[i][j] == "X") {
						brojacX3++;
						if (brojacX3 == 4){
							return true;
						}
					}else{
						brojacX3 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO3++;
						if (brojacO3 == 4){
							return true;
						}
					}else{
						brojacO3 = 0;
					}
				}
				//provjeravamo 5 red
				if (i == 4) {
					if (niz[i][j] == "X") {
						brojacX4++;
						if (brojacX4 == 4){
							return true;
						}
					}else{
						brojacX4 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO4++;
						if (brojacO4 == 4){
							return true;
						}
					}else{
						brojacO4 = 0;
					}
				}
				//provjeravamo 6 red
				if (i == 5) {
					if (niz[i][j] == "X") {
						brojacX5++;
						if (brojacX5 == 4){
							return true;
						}
					}else{
						brojacX5 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO5++;
						if (brojacO5 == 4){
							return true;
						}
					}else{
						brojacO5 = 0;
					}
				}
			}
		}
		return false;
	}
	
	//metoda koja provjerava da li je igrac imao 4 uzastopna znaka u koloni
	public static boolean provjeriPobjednikaKolona(String[][] niz){
		
		int brojacX0 = 0;
		int brojacO0 = 0;
		int brojacX1 = 0;
		int brojacO1 = 0;
		int brojacX2 = 0;
		int brojacO2 = 0;
		int brojacX3 = 0;
		int brojacO3 = 0;
		int brojacX4 = 0;
		int brojacO4 = 0;
		int brojacX5 = 0;
		int brojacO5 = 0;
		int brojacX6 = 0;
		int brojacO6 = 0;
		
		for (int i =0; i<niz.length; i++){
	        for(int j=0; j<niz[i].length;j++){
	        	//provjeravamo prvu kolonu
	        	if (j == 0){
		        	if (niz[i][j] == "X") {
						brojacX0++;
						if (brojacX0 == 4){
							return true;
						}
					}else{
						brojacX0 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO0++;
						if (brojacO0 == 4){
							return true;
						}
					}else{
						brojacO0 = 0;
					}
		        }
	        	//provjeravamo drugu kolonu
	        	if (j == 1){
	        		if (niz[i][j] == "X") {
	        			brojacX1++;
	        			if (brojacX1 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacX1 = 0;
	        		}
	        		if (niz[i][j] == "O") {
	        			brojacO1++;
	        			if (brojacO1 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacO1= 0;
	        		}
	        	}
	        	//provjeravamo trecu kolonu
	        	if (j == 2){
	        		if (niz[i][j] == "X") {
	        			brojacX2++;
	        			if (brojacX2 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacX2 = 0;
	        		}
	        		if (niz[i][j] == "O") {
	        			brojacO2++;
	        			if (brojacO2 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacO2= 0;
	        		}
	        	}
	        	//provjeravamo cetvrtu kolonu
	        	if (j == 3){
	        		if (niz[i][j] == "X") {
	        			brojacX3++;
	        			if (brojacX3 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacX3 = 0;
	        		}
	        		if (niz[i][j] == "O") {
	        			brojacO3++;
	        			if (brojacO3 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacO3= 0;
	        		}
	        	}
	        	//provjeravamo petu kolonu
	        	if (j == 4){
	        		if (niz[i][j] == "X") {
	        			brojacX4++;
	        			if (brojacX4 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacX4 = 0;
	        		}
	        		if (niz[i][j] == "O") {
	        			brojacO4++;
	        			if (brojacO4 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacO4= 0;
	        		}
	        	}
	        	//provjeravamo sestu kolonu
	        	if (j == 5){
	        		if (niz[i][j] == "X") {
	        			brojacX5++;
	        			if (brojacX5 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacX5 = 0;
	        		}
	        		if (niz[i][j] == "O") {
	        			brojacO5++;
	        			if (brojacO5 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacO5= 0;
	        		}
	        	}
	        	//provjeravamo sedmu kolonu
	        	if (j == 6){
	        		if (niz[i][j] == "X") {
	        			brojacX6++;
	        			if (brojacX6 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacX6 = 0;
	        		}
	        		if (niz[i][j] == "O") {
	        			brojacO6++;
	        			if (brojacO6 == 4){
	        				return true;
	        			}
	        		}else{
	        			brojacO6= 0;
	        		}
	        	}
	        }
	    }
		return false;
	}
	
	// metoda provjerava prvu dijagonalu i da li postoje 4 uzastopna ista znaka
	public static boolean provjeriPobjednikaDijagonala(String[][] niz) {

		int brojacX0 = 0;
		int brojacO0 = 0;
		int brojacX1 = 0;
		int brojacO1 = 0;
		int brojacX2 = 0;
		int brojacO2 = 0;
		int brojacX3 = 0;
		int brojacO3 = 0;
		int brojacX4 = 0;
		int brojacO4 = 0;
		int brojacX5 = 0;
		int brojacO5 = 0;

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				//provjeravamo prvu dijagonalu
				if (j == i - 2) {
					if (niz[i][j] == "X") {
						brojacX0++;
						if (brojacX0 == 4) {
							return true;
						}
					} else {
						brojacX0 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO0++;
						if (brojacO0 == 4) {
							return true;
						}
					} else {
						brojacO0 = 0;
					}
				}
				//provjeravamo drugu dijagonalu
				if (j == i - 1) {
					if (niz[i][j] == "X") {
						brojacX1++;
						if (brojacX1 == 4) {
							return true;
						}
					} else {
						brojacX1 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO1++;
						if (brojacO1 == 4) {
							return true;
						}
					} else {
						brojacO1 = 0;
					}
				}
				//provjeravamo trecu dijagonalu
				if (j == i) {
					if (niz[i][j] == "X") {
						brojacX2++;
						if (brojacX2 == 4) {
							return true;
						}
					} else {
						brojacX2 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO2++;
						if (brojacO2 == 4) {
							return true;
						}
					} else {
						brojacO2 = 0;
					}
				}
				//provjeravamo cetvrtu dijagonalu
				if (j == i + 1) {
					if (niz[i][j] == "X") {
						brojacX3++;
						if (brojacX3 == 4) {
							return true;
						}
					} else {
						brojacX3 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO3++;
						if (brojacO3 == 4) {
							return true;
						}
					} else {
						brojacO3 = 0;
					}
				}
				//provjeravamo petu dijagonalu
				if (j == i + 2) {
					if (niz[i][j] == "X") {
						brojacX4++;
						if (brojacX4 == 4) {
							return true;
						}
					} else {
						brojacX4 = 0;
					}
					if (niz[i][j] == "O") {
						brojacO4++;
						if (brojacO4 == 4) {
							return true;
						}
					} else {
						brojacO4 = 0;
					}
					//provjeravamo sestu dijagonalu
					if (j == i + 3) {
						if (niz[i][j] == "X") {
							brojacX5++;
							if (brojacX5 == 4) {
								return true;
							}
						} else {
							brojacX5 = 0;
						}
						if (niz[i][j] == "O") {
							brojacO5++;
							if (brojacO5 == 4) {
								return true;
							}
						} else {
							brojacO5 = 0;
						}
					}
				}
			}
		}

		return false;
	}
	
	// metoda provjerava drugu dijagonalu i da li postoje 4 uzastopna ista znaka
	//svaka dijagonala je pojedinacno provjerena
		public static boolean provjeriPobjednikaObrnutaDijagonala(String[][] niz){
			
			int brojacX0 = 0;
			int brojacO0 = 0;
			int brojacX1 = 0;
			int brojacO1 = 0;
			int brojacX2 = 0;
			int brojacO2 = 0;
			int brojacX3 = 0;
			int brojacO3 = 0;
			int brojacX4 = 0;
			int brojacO4 = 0;
			int brojacX5 = 0;
			int brojacO5 = 0;
			int brojacX6 = 0;
			int brojacO6 = 0;
			int brojacX7 = 0;
			int brojacO7 = 0;
			int brojacX8 = 0;
			int brojacO8 = 0;
			int brojacX9 = 0;
			int brojacO9 = 0;
			int brojacX10 = 0;
			int brojacO10 = 0;
			int brojacX11 = 0;
			int brojacO11 = 0;
			
			//dijagonale prvog reda od dna
			for (int i = 5, j=0; i>=2; i--){
				if (niz[i][j] == "X") {
					brojacX0++;
					if (brojacX0 == 4) {
						return true;
					}
				}
				else {
					brojacX0 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO0++;
					if (brojacO0 == 4) {
						return true;
					}
				}
				else {
					brojacO0 = 0;
				}
				j++;
			}
			for (int i = 5, j=1; i>=2; i--){
				if (niz[i][j] == "X") {
					brojacX1++;
					if (brojacX1 == 4) {
						return true;
					}
				}
				else {
					brojacX1 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO1++;
					if (brojacO1 == 4) {
						return true;
					}
				}
				else {
					brojacO1 = 0;
				}
				j++;
			}
			for (int i = 5, j=2; i>=2; i--){
				if (niz[i][j] == "X") {
					brojacX2++;
					if (brojacX2 == 4) {
						return true;
					}
				}
				else {
					brojacX2 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO2++;
					if (brojacO2 == 4) {
						return true;
					}
				}
				else {
					brojacO2 = 0;
				}
				j++;
			}
			for (int i = 5, j=3; i>=2; i--){
				if (niz[i][j] == "X") {
					brojacX3++;
					if (brojacX3 == 4) {
						return true;
					}
				}
				else {
					brojacX3 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO3++;
					if (brojacO3 == 4) {
						return true;
					}
				}
				else {
					brojacO3 = 0;
				}
				j++;
			}
			//dijagonale drugog reda od dna
			for (int i = 4, j=0; i>=1; i--){
				if (niz[i][j] == "X") {
					brojacX4++;
					if (brojacX4 == 4) {
						return true;
					}
				}
				else {
					brojacX4 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO4++;
					if (brojacO4 == 4) {
						return true;
					}
				}
				else {
					brojacO4 = 0;
				}
				j++;
			}
			for (int i = 4, j=1; i>=1; i--){
				if (niz[i][j] == "X") {
					brojacX5++;
					if (brojacX5 == 4) {
						return true;
					}
				}
				else {
					brojacX5 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO5++;
					if (brojacO5 == 4) {
						return true;
					}
				}
				else {
					brojacO5 = 0;
				}
				j++;
			}
			for (int i = 4, j=2; i>=1; i--){
				if (niz[i][j] == "X") {
					brojacX6++;
					if (brojacX6 == 4) {
						return true;
					}
				}
				else {
					brojacX6 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO6++;
					if (brojacO6 == 4) {
						return true;
					}
				}
				else {
					brojacO6 = 0;
				}
				j++;
			}
			for (int i = 4, j=3; i>=1; i--){
				if (niz[i][j] == "X") {
					brojacX7++;
					if (brojacX7 == 4) {
						return true;
					}
				}
				else {
					brojacX7 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO7++;
					if (brojacO7 == 4) {
						return true;
					}
				}
				else {
					brojacO7 = 0;
				}
				j++;
			}
			//dijagonale treceg reda od dna
			for (int i = 3, j=0; i>=0; i--){
				if (niz[i][j] == "X") {
					brojacX8++;
					if (brojacX8 == 4) {
						return true;
					}
				}
				else {
					brojacX8 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO8++;
					if (brojacO8 == 4) {
						return true;
					}
				}
				else {
					brojacO8 = 0;
				}
				j++;
			}
			for (int i = 3, j=1; i>=0; i--){
				if (niz[i][j] == "X") {
					brojacX9++;
					if (brojacX9 == 4) {
						return true;
					}
				}
				else {
					brojacX9 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO9++;
					if (brojacO9 == 4) {
						return true;
					}
				}
				else {
					brojacO9 = 0;
				}
				j++;
			}
			for (int i = 3, j=2; i>=0; i--){
				if (niz[i][j] == "X") {
					brojacX10++;
					if (brojacX10 == 4) {
						return true;
					}
				}
				else {
					brojacX10 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO10++;
					if (brojacO10 == 4) {
						return true;
					}
				}
				else {
					brojacO10 = 0;
				}
				j++;
			}
			for (int i = 3, j=3; i>=0; i--){
				if (niz[i][j] == "X") {
					brojacX11++;
					if (brojacX11 == 4) {
						return true;
					}
				}
				else {
					brojacX11 = 0;
				}
				if (niz[i][j] == "O") {
					brojacO11++;
					if (brojacO11 == 4) {
						return true;
					}
				}
				else {
					brojacO11 = 0;
				}
				j++;
			}
			
			return false;
		}
}
