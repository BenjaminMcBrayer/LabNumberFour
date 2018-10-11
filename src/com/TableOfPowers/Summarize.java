package com.TableOfPowers;
import java.util.Scanner;

public class Summarize {
	private static Scanner scanner = new Scanner(System.in);
  
	public static int sumOfNumbersFromSystemIn() {
    int firstSummand = scanner.nextInt();
    int secondSummand = scanner.nextInt();
    return firstSummand + secondSummand;
  }
}