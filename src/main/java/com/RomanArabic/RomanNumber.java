/**
 * 
 */
package main.java.com.RomanArabic;

import java.util.ArrayList;

/**
 * @author Erin
 *
 */
public class RomanNumber {

	private int addToAnswer = 0;
	private int answer = 0;
	private String originalUserNum = null;
	private String newUserNum = null;
	ArrayList<Character> userInputAList = new ArrayList<>();

	public RomanNumber() {
		super();
	}

	public RomanNumber(String originalUserNum) {
		this.originalUserNum = originalUserNum;
		
		for (int i = 0; i < originalUserNum.length(); i++) {
			this.userInputAList.add(originalUserNum.charAt(i));
		}
	}

	public int getAddToAnswer() {
		return addToAnswer;
	}

	public void setAddToAnswer(int addToAnswer) {
		this.addToAnswer = addToAnswer;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String getOriginalUserNum() {
		return originalUserNum;
	}

	public void setOriginalUserNum(String originalUserNum) {
		this.originalUserNum = originalUserNum;
	}

	public String getNewUserNum() {
		return newUserNum;
	}

	public void setNewUserNum(String newUserNum) {
		this.newUserNum = newUserNum;
	}

	public ArrayList<Character> getUserInputAList() {
		return userInputAList;
	}

	public void setUserInputAList(ArrayList<Character> userInputAList) {
		this.userInputAList = userInputAList;
	}

	
	
}
