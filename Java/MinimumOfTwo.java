/**
*	Problem: Minimum of Two
*	URL: http://www.codeabbey.com/index/task_view/min-of-two
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Scanner;

public class MinimumOfTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int minOfTwoNumbers = Math.min(reader.nextInt(), reader.nextInt());

            System.out.printf("%d ", minOfTwoNumbers);
        }
        
        reader.close();
    }
}