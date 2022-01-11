package projecteuler;

public class ProblemThree {
//    The prime factors of 13195 are 5, 7, 13 and 29.
//    What is the largest prime factor of the number 600851475143 ?
       public static long calculate(long maxValue) {
        long a = maxValue;
        long result = 0;
        for (long i = 1; i <= a; i++) {
            if (a % i == 0) {
                result = i;
                a = a / i;
            }
        }
        return result;
    }

    public static long calculateOld(long maxValue) {
        long a = maxValue;
        long result = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                result = i;
                a = a / i;
            }
        }
        return result;
    }

}
