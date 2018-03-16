/**
*    Problem: Binary Search
*    Url: http://www.codeabbey.com/index/task_view/binary-search
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.Locale;
import java.util.Scanner;

public class BinarySearch {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            double result = binarySearch(reader.nextDouble(), reader.nextDouble(), reader.nextDouble(), reader.nextDouble());

            System.out.printf("%s ", result);
        }

        reader.close();
    }

    public static double binarySearch (double a, double b, double c, double d) {
        boolean isSolved = false;
        double x = 0;
        double min = 0;
        double max = 100;

        while (!(isSolved)) {
            x = (max + min) / 2;
            double result = (a * x) + (b * Math.sqrt(Math.pow(x, 3))) - (c * Math.exp((-x) / 50)) - d;

            if (Math.abs(result) < 1E-7) {
                isSolved = true;
            } else if ((Math.abs(result) > 1E-7) && (result < 0)) {
                min = x;
            } else if ((Math.abs(result) > 1E-7) && (result > 0)) {
                max = x;
            } 
        }

        return x;
    }
}