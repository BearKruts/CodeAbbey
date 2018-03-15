/**
*    Problem: Array Counters
*    URL: http://www.codeabbey.com/index/task_view/array-counters
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class ArrayCounters {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();
        int[] numberOfDigits = new int[reader.nextInt()];

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            numberOfDigits[reader.nextInt() - 1] += 1;
        }

        for (int el : numberOfDigits) {
            System.out.printf("%d ", el);
        }

        reader.close();
    }
}