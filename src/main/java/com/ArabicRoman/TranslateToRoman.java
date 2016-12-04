/**
 * 
 */
package main.java.com.ArabicRoman;

import java.util.Scanner;

/**
 * @author Erin
 *
 */
public class TranslateToRoman {

	// ADD VALIDATION
	public static void toRoman() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int lengthOfUserNumber;
		String userNumberAsString;
		StringBuilder romanAsStringBuilder = new StringBuilder();

		System.out.println("Please enter the number to be converted.");
		ArabicNumber userObj = new ArabicNumber(Integer.parseInt(userNumberAsString = sc.nextLine()));
		lengthOfUserNumber = userNumberAsString.length();

		do {
			if (userObj.getNewUserNumber() > 2999 || userObj.getNewUserNumber() < 1) {
				System.out.println("Invalid");
				userObj.setNewUserNumber(0);

			} else {
				switch (lengthOfUserNumber) {
				case 4:
					userObj = mille(userObj);
					break;

				case 3:
					userObj = centum(userObj);
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

	public static ArabicNumber centum(ArabicNumber userObj) {

		int hundredToSwitch = Character.getNumericValue(Integer.toString(userObj.getNewUserNumber()).charAt(0));

		switch (hundredToSwitch) {
		case 9:
			userObj = nineHundred(userObj);
			break;
		case 8:
			userObj = eightHundred(userObj);
			break;
		case 7:
			userObj = sevenHundred(userObj);
			break;
		case 6:
			userObj = sixHundred(userObj);
			break;
		case 5:
			userObj = fiveHundred(userObj);
			break;
		case 4:
			userObj = fourHundred(userObj);
			break;
		case 3:
			userObj = threeHundred(userObj);
			break;
		case 2:
			userObj = twoHundred(userObj);
			break;
		// Default is 1
		default:
			userObj = oneHundred(userObj);
			break;
		}
		return userObj;

	}

	public static void decem() {
	}

	public static void unum() {
	}

	// Methods for the Hundreds

	public static ArabicNumber nineHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 900);
		userObj.setAddToAnswer("CM");
		return userObj;
	}

	public static ArabicNumber eightHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 800);
		userObj.setAddToAnswer("DCCC");
		return userObj;
	}

	public static ArabicNumber sevenHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 700);
		userObj.setAddToAnswer("DCC");
		return userObj;
	}

	public static ArabicNumber sixHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 600);
		userObj.setAddToAnswer("DC");
		return userObj;
	}

	public static ArabicNumber fiveHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 500);
		userObj.setAddToAnswer("D");
		return userObj;
	}

	public static ArabicNumber fourHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 400);
		userObj.setAddToAnswer("CD");
		return userObj;
	}

	public static ArabicNumber threeHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 300);
		userObj.setAddToAnswer("CCC");
		return userObj;
	}

	public static ArabicNumber twoHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 200);
		userObj.setAddToAnswer("CC");
		return userObj;
	}

	public static ArabicNumber oneHundred(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 100);
		userObj.setAddToAnswer("C");
		return userObj;
	}

}
