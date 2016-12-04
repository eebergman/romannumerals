/**
 * 
 */
package main.java.com.Launch;

import java.util.Scanner;

import main.java.com.ArabicRoman.TranslateToRoman;

/**
 * @author Erin
 *
 */
public class Launch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userTranslationChoice;
		String tnxAgain = null;
		boolean userEnteredCorrectChoice = true;
		boolean stillPlaying = true;

		System.out.println("Hello and welcome");
		System.out.println("Salve et grata\n");

		do {
			do {
				System.out.println("For Arabic Numerals to Roman Numerals please press 'A'");
				System.out.println("For Roman Numerals to Arabic Numerals please press 'R'");

				userEnteredCorrectChoice = validUserChoiceEntry(userTranslationChoice = sc.nextLine());

				System.out.println(userTranslationChoice);

			} while (userEnteredCorrectChoice);

			if (userTranslationChoice.equalsIgnoreCase("a")) {
				TranslateToRoman.toRoman();
			} else {

			}

			System.out.println("Would you like to translate again?\n(Y/N)");
			stillPlaying = stillPlaying(tnxAgain = sc.nextLine());

		} while (stillPlaying);

		sc.close();
	} // main

	private static boolean validUserChoiceEntry(String string) {

		boolean returningBooleanForUserEntry = true;

		switch (string.toLowerCase()) {
		case "a":
			returningBooleanForUserEntry = false;
			break;

		case "r":
			returningBooleanForUserEntry = false;
			break;

		default:
			break;
		}

		return returningBooleanForUserEntry;
	}

	private static boolean stillPlaying(String string) {

		switch (string.toLowerCase()) {
		case "n":
			return false;
			
		default:
			break;
		}
		return true;
	}

} // class
