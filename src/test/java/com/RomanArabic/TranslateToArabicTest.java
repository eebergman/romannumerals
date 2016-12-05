package test.java.com.RomanArabic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.com.RomanArabic.RomanNumber;
import main.java.com.RomanArabic.TranslateToArabic;

public class TranslateToArabicTest {

	@Test
	public void oneThousand() {
		RomanNumber testUserObj = new RomanNumber("m");

		assertEquals(1000, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void twoThousand() {
		RomanNumber testUserObj = new RomanNumber("mm");

		assertEquals(2000, TranslateToArabic.theFirstLetter(testUserObj).getAnswer());
	}

	@Test
	public void fiveHundred() {
		RomanNumber testUserObj = new RomanNumber("d");

		assertEquals(500, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void nineHundred() {
		RomanNumber testUserObj = new RomanNumber("cm");

		assertEquals(900, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void fourHundred() {
		RomanNumber testUserObj = new RomanNumber("cd");

		assertEquals(400, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void oneHundred() {
		RomanNumber testUserObj = new RomanNumber("c");

		assertEquals(100, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void fifty() {
		RomanNumber testUserObj = new RomanNumber("l");

		assertEquals(50, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void ninety() {
		RomanNumber testUserObj = new RomanNumber("xc");

		assertEquals(90, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void forty() {
		RomanNumber testUserObj = new RomanNumber("il");

		assertEquals(40, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void ten() {
		RomanNumber testUserObj = new RomanNumber("x");

		assertEquals(10, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void five() {
		RomanNumber testUserObj = new RomanNumber("v");

		assertEquals(5, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void nine() {
		RomanNumber testUserObj = new RomanNumber("ix");

		assertEquals(9, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void four() {
		RomanNumber testUserObj = new RomanNumber("iv");

		assertEquals(4, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

	@Test
	public void one() {
		RomanNumber testUserObj = new RomanNumber("i");

		assertEquals(1, TranslateToArabic.theFirstLetter(testUserObj).getAddToAnswer());
	}

}
