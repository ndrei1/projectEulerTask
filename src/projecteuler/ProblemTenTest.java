package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static projecteuler.ProblemTen.calculate;

public class ProblemTenTest {

    @Test
    public void calculateTwoMillion() {
        assertEquals(142913828922L, calculate(2000000));
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
    public void calculate5() {
        assertEquals(5, calculate(5));
    }

    @Test
    public void calculate10() {
        assertEquals(17, calculate(10));
    }

    @Test
    public void calculate2() {
        assertEquals(2, calculate(2));
    }

    @Test
    public void calculate1999() {
        assertEquals(275051, calculate(1999));
    }

}
