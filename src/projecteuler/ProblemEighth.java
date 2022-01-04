package projecteuler;

public class ProblemEighth {

//    The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
//    Number in the test
//    Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value
//    of this product?

    public static long calculate(String bigNumber,int step) {
        char[] arrayWithNumber = bigNumber.toCharArray();
        long result = 0;
        for (int i = 0; i < bigNumber.length() - step; i++) {
            long currentNumber = 1;
            for (int j = i; j <= i + step-1; j++) {
                int a = Character.getNumericValue((arrayWithNumber[j]));
                currentNumber *= a;
            }
            if (result < currentNumber) {
                result = currentNumber;
            }
        }
        return result;
    }
}
