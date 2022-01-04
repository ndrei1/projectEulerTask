package projecteuler;

public class ProblemOne {
//    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//    The sum of these multiples is 23.
//    Find the sum of all the multiples of 3 or 5 below 1000.

    public static int calculate(int maxValue, int a, int b) {
        return formula(maxValue-- / a,a)
                +  formula(maxValue / b,b)
                -  formula(maxValue / (a * b),a * b);
    }

    private static int formula(int a, int b) {
        return a * (b + (a * b)) / 2;
    }
}
