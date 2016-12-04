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
		ArabicNumber testUserObjTwo = new ArabicNumber(2000);
		
		assertEquals(1000, TranslateToRoman.mille(testUserObjTwo).getNewUserNumber());
		assertEquals("M", TranslateToRoman.mille(testUserObjTwo).getAddToAnswer());
	}

}
