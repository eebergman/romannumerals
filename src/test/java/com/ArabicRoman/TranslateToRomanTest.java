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
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("CM", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void fiveHundred() {
		ArabicNumber testUserObj = new ArabicNumber(500);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("D", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void oneHundred() {
		ArabicNumber testUserObj = new ArabicNumber(100);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("C", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void ninty() {
		ArabicNumber testUserObj = new ArabicNumber(90);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("XC", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void fifty() {
		ArabicNumber testUserObj = new ArabicNumber(50);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("L", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void ten() {
		ArabicNumber testUserObj = new ArabicNumber(10);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("X", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void nine() {
		ArabicNumber testUserObj = new ArabicNumber(9);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("IX", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void five() {
		ArabicNumber testUserObj = new ArabicNumber(5);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("V", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void three() {
		ArabicNumber testUserObj = new ArabicNumber(3);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("III", TranslateToRoman.mille(testUserObj).getAddToAnswer());
	}
	
	@Test
	public void one() {
		ArabicNumber testUserObj = new ArabicNumber(1);
		
		assertEquals(0, TranslateToRoman.mille(testUserObj).getNewUserNumber());
		assertEquals("I", TranslateToRoman.mille(testUserObj).getAddToAnswer());
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
	
	@Test
	public void test() {
		
	}
}
