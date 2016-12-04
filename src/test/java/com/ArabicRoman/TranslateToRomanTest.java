package test.java.com.ArabicRoman;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.ArabicRoman.ArabicNumber;
import main.java.com.ArabicRoman.TranslateToRoman;

public class TranslateToRomanTest {
	
	@Test
	public void oneThousand() {
		ArabicNumber testUserObj = new ArabicNumber(1000);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("M", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void twoThousand() {
		ArabicNumber testUserObj = new ArabicNumber(2000);
		
		assertEquals(1000, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("M", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void nineHundred() {
		ArabicNumber testUserObj = new ArabicNumber(900);
		
		assertEquals(0, TranslateToRoman.nineHundred(testUserObj).getNewUserNumber());
		assertEquals("CM", TranslateToRoman.nineHundred(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void fiveHundred() {
		ArabicNumber testUserObj = new ArabicNumber(500);
		
		assertEquals(0, TranslateToRoman.fiveHundred(testUserObj).getNewUserNumber());
		assertEquals("D", TranslateToRoman.fiveHundred(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void oneHundred() {
		ArabicNumber testUserObj = new ArabicNumber(100);
		
		assertEquals(0, TranslateToRoman.oneHundred(testUserObj).getNewUserNumber());
		assertEquals("C", TranslateToRoman.oneHundred(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void ninety() {
		ArabicNumber testUserObj = new ArabicNumber(90);
		
		assertEquals(0, TranslateToRoman.ninety(testUserObj).getNewUserNumber());
		assertEquals("XC", TranslateToRoman.ninety(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void fifty() {
		ArabicNumber testUserObj = new ArabicNumber(50);
		
		assertEquals(0, TranslateToRoman.fifty(testUserObj).getNewUserNumber());
		assertEquals("L", TranslateToRoman.fifty(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void ten() {
		ArabicNumber testUserObj = new ArabicNumber(10);
		
		assertEquals(0, TranslateToRoman.ten(testUserObj).getNewUserNumber());
		assertEquals("X", TranslateToRoman.ten(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void nine() {
		ArabicNumber testUserObj = new ArabicNumber(9);
		
		assertEquals(0, TranslateToRoman.nine(testUserObj).getNewUserNumber());
		assertEquals("IX", TranslateToRoman.nine(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void five() {
		ArabicNumber testUserObj = new ArabicNumber(5);
		
		assertEquals(0, TranslateToRoman.five(testUserObj).getNewUserNumber());
		assertEquals("V", TranslateToRoman.five(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void three() {
		ArabicNumber testUserObj = new ArabicNumber(3);
		
		assertEquals(0, TranslateToRoman.three(testUserObj).getNewUserNumber());
		assertEquals("III", TranslateToRoman.three(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void one() {
		ArabicNumber testUserObj = new ArabicNumber(1);
		
		assertEquals(0, TranslateToRoman.one(testUserObj).getNewUserNumber());
		assertEquals("I", TranslateToRoman.one(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void oneThousandSixtySix() {
		ArabicNumber testUserObj = new ArabicNumber(1066);
		
		assertEquals(66, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("M", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void oneThousandEightyNine() {
		ArabicNumber testUserObj = new ArabicNumber(1989);
		
		assertEquals(989, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("M", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
//	@Test
//	public void test() {
//	}
}
