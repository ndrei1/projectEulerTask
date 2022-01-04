package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static projecteuler.ProblemFour.calculate;
import static projecteuler.ProblemFour.isPalindrome;

public class ProblemFourTest {
    @Test
    public void calculate0() {
        assertEquals(0, calculate(1, 0));
    }

    @Test
    public void calculate1() {
        assertEquals(0, calculate(1, 1));
    }

    @Test
    public void calculate100() {
        assertEquals(9009, calculate(100, 1));
    }

    @Test
    public void calculate1000() {
        assertEquals(906609, calculate(1000, 2));
    }

    @Test
    public void calculate10000() {
        assertEquals(99000099, calculate(10000, 3));
    }

    @Test
    public void isPalindrome10001() {
        assertTrue(isPalindrome(10001));
    }

    @Test
    public void isPalindrome11() {
        assertTrue(isPalindrome(11));
    }

    @Test
    public void isPalindrome1() {
        assertTrue(isPalindrome(1));
    }

    @Test
    public void isPalindrome2332() {
        assertTrue(isPalindrome(1));
    }
}
