/**
*    Problem: Bit Count
*    URL: http://www.codeabbey.com/index/task_view/bit-count
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.Scanner;

public class BitCount {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            String convert = Integer.toBinaryString(reader.nextInt());
            int count = 0;

            for(char el : convert.toCharArray()){
                if (Character.getNumericValue(el) == 1) count++;
            }

            System.out.printf("%d ", count);
        }

        reader.close();
    }
}