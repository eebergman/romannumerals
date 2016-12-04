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
	private ArrayList<Character> arrayListUserNumber = new ArrayList<>();
	private ArrayList<Character> romanAnswer = new ArrayList<>();

	// ADD VALIDATION
	public static void toRoman() {

		int lengthOfUserNumber;

		System.out.println("Please enter the number to be converted.");

		userNumber = Integer.parseInt(userNumberAsString = sc.nextLine());
		lengthOfUserNumber = userNumberAsString.length();

		do {
			if (lengthOfUserNumber > 5 || lengthOfUserNumber < 1) {
				System.out.println("Invalid");

			} else {
				switch (lengthOfUserNumber) {
				case 4:
					mille();
					break;
				case 3:
					
				default:
					break;
				}
			}

		} while (userNumber > 0);

	}

	private static int mille() {
		return 0;
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
