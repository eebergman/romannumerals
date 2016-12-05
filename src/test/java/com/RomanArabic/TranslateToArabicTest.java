package test.java.com.RomanArabic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.com.RomanArabic.RomanNumber;
import main.java.com.RomanArabic.TranslateToArabic;

public class TranslateToArabicTest {

	@Test
	public void oneThousand() {
		RomanNumber testUserObj = new RomanNumber("M");

		assertEquals(1000, TranslateToArabic.thousands(testUserObj).getAnswer());
	}

	@Test
	public void twoThousand() {
		RomanNumber testUserObj = new RomanNumber("MM");

		assertEquals(2000, TranslateToArabic.thousands(testUserObj).getAnswer());
	}

	@Test
	public void nineHundred() {
		RomanNumber testUserObj = new RomanNumber("CM");

		assertEquals(900, TranslateToArabic.thousands(testUserObj).getAnswer());
	}

	@Test
	public void fiveHundred() {
		RomanNumber testUserObj = new RomanNumber("D");

		assertEquals(0, TranslateToArabic.fiveHundred(testUserObj).getAddToAnswer());
	}

	@Test
	public void oneHundred() {
		RomanNumber testUserObj = new RomanNumber(100);

		assertEquals(0, TranslateToArabic.oneHundred(testUserObj).getAddToAnswer());
	}

	@Test
	public void ninety() {
		RomanNumber testUserObj = new RomanNumber(90);

		assertEquals(0, TranslateToArabic.ninety(testUserObj).getAddToAnswer());
	}

	@Test
	public void fifty() {
		RomanNumber testUserObj = new RomanNumber(50);

		assertEquals(0, TranslateToArabic.fifty(testUserObj).getAddToAnswer());
	}

	@Test
	public void ten() {
		RomanNumber testUserObj = new RomanNumber(10);

		assertEquals(0, TranslateToArabic.ten(testUserObj).getAddToAnswer());
	}

	@Test
	public void nine() {
		RomanNumber testUserObj = new RomanNumber(9);

		assertEquals(0, TranslateToArabic.nine(testUserObj).getAddToAnswer());
	}

	@Test
	public void five() {
		RomanNumber testUserObj = new RomanNumber(5);

		assertEquals(0, TranslateToArabic.five(testUserObj).getAddToAnswer());
	}

	@Test
	public void three() {
		RomanNumber testUserObj = new RomanNumber(3);

		assertEquals(0, TranslateToArabic.three(testUserObj).getAddToAnswer());
	}

	@Test
	public void one() {
		RomanNumber testUserObj = new RomanNumber(1);

		assertEquals(0, TranslateToArabic.one(testUserObj).getAddToAnswer());
	}

	@Test
	public void oneThousandSixtySix() {
		RomanNumber testUserObj = new RomanNumber(1066);

		assertEquals(66, TranslateToArabic.mille(testUserObj).getAnswer());
	}

	@Test
	public void oneThousandEightyNine() {
		RomanNumber testUserObj = new RomanNumber(1989);

		assertEquals(989, TranslateToArabic.mille(testUserObj).getAnswer());
	}

}
