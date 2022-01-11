package projecteuler;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static projecteuler.ProblemNine.calculate;
import static projecteuler.ProblemNine.pythagoreanTriplet;

public class ProblemNineTest {

    @Test
    public void calculate1000() {
        assertEquals(31875000, calculate(1000));
    }

    @Test
    public void calculate60() {
        assertEquals(60, calculate(12));
    }

    @Test
    public void calculate1() {
        assertEquals(-1, calculate(1));
    }

    @Test
    public void calculate0() {
        assertEquals(-1, calculate(0));
    }

    @Test
    public void pythagoreanTriplet3and4and5() {
        assertEquals(Arrays.toString(new int[]{3, 4, 5}), Arrays.toString(pythagoreanTriplet(12)));
    }

    @Test
    public void pythagoreanTriplet8and15and17() {
        assertEquals(Arrays.toString(new int[]{8, 15, 17}), Arrays.toString(pythagoreanTriplet(40)));
    }
}
