package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		boolean test = true;
		int broj1 = 0;
		int broj2 = 0;
		Scanner input = new Scanner(System.in);
			
			while(test){//testiramo unos
				try{
					while (broj1 < 1 || broj1 > 54){
						System.out.println("Unesite prvi cijeli broj izmedju 1 i 54:");
						broj1 = input.nextInt();
						input.nextLine();
					}
					while (broj2 < 1 || broj2 > 54){
						System.out.println("Unesite drugi cijeli broj izmedju 1 i 54:");
						broj2 = input.nextInt();
						input.nextLine();
					}
					test = false;
					}catch (Exception e){
						System.out.println("Pogrsan unos, unesite ponovo:");
						input.nextLine();
					}
				}
			//pozivamo metodu koja vraca nasumican broj koji nije jednak 
			//proslijedjenim brojevima
			System.out.println(getRandom(broj1, broj2));
			
			input.close();
	}
	
	//metoda koja vraca nasumican broj koji nije jednak 
	//proslijedjenim brojevima
	public static int getRandom(int... numbers){
		
		int broj = (int)(Math.random()*55);
		
		while (broj == numbers[0] || broj == numbers[1] ){
			broj = (int)(Math.random()*55);
		}
		
		return broj;
	}

}
