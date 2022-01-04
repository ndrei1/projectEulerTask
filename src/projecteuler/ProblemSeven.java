package projecteuler;

public class ProblemSeven {

//    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//    What is the 10 001st prime number?


    public static int calculate(int numberOfPrimes) {
        if (numberOfPrimes == 1) {
            return 2;
        }
        if (numberOfPrimes == 0) {
            return 0;
        }
        int counter = 2;
        int currentNumber = 3;
        while (counter != numberOfPrimes) {
            currentNumber += 2;
            if (isPrime(currentNumber)) {
                counter++;
            }
        }
        return currentNumber;
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
