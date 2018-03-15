/**
*    Problem: Collatz Sequence
*    URL: http://www.codeabbey.com/index/task_view/collatz-sequence
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class CollatzSequence {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            int number = reader.nextInt();
            int numberOfSteps = 0;

            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = 3 * number + 1;
                }
                numberOfSteps++;
            }
            
            System.out.printf("%d ", numberOfSteps);
        }

        reader.close();
    }
}