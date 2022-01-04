package projecteuler;

public class ProblemTen {

    public static long calculate(int lastNumber) {
        if (lastNumber <= 2) {
            if (lastNumber == 1) {
                return 0;
            }
            return lastNumber;
        }
        long sum = 2;
        for (int i = 3; i < lastNumber; i += 2) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
