package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static projecteuler.ProblemThree.calculate;
import static projecteuler.ProblemThree.calculateOld;

public class ProblemThreeTest {

    @Test
    public void calculate600851475143L() {
        assertEquals(6857, calculate(600851475143L));
    }

    @Test
    public void calculate1() {
        assertEquals(1, calculate(1));
    }

    @Test
    public void calculate0() {
        assertEquals(0, calculate(0));
    }

    @Test
    public void calculate2() {
        assertEquals(2, calculate(2));
    }

    @Test
    public void calculate6() {
        assertEquals(3, calculate(6));
    }

    @Test
    public void calculate13195() {
        assertEquals(29, calculate(13195));
    }

    @Test
    public void calculate13() {
        assertEquals(13, calculate(13));
    }

    @Test
    public void calculate222() {
        assertEquals(37, calculate(222));
    }

    @Test
    public void calculate10() {
        assertEquals(5, calculate(10));
    }

    @Test
    public void calculate888() {
        assertEquals(37, calculate(888));
    }

    @Test
    public void calculateOldError() {
        assertEquals(-1, calculateOld(6008514987875112343L));
    }
}