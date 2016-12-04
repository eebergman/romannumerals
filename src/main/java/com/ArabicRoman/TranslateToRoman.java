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
	
	//ADD VALIDATION
	public static void toRoman() {	
		
		int lengthOfUserNumber;
		
		System.out.println("Please enter the number to be converted.");
		
		userNumber = Integer.parseInt(userNumberAsString = sc.nextLine());
		lengthOfUserNumber = userNumberAsString.length();

		do {
			
			switch (lengthOfUserNumber) {
			case value:
				
				break;

			default:
				break;
			}
			
			
		} while (userNumber > 0);
		
	}
	
	
	public static int mille(int number) {
		
		
		
		return number;
		
	}

}
