package zadaci_22_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		int broj = -1;
		boolean test = true;
		
		while (test){//testiramo unos
			try{
				while (broj < 0 || broj > 2){
					System.out.println("Unesite broj 0 za Rock, 1 za Peper, 2 za Scissors:");
					broj = input.nextInt();
					input.nextLine();
				}
				test = false;
			}catch (Exception e){
				System.out.println("Pogresan unos, morate unijeti broj");
				input.nextLine();
			}
		}
		
		String izborIgraca = "";
		if (broj == 0){
			izborIgraca = "Rock";
		}
		if (broj == 1){
			izborIgraca = "Paper";
		}
		if (broj == 2){
			izborIgraca = "Scissors";
		}
		
		int CPUigra = (int)(Math.random()*3);
		String izborCPU = "";
		
		if (CPUigra == 0){
			izborCPU = "Rock";
		}
		if (CPUigra == 1){
			izborCPU = "Paper";
		}
		if (CPUigra == 2){
			izborCPU = "Scissors";
		}
		
		//slucaj kada je nerijeseno
		if (CPUigra == broj){
			System.out.println("Racunar je izabrao " + izborCPU + " a Vi ste izabrali " + izborIgraca);
			System.out.println("Nerijeseno!");
		}
		
		//ispitujemo sve moguce slucajeve pobjede
		if (CPUigra == 0 && broj == 2){
			System.out.println("Racunar je izabrao " + izborCPU + " a Vi ste izabrali " + izborIgraca);
			System.out.println("Izgubili ste!");
		}
		if (CPUigra == 2 && broj == 0){
			System.out.println("Racunar je izabrao " + izborCPU + " a Vi ste izabrali " + izborIgraca);
			System.out.println("Pobijedili ste!");
		}
		if (CPUigra == 0 && broj == 1){
			System.out.println("Racunar je izabrao " + izborCPU + " a Vi ste izabrali " + izborIgraca);
			System.out.println("Pobijedili ste!");
		}
		if (CPUigra == 1 && broj == 0){
			System.out.println("Racunar je izabrao " + izborCPU + " a Vi ste izabrali " + izborIgraca);
			System.out.println("Izgubili ste!");
		}
		if (CPUigra == 1 && broj == 2){
			System.out.println("Racunar je izabrao " + izborCPU + " a Vi ste izabrali " + izborIgraca);
			System.out.println("Pobijedili ste!");
		}
		if (CPUigra == 2 && broj == 1){
			System.out.println("Racunar je izabrao " + izborCPU + " a Vi ste izabrali " + izborIgraca);
			System.out.println("Izgubili ste!");
		}
		
		input.close();
	}

}
