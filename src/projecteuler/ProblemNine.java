package projecteuler;

public class ProblemNine {

    public static int calculate(double lastNumber) {
        for (int a = 2; a <= (lastNumber / 3 - 1); a++) {
            double b = (lastNumber - (500 * lastNumber / (lastNumber - a)));
            if (b == (int) b) {
                return (int) (a * b * (lastNumber - a - b));
            }
        }
        return -1;
    }
}
