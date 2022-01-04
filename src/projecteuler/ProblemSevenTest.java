package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static projecteuler.ProblemSeven.calculate;
import static projecteuler.ProblemSeven.isPrime;

public class ProblemSevenTest {

    @Test
    public void calculate10001() {
        assertEquals(104743, calculate(10001));
    }

    @Test
    public void calculate100() {
        assertEquals(541, calculate(100));
    }

    @Test
    public void calculate0() {
        assertEquals(0, calculate(0));
    }

    @Test
    public void calculate2() {
        assertEquals(2, calculate(1));
    }

    @Test
    public void calculate22() {
        assertEquals(79, calculate(22));
    }

    @Test
    public void calculate6() {
        assertEquals(13, calculate(6));
    }

    @Test
    public void calculate100000() {
        assertEquals(1299709, calculate(100000));
    }

    @Test
    public void isPrime2() {
        assertTrue(isPrime(2));
    }

    @Test
    public void isPrime3() {
        assertTrue(isPrime(2));
    }

    @Test
    public void isPrime13() {
        assertTrue(isPrime(2));
    }

    @Test
    public void isPrime67() {
        assertTrue(isPrime(2));
    }

    @Test
    public void isPrime1021() {
        assertTrue(isPrime(1021));
    }

}
