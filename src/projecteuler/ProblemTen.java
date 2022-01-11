package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemTen {
//    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//    Find the sum of all the primes below two million.

    public static boolean[] isPrime(int max) {
        boolean[] prime = new boolean[max];
        Arrays.fill(prime, true);
        for (int i = 2; i * i < max; i++) {
            for (int j = 2 * i; j < max; j += i) {
                prime[j] = false;
            }
        }
        return prime;
    }

    public static long calculate(int max) {
        List<Long> integers = new ArrayList<>();
        if (max == 2) {
            return 2;
        }
        boolean[] prime = isPrime(max);
        for (int i = 2; i < max; i++) {
            if (prime[i]) {
                integers.add((long) i);
            }
        }
        return integers.stream().reduce(0L, Long::sum);
    }


}

