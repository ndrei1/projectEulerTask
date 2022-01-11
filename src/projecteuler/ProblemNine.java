package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class ProblemNine {

//    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//    a2 + b2 = c2
//    For example, 32 + 42 = 9 + 16 = 25 = 52.
//    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//    Find the product abc.

    public static int calculate(double lastNumber) {
        for (int a = 3; a <= lastNumber; a++) {
            for (int b = a + 1; b < lastNumber; b++) {
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                if (a + b + c == lastNumber) {
                    return (int) (a * b * c);
                }
            }
        }
        return -1;
    }

    public static int[] pythagoreanTriplet(double lastNumber) {
        int[] result = new int[3];
        for (int a = 3; a <= lastNumber; a++) {
            for (int b = a + 1; b < lastNumber; b++) {
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                if (a + b + c == lastNumber) {
                    result[0] = a;
                    result[1] = b;
                    result[2] = (int) c;
                    break;
                }
            }
        }
        return result;
    }

    public static List<int[]> pythagoreanTripletGenerate(int quantityOfTriplet) {
        List<int[]> allPythagoreanTriplet = new ArrayList<>();
        int c = 5;
        while (quantityOfTriplet > 0) {
            for (int a = 3; a <= c; a++) {
                for (int b = a + 1; b < c; b++) {
                    if ((Math.pow(a, 2) + Math.pow(b, 2)) / Math.pow(c, 2) == 1) {
                        quantityOfTriplet--;
                        allPythagoreanTriplet.add(new int[]{a, b, c});
                    }
                }
            }
            c++;
        }
        return allPythagoreanTriplet;
    }

    public static int[] filter(List<int[]> allPythagoreanTriplet, int filter) {
        for (int[] triplet : allPythagoreanTriplet) {
            if (triplet[0] + triplet[1] + triplet[2] == filter) {
                return triplet;
            }
        }
        return new int[]{0, 0, 0};
    }
}
