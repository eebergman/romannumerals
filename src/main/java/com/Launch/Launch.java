/**
 * 
 */
package main.java.com.Launch;

import java.util.Scanner;

import main.java.com.ArabicRoman.TranslateToRoman;
import main.java.com.RomanArabic.TranslateToArabic;

/**
 * @author Erin
 *
 */
public class Launch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userTranslationChoice;
		boolean userEnteredCorrectChoice = true;
		boolean stillPlaying = true;

		System.out.println("Hello and welcome");
		System.out.println("Salve et grata\n");

		do {
			do {
				System.out.println("For Arabic Numerals to Roman Numerals please press 'A'");
				System.out.println("For Roman Numerals to Arabic Numerals please press 'R'");

				userEnteredCorrectChoice = validUserChoiceEntry(userTranslationChoice = sc.nextLine());

			} while (userEnteredCorrectChoice);

			if (userTranslationChoice.equalsIgnoreCase("a")) {
				TranslateToRoman.toRoman();

			} else {
				TranslateToArabic.toArabic();
			}

			System.out.println("Would you like to translate again?");
			stillPlaying = stillTranslate(sc.nextLine());

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

	private static boolean stillTranslate(String string) {

		switch (string.toLowerCase()) {
		case "n":
			return false;

		default:
			break;
		}
		return true;
	}

} // class
