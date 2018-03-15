/**
*    Problem: Sum of digits
*    URL: http://www.codeabbey.com/index/task_view/vowel-count
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class SumOfDigits {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int sumOfDigits = sumOfThreeDigits(reader.nextInt(), reader.nextInt(), reader.nextInt());

            System.out.printf("%d ", sumOfDigits);
        }

        reader.close();
    }

    public static int sumOfThreeDigits (int a, int b, int c) {
        int tmp = (a * b) + c;
        int sum = 0;

        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }

        return sum;
    } 
}