/**
*    Problem: Weighted sum of digits
*    URL: http://www.codeabbey.com/index/task_view/weighted-sum-of-digits
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class WeightedSumOfDigits {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            int result = weightedSumOfDigits(reader.nextInt());

            System.out.printf("%d ", result);
        }

        reader.close();
    }

    public static int weightedSumOfDigits (int num) {
        int wsd = 0;
        int i = 0;
        String tmp = num + "";

        for (char el : tmp.toCharArray()) {
            i++;
            wsd += Character.getNumericValue(el) * i;
        }

        return wsd;
    }
}