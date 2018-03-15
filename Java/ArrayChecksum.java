/**
*    Problem: Array Checksum
*    URL: http://www.codeabbey.com/index/task_view/array-checksum
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class ArrayChecksum {
    public static void main (String[] args) {
    	Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();
        final int SEED = 113;
        final int LIMIT = 10000007;
        long arrayChecksum = 0;

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            arrayChecksum += reader.nextLong();
            arrayChecksum *= SEED;
            if (i > 2) arrayChecksum %= LIMIT;
        }

        System.out.printf("%d ", arrayChecksum);
        reader.close();
    }
}