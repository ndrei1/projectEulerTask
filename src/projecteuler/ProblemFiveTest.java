package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static projecteuler.ProblemFive.calculate;

public class ProblemFiveTest {
    @Test
    public void calculate1to20() {
        assertEquals(232792560, calculate());
    }
}
