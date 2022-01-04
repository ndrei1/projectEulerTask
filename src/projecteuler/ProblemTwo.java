package projecteuler;

public class ProblemTwo {
/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2,
the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.
*/

    public static int calculate(int maxValue) {
        int a = 1;
        int b = 1;
        int result = 0;
        while (a < maxValue) {
            result += filter(a);
            a = b + a;
            b = a - b;
        }
        return result;
    }

    public static int filter(int a) {
        if (a % 2 == 0) {
            return a;
        }
        return 0;
    }
}