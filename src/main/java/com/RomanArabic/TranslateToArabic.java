package main.java.com.RomanArabic;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.ArabicRoman.ArabicNumber;

public class TranslateToArabic {

	// ADD VALIDATION
	public static void toArabic() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		char firstLetter;
		String userRomanInput;
		StringBuilder arabicAsStringBuilder = new StringBuilder();
		ArrayList<Character> userInputAList = new ArrayList<>();

		System.out.println("Please enter the number to be converted.");
		RomanNumber userObj = new RomanNumber(userRomanInput = sc.nextLine().toLowerCase());

		while (userObj.getUserInputAList() != null) {

			firstLetter = userObj.userInputAList.get(0);

			switch (firstLetter) {
			case 'm':
				userObj = thousands(userObj);
				break;

			case 'd':
				userObj = fiveHundred(userObj);
				break;

			case 'c':
				userObj = oneHundred(userObj);
				break;

			case 'l':
				userObj = fifty(userObj);
				break;

			case 'x':
				userObj = ten(userObj);
				break;

			case 'v':
				userObj = five(userObj);
				break;

			case 'i':
				userObj = one(userObj);
				break;

			default:
				System.out.println("It looks like you've included a novalid character"
						+ "Please limit your translations to MDCLXVI");
				userObj.userInputAList.clear();
				break;
			}

			// arabicAsStringBuilder.append(userObj.getAddToAnswer());
			// userRomanInput = Integer.toString(userObj.getNewUserNumber());
			// lengthOfUserNumber = userRomanInput.length();

		}
		System.out.println(arabicAsStringBuilder);

	} // toArabic

	// Remove left most 'M' and add 1000 to answer value
	public static RomanNumber thousands(RomanNumber userObj) {
		userObj.setAnswer(userObj.getAnswer() + 1000);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// remove left most D and add value
	public static RomanNumber fiveHundred(RomanNumber userObj) {
		userObj.setAnswer(userObj.getAnswer() + 500);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	public static RomanNumber oneHundred(RomanNumber userObj) {

		char secondLetter = userObj.userInputAList.get(1);

		switch (secondLetter) {
		case 'm':
			userObj = nineHundred(userObj);
			break;
		case 'd':
			userObj = fourHundred(userObj);
			break;
		default:
			userObj.setAnswer(userObj.getAnswer() + 100);
			userObj.getUserInputAList().remove(0);
			break;
			return userObj;
		}

		return userObj;
	}

	// nineHundred
	// fourHundred

	// remove left most L and add 50
	public static RomanNumber fifty(RomanNumber userObj) {
		userObj.setAnswer(userObj.getAnswer() + 50);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// Check for 90 & 40, else 10
	public static RomanNumber ten(RomanNumber userObj) {

		char secondLetter = userObj.userInputAList.get(1);

		switch (secondLetter) {
		case 'c':
			userObj = ninety(userObj);
			break;
		case 'l':
			userObj = fourty(userObj);
			break;
		default:
			userObj.setAnswer(userObj.getAnswer() + 10);
			userObj.getUserInputAList().remove(0);
			break;
			return userObj;
		}

		return userObj;
	}

	// ninety
	// forty

}// class
