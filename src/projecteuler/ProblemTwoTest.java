package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static projecteuler.ProblemTwo.calculate;
import static projecteuler.ProblemTwo.filter;

public class ProblemTwoTest {

    @Test
    public void calculate4613732() {
        assertEquals(4613732, calculate(4000000));
    }

    @Test
    public void calculate40() {
        assertEquals(44, calculate(50));
    }

    @Test
    public void calculate1() {
        assertEquals(0, calculate(1));
    }

    @Test
    public void calculate0() {
        assertEquals(0, calculate(0));
    }

    @Test
    public void calculate89() {
        assertEquals(44, calculate(89));
    }

    @Test
    public void filter44() {
        assertEquals(44, filter(44));
    }

    @Test
    public void filter43() {
        assertEquals(0, filter(43));
    }

    @Test
    public void filter0() {
        assertEquals(0, filter(0));
    }

    @Test
    public void filter1() {
        assertEquals(0, filter(1));
    }
}