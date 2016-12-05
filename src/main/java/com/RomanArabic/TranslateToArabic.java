package main.java.com.RomanArabic;

import java.util.Scanner;

public class TranslateToArabic {

	// ADD VALIDATION
	public static void toArabic() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number to be converted.");
		RomanNumber userObj = new RomanNumber(sc.nextLine().toLowerCase());

		userObj = theFirstLetter(userObj);

		System.out.println(userObj.getAnswer());

	} // toArabic

	public static RomanNumber theFirstLetter(RomanNumber userObj) {

		char firstLetter;
		while (!(userObj.userInputAList.isEmpty())) {

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

			// case 'v':
			// userObj = five(userObj);
			// break;
			//
			// case 'i':
			// userObj = one(userObj);
			// break;

			default:
				System.out.println("It looks like you've included a nonvalid character"
						+ "Please limit your translations to MDCLXVI");
				userObj.userInputAList.clear();
				break;
			}

			userObj.setAnswer(userObj.getAnswer() + userObj.getAddToAnswer());

		}
		return userObj;
	}

	// Remove left most 'M' and add 1000 to answer value
	public static RomanNumber thousands(RomanNumber userObj) {
		userObj.setAddToAnswer(1000);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// remove left most D and add 500
	public static RomanNumber fiveHundred(RomanNumber userObj) {
		userObj.setAddToAnswer(500);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// Add 900, 400, or 100
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
		}

		return userObj;
	}

	public static RomanNumber nineHundred(RomanNumber userObj) {
		userObj.setAddToAnswer(900);
		userObj.getUserInputAList().remove(0);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// 400
	public static RomanNumber fourHundred(RomanNumber userObj) {
		userObj.setAddToAnswer(400);
		userObj.getUserInputAList().remove(0);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// remove left most L and add 50
	public static RomanNumber fifty(RomanNumber userObj) {
		userObj.setAnswer(userObj.getAnswer() + 50);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// Check for 90 & 40, else 10
	public static RomanNumber ten(RomanNumber userObj) {

		char secondLetter = userObj.userInputAList.get(1);

		// switch (secondLetter) {
		// case 'c':
		// userObj = ninety(userObj);
		// break;
		// case 'l':
		// userObj = fourty(userObj);
		// break;
		// default:
		// userObj.setAnswer(userObj.getAnswer() + 10);
		// userObj.getUserInputAList().remove(0);
		// break;
		// return userObj;
		// }

		return userObj;
	}

	// ninety
	// forty

}// class
