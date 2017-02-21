package miniProjekat2_Craps_Credits;

import java.util.Scanner;
//game Craps
public class Craps {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int option = 0;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		int point = 0;
		boolean test = true;
		boolean testInput = true;
		boolean getEqualPoint = true;

		while (test) {

			System.out.println("Play Craps");
			System.out.println("1 - New game");
			System.out.println("2 - Exit");
			//set on true again so that we can roll the dices again
			getEqualPoint = true;
			
			while (testInput) {
				try {
					option = input.nextInt();
					while (option != 1 && option != 2) {
						System.out.println("Wrong input try again:");
						option = input.nextInt();
						input.nextLine();
					}
					testInput = false;
				} catch (Exception e) {
					System.out.println("You must input a number!");
					System.out.println("Wrong input try again:");
					input.nextLine();
				}
			}
			testInput = true;
			
			if (option == 1) {
				
				num1 = (int) (1 + (Math.random() * 6));
				num2 = (int) (1 + (Math.random() * 6));
				result = num1 + num2;
				
				System.out.println("You rolled " + num1 + " + " + num2 + " = " + result);

				// win if 7 or 11 rolled
				if (result == 7 || result == 11) {
					System.out.println("You win!");
					System.out.println();
					getEqualPoint = false;
				}

				// lose if 2,3 or 12 roled
				if (result == 2 || result == 3 || result == 12) {
					System.out.println("You lose!");
					System.out.println();
					getEqualPoint = false;
				}

				//try to get the equal point
				if (getEqualPoint) {
					System.out.println("You got a point!");
					// roll again
					while (point != result) {
						System.out.println();
						System.out.println("Roling again...");
						// wait two seconds to simulate the rolling
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e1) {
						}

						num1 = (int) (1 + (Math.random() * 6));
						num2 = (int) (1 + (Math.random() * 6));
						point = num1 + num2;
						System.out.println("You rolled " + num1 + " + " + num2 + " = " + point);
						//lose if point is equal to 7
						if (point == 7){
							break;
						}
					}
					// if we get the point equal as the result it's win
					if (point == result) {
						System.out.println("You win!");
						System.out.println();
					} else {
						System.out.println("You lose!");
						System.out.println();
					}
				}

			}
			if (option == 2){
				input.close();
				test = false;
				System.exit(1);
			}
		}
	}

}
