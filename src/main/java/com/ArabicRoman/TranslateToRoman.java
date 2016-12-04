/**
 * 
 */
package main.java.com.ArabicRoman;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Erin
 *
 */
public class TranslateToRoman {

	private static Scanner sc = new Scanner(System.in);
	private static int userNumber;
	private static String userNumberAsString;
	private static StringBuilder romanAsStringBuilder = new StringBuilder();
	private static ArrayList<Character> romanAnswer = new ArrayList<>();

	// ADD VALIDATION
	public static void toRoman() {

		int lengthOfUserNumber;

		System.out.println("Please enter the number to be converted.");

		userNumber = Integer.parseInt(userNumberAsString = sc.nextLine());
		lengthOfUserNumber = userNumberAsString.length();

		do {
			if (userNumber > 2999 || userNumber < 1) {
				System.out.println("Invalid");
				userNumber = 0;

			} else {
				switch (lengthOfUserNumber) {
				case 4:
					mille();
					break;

				case 3:
					centum();
					break;

				case 2:
					decem();
					break;

				case 1:
					unum();
					break;

				default:
					break;
				}
			}

		} while (userNumber > 0);
		
		System.out.println(romanAsStringBuilder);

	}

	private static void mille() {
		romanAsStringBuilder.append('M');
		userNumber -= 1000;
	}

	private static int centum() {
		return 0;
	}

	private static int decem() {
		return 0;
	}

	private static int unum() {
		return 0;
	}

}
