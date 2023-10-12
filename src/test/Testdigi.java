package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.SumOfDigits;

class Testdigi {

	private SumOfDigits sumofdigits; 

	@Test
    public void testSumOfDigitsWithPositiveNumber() {
        int result = SumOfDigits.sumOfDigits(190);
        assertEquals(10, result);
    }
	@Test
    public void testSumOfDigits0() {
        int result = SumOfDigits.sumOfDigits(0);
        assertEquals(0, result);
    }

}
