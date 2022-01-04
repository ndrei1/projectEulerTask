package projecteuler;

public class ProblemFour {

//    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
//    is 9009 = 91 × 99.
//    Find the largest palindrome made from the product of two 3-digit numbers.


    public static int calculate(int last, int degree) {
        int result = 0;
        for (int i = (int) Math.pow(10, degree); i < last; i++) {
            for (int j = (int) Math.pow(10, degree); j < last; j++) {
                int number = i * j;
                if (isPalindrome(number) && number > result)
                    result = number;
            }
        }
        return result;
    }

    public static boolean isPalindrome(int number) {
        int a = 0;
        int b = number;
        while (b > 0) {
            a = a * 10 + b % 10;
            b /= 10;
        }
        return number == a;
    }
}
