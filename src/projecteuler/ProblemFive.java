package projecteuler;

public class ProblemFive {

//    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//    What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20?

    public static int calculate() {
        int result = 0;
        while (true) {
            result++;
            if (isSmallest(result)) {
                return result;
            }
        }
    }

    private static boolean isSmallest(int number) {
        for (int i = 11; i < 20; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
