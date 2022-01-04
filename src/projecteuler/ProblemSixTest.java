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

    @Test
    public void calculateOld1000() {
        assertEquals(1058313332, calculateOld(1000));
    }

    @Test
    public void squareOfTheSum2 () {
        assertEquals(9, squareOfTheSum(2));
    }

    @Test
    public void sumOfTheSquare2 () {
        assertEquals(5, sumOfTheSquare(2));
    }

    @Test
    public void squareOfTheSum9 () {
        assertEquals(2025, squareOfTheSum(9));
    }

    @Test
    public void sumOfTheSquare9 () {
        assertEquals(285, sumOfTheSquare(9));
    }

    @Test
    public void squareOfTheSum100 () {
        assertEquals(25502500, squareOfTheSum(100));
    }

    @Test
    public void sumOfTheSquare100 () {
        assertEquals(338350, sumOfTheSquare(100));
    }

    @Test
    public void findExpIn164() {
        assertNotEquals(calculate(164), calculateOld(164));
    }

}
