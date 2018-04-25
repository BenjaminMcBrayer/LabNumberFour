
//Benjamin McBrayer (Pair programmer: Jill Xu)
//This Java console program displays a table of powers.

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		int i;
		String playAgain = null;
		String userInfo;

		System.out.println("Learn your squares and cubes!");

		// Ask for user information.
		System.out.print("Please enter your name: ");
		userInfo = scnr.next();
		System.out.println("Hello, " + userInfo + "!");

		do {// Prompt user to enter an integer.
			System.out.print("Please enter an integer: ");
			userNum = scnr.nextInt();

			// Create table.
			System.out.printf("%1$-10s %2$-10s %3$-10s", "Number", "Squared", "Cubed");
			System.out.printf("\n%1$-10s %2$-10s %3$-10s", "=======", "=======", "======");

			// Calculate and print numbers, squares, and cubes from 1 to the value entered.
			for (i = 1; i <= userNum; ++i) {
				System.out.printf("\n%1$-10s %2$-10s %3$-10s", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
			}

			// Ask if the user wants to continue entering numbers.
			System.out.println();
			System.out.print(userInfo + ", would you like to continue (y/n)?");
			playAgain = scnr.next();
			scnr.nextLine();

		} while (playAgain.equalsIgnoreCase("y"));

		// End program officially if user enters anything other than "Y" or "y."
		if (!playAgain.equalsIgnoreCase("y")) {
			System.out.println("Goodbye, " + userInfo + "!");
		}

		scnr.close();

	}

}
