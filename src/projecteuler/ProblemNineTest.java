package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static projecteuler.ProblemNine.calculate;

public class ProblemNineTest {

    @Test
    public void calculate1000() {
        assertEquals(31875000, calculate(1000));
    }

    @Test
    public void calculate2000() {
        assertEquals(123750000, calculate(2000));
    }

    @Test
    public void calculate1() {
        assertEquals(-1, calculate(1));
    }

    @Test
    public void calculate0() {
        assertEquals(-1, calculate(0));
    }

}
