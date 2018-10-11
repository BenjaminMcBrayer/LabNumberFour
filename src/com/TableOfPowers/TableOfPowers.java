package com.TableOfPowers;

//Benjamin McBrayer (Pair programmer: J Xu)
//This Java console program displays a table of powers.

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		// Declare and initialize variables.
		Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		String playAgain = null;
		String userInfo = null;

		// Introduce the program.
		System.out.println("Learn your squares and cubes!");

		// Ask for user information.
		userInfo = Validator.getString(scnr, "Please enter your name: ");
		// Greet user.
		System.out.println("Hello, " + userInfo + "!");

		do {// Prompt user to enter an integer.
			userNum = Validator.getInt(scnr, "Please enter an integer between 1 and 20: ", 1, 20);
			
			// Create table.
			displayTable();

			// Calculate and print numbers, squares, and cubes from 1 to the value entered.
			calculatePowers(userNum);

			// Ask if the user wants to continue entering numbers.
			System.out.println();
			playAgain = Validator.getString(scnr, userInfo + ", would you like to continue (y/n)?");

		} while (playAgain.equalsIgnoreCase("y"));

		// End program officially if user enters anything other than "Y" or "y."
		System.out.println("Goodbye, " + userInfo + "!");

		scnr.close();

	}

	public static void calculatePowers(int userNum) {
		for (int i = 1; i <= userNum; ++i) {
			System.out.printf("\n%1$-10s %2$-10s %3$-10s", i, (long) Math.pow(i, 2), (long) Math.pow(i, 3));
		}
	}

	public static void displayTable() {
		System.out.printf("%1$-10s %2$-10s %3$-10s", "Number", "Squared", "Cubed");
		System.out.printf("\n%1$-10s %2$-10s %3$-10s", "=======", "=======", "======");
	}

}
