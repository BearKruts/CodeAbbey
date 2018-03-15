/**
*    Problem: Median of Three
*    URL: http://www.codeabbey.com/index/task_view/median-of-three
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class MedianOfThree {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int result = medianOfThree(reader.nextInt(), reader.nextInt(), reader.nextInt());
            
            System.out.printf("%d ", result);
        }

        reader.close();
    }

    public static int medianOfThree (int a, int b, int c) {
        return (a + b + c) - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
    }
}