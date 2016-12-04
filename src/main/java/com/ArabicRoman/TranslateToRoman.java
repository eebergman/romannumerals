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
					userObj = decem(userObj);
					break;

				case 1:
					userObj = unum(userObj);
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

	// One thousand Method
	public static ArabicNumber mille(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 1000);
		userObj.setAddToAnswer("M");
		return userObj;
	}

	// Switch statement to determine which hundred to use
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

	public static ArabicNumber decem(ArabicNumber userObj) {

		// get the first number of the userNumber
		int tenToSwitch = Character.getNumericValue(Integer.toString(userObj.getNewUserNumber()).charAt(0));

		switch (tenToSwitch) {
		case 9:
			userObj = ninety(userObj);
			break;
		case 8:
			userObj = eighty(userObj);
			break;
		case 7:
			userObj = seventy(userObj);
			break;
		case 6:
			userObj = sixty(userObj);
			break;
		case 5:
			userObj = fifty(userObj);
			break;
		case 4:
			userObj = forty(userObj);
			break;
		case 3:
			userObj = thirty(userObj);
			break;
		case 2:
			userObj = twenty(userObj);
			break;
		// Default is 10
		default:
			userObj = ten(userObj);
			break;
		}

		return userObj;
	}

	public static ArabicNumber unum(ArabicNumber userObj) {

		// get the first number of the userNumber
		int oneToSwitch = Character.getNumericValue(Integer.toString(userObj.getNewUserNumber()).charAt(0));

		switch (oneToSwitch) {
		case 9:
			userObj = nine(userObj);
			break;
		case 8:
			userObj = eight(userObj);
			break;
		case 7:
			userObj = seven(userObj);
			break;
		case 6:
			userObj = six(userObj);
			break;
		case 5:
			userObj = five(userObj);
			break;
		case 4:
			userObj = four(userObj);
			break;
		case 3:
			userObj = three(userObj);
			break;
		case 2:
			userObj = two(userObj);
			break;
		// Default is 10
		default:
			userObj = one(userObj);
			break;
		}

		return userObj;

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

	// Methods for the Tens

	public static ArabicNumber ninety(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 90);
		userObj.setAddToAnswer("XC");
		return userObj;
	}

	public static ArabicNumber eighty(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 80);
		userObj.setAddToAnswer("LXXX");
		return userObj;
	}

	public static ArabicNumber seventy(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 70);
		userObj.setAddToAnswer("LXX");
		return userObj;
	}

	public static ArabicNumber sixty(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 60);
		userObj.setAddToAnswer("LX");
		return userObj;
	}

	public static ArabicNumber fifty(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 50);
		userObj.setAddToAnswer("L");
		return userObj;
	}

	public static ArabicNumber forty(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 40);
		userObj.setAddToAnswer("XL");
		return userObj;
	}

	public static ArabicNumber thirty(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 30);
		userObj.setAddToAnswer("XXX");
		return userObj;
	}

	public static ArabicNumber twenty(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 20);
		userObj.setAddToAnswer("XX");
		return userObj;
	}

	public static ArabicNumber ten(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 10);
		userObj.setAddToAnswer("X");
		return userObj;
	}

	// Methods for the Ones

	public static ArabicNumber nine(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 9);
		userObj.setAddToAnswer("IX");
		return userObj;
	}

	public static ArabicNumber eight(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 8);
		userObj.setAddToAnswer("VIII");
		return userObj;
	}

	public static ArabicNumber seven(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 7);
		userObj.setAddToAnswer("VII");
		return userObj;
	}

	public static ArabicNumber six(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 6);
		userObj.setAddToAnswer("VI");
		return userObj;
	}

	public static ArabicNumber five(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 5);
		userObj.setAddToAnswer("V");
		return userObj;
	}

	public static ArabicNumber four(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 4);
		userObj.setAddToAnswer("IV");
		return userObj;
	}

	public static ArabicNumber three(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 3);
		userObj.setAddToAnswer("III");
		return userObj;
	}

	public static ArabicNumber two(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 2);
		userObj.setAddToAnswer("II");
		return userObj;
	}

	public static ArabicNumber one(ArabicNumber userObj) {
		userObj.setNewUserNumber(userObj.getNewUserNumber() - 1);
		userObj.setAddToAnswer("I");
		return userObj;
	}
}
