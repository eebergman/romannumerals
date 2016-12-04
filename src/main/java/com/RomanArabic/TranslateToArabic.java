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
			
			
			userObj.setUserInputAList(null);
			
			

//				switch (firstLetter) {
//				case 4:
//					userObj = thousands(userObj);
//					break;
//
//				case 3:
//					userObj = hundreds(userObj);
//					break;
//
//				case 2:
//					userObj = tens(userObj);
//					break;
//
//				case 1:
//					userObj = ones(userObj);
//					break;
//
//				default:
//					break;
//				}

//				arabicAsStringBuilder.append(userObj.getAddToAnswer());
//				userRomanInput = Integer.toString(userObj.getNewUserNumber());
//				lengthOfUserNumber = userRomanInput.length();
				
		}
		System.out.println(arabicAsStringBuilder);

	} // toArabic

}
