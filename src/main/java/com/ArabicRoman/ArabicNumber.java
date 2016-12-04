/**
 * 
 */
package main.java.com.ArabicRoman;

/**
 * @author Erin
 *
 */
public class ArabicNumber {

	private int originalUserNumber;
	private int newUserNumber;
	private String addToAnswer = null;

	public ArabicNumber() {
	}

	public ArabicNumber(int originalUserNumber) {
		this.originalUserNumber = originalUserNumber;
		this.newUserNumber = originalUserNumber;
	}

	public int getOriginalUserNumber() {
		return originalUserNumber;
	}

	public void setOriginalUserNumber(int originalUserNumber) {
		this.originalUserNumber = originalUserNumber;
	}

	public int getNewUserNumber() {
		return newUserNumber;
	}

	public void setNewUserNumber(int newUserNumber) {
		this.newUserNumber = newUserNumber;
	}

	public String getAddToAnswer() {
		return addToAnswer;
	}

	public void setAddToAnswer(String addToAnswer) {
		this.addToAnswer = addToAnswer;
	}

}
