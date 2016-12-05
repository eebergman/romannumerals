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

			 case 'v':
			 userObj = five(userObj);
			 break;
			
			 case 'i':
			 userObj = one(userObj);
			 break;

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

	// 1000
	public static RomanNumber thousands(RomanNumber userObj) {
		userObj.setAddToAnswer(1000);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// 500
	public static RomanNumber fiveHundred(RomanNumber userObj) {
		userObj.setAddToAnswer(500);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// 100, access 900 & 400
	public static RomanNumber oneHundred(RomanNumber userObj) {

		char secondLetter;

		if (userObj.userInputAList.size() > 1) {
			secondLetter = userObj.userInputAList.get(1);

		} else {
			secondLetter = 'a';
		}

		switch (secondLetter) {
		case 'm':
			userObj = nineHundred(userObj);
			break;
		case 'd':
			userObj = fourHundred(userObj);
			break;
		default:
			userObj.setAddToAnswer(100);
			userObj.getUserInputAList().remove(0);
			break;
		}

		return userObj;
	}

	// 900
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

	// 50
	public static RomanNumber fifty(RomanNumber userObj) {
		userObj.setAddToAnswer(50);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// 10, access 90 & 40
	public static RomanNumber ten(RomanNumber userObj) {

		char secondLetter;

		if (userObj.userInputAList.size() > 1) {
			secondLetter = userObj.userInputAList.get(1);

		} else {
			secondLetter = 'a';
		}

		switch (secondLetter) {
		case 'c':
			userObj = ninety(userObj);
			break;
		case 'l':
			userObj = forty(userObj);
			break;
		default:
			userObj.setAddToAnswer(10);
			userObj.getUserInputAList().remove(0);
			break;
		}

		return userObj;
	}

	//90
	public static RomanNumber ninety(RomanNumber userObj) {
		userObj.setAddToAnswer(90);
		userObj.getUserInputAList().remove(0);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// 40
	public static RomanNumber forty(RomanNumber userObj) {
		userObj.setAddToAnswer(40);
		userObj.getUserInputAList().remove(0);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// 5
	public static RomanNumber five(RomanNumber userObj) {
		userObj.setAddToAnswer(5);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// 1, access 9 & 4
	public static RomanNumber one(RomanNumber userObj) {

		char secondLetter;

		if (userObj.userInputAList.size() > 1) {
			secondLetter = userObj.userInputAList.get(1);

		} else {
			secondLetter = 'a';
		}

		switch (secondLetter) {
		case 'x':
			userObj = nine(userObj);
			break;
		case 'v':
			userObj = four(userObj);
			break;
		default:
			userObj.setAddToAnswer(1);
			userObj.getUserInputAList().remove(0);
			break;
		}

		return userObj;
	}

	//9
	public static RomanNumber nine(RomanNumber userObj) {
		userObj.setAddToAnswer(9);
		userObj.getUserInputAList().remove(0);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}

	// 4
	public static RomanNumber four(RomanNumber userObj) {
		userObj.setAddToAnswer(4);
		userObj.getUserInputAList().remove(0);
		userObj.getUserInputAList().remove(0);
		return userObj;
	}
	
}// class
