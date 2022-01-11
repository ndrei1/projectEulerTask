package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static projecteuler.ProblemSix.*;

public class ProblemSixTest {

    @Test
    public void calculate100() {assertEquals(25164150, calculate(100));}

    @Test
    public void calculate1() {
        assertEquals(0, calculate(1));
    }

    @Test
    public void calculate0() {
        assertEquals(0, calculate(0));
    }

    @Test
    public void calculate50() {
        assertEquals(1582700, calculate(50));
    }

    @Test
    public void calculate10() {
        assertEquals(2640, calculate(10));
    }

    @Test
    public void calculate1000() {
        assertNotEquals(1058313332, calculate(1000));
    }
}
