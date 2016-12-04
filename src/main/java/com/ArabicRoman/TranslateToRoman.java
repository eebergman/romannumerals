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

	// ADD VALIDATION
	public static void toRoman() {
		
		Scanner sc = new Scanner(System.in);

		int lengthOfUserNumber;
		String userNumberAsString;
		StringBuilder romanAsStringBuilder = new StringBuilder();
		ArrayList<Character> romanAnswer = new ArrayList<>();

		System.out.println("Please enter the number to be converted.");
		ArabicNumber userObj = new ArabicNumber(Integer.parseInt(userNumberAsString = sc.nextLine()));
		lengthOfUserNumber = userNumberAsString.length();

		do {
			if (userObj.getNewUserNumber() > 2999 || userObj.getNewUserNumber() < 1) {
				System.out.println("Invalid");
				userObj.setNewUserNumber(0);

			} else {
				switch (userObj.getNewUserNumber()) {
				case 4:
					userObj = mille(userObj);
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
			romanAsStringBuilder.append(userObj.getAddToAnswer());
			userNumberAsString = Integer.toString(userObj.getNewUserNumber());
			lengthOfUserNumber = userNumberAsString.length();

		} while (userObj.getNewUserNumber() > 0);

		System.out.println(romanAsStringBuilder);

	} // toRoman

	public static ArabicNumber mille(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 1000);
		userObj.setAddToAnswer("M");
		return userObj;
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
