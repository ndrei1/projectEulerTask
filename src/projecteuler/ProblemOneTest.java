package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static projecteuler.ProblemOne.*;

public class ProblemOneTest {
    @Test
    public void calculate1000() {
        assertEquals(233168, calculate(1000,3,5));
    }

    @Test
    public void calculate100() {
        assertEquals(2318, calculate(100,3,5));
    }

    @Test
    public void calculate3() {
        assertEquals(3, calculate(3,3,5));
    }

    @Test
    public void calculate5() {
        assertEquals(3, calculate(5,3,5));
    }
    @Test
    public void calculate6() {
        assertEquals(14, calculate(6,3,5));
    }
    @Test
    public void calculate10() {
        assertEquals(23, calculate(10,3,5));
    }

    @Test
    public void calculate0() {
        assertEquals(0, calculate(0,3,5));
    }

    @Test
    public void calculate1000with10and3() {
        assertEquals(169533, calculate(1000,3,100));
    }

}