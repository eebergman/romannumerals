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
	@SuppressWarnings("unused")
	private static ArrayList<Character> romanAnswer = new ArrayList<>();

	// ADD VALIDATION
	public static void toRoman() {

		int lengthOfUserNumber;
		String catchMethodReturn = null;
		StringBuilder romanAsStringBuilder = new StringBuilder();

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
					catchMethodReturn = mille();
					break;

				case 3:
					catchMethodReturn = centum();
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
			romanAsStringBuilder.append(catchMethodReturn);
			userNumberAsString = Integer.toString(userNumber);
			lengthOfUserNumber = userNumberAsString.length();

		} while (userNumber > 0);

		System.out.println(romanAsStringBuilder);

	}

	private static String mille() {
		userNumber -= 1000;
		return "M";
	}

	private static String centum() {
		
		int hundredToSwitch = Character.getNumericValue(userNumberAsString.charAt(0));
		
		switch (hundredToSwitch) {
		case 9:
			userNumber -= 900;
			return "CM";
		case 8:
			userNumber -= 800;
			return "DCCC";
		case 7:
			userNumber -= 700;
			return "DCC";
		case 6:
			userNumber -= 700;
			return "DC";
		case 5:
			userNumber -= 500;
			return "D";
		case 4:
			userNumber -= 400;
			return "CD";
		case 3:
			userNumber -= 300;
			return "CCC";
		case 2:
			userNumber -= 200;
			return "CC";
		// Default is 1
		default:
			userNumber -= 100;
			return "C";
		}

	}

	private static void decem() {
	}

	private static void unum() {
	}

}
