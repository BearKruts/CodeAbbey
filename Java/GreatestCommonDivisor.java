/**
*    Problem: Greatest Common Divisor
*    URL: http://www.codeabbey.com/index/task_view/greatest-common-divisor
*    Autor: Mykhailo Kruts
*    Date: 13 March 2018
*/

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int numberOne = reader.nextInt();
            int numberTwo = reader.nextInt();
            int gcd = greatestCommonDivisor(numberOne, numberTwo);
            int lcd = leastCommonMultiple(numberOne, numberTwo);

            System.out.printf("(%d %d) ", gcd, lcd);
        }

        reader.close();
    }

    public static int greatestCommonDivisor (int numberOne, int numberTwo) {
        int numberTemp;

        while (numberTwo != 0) {
            numberTemp = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = numberTemp;
        }
        
        return numberOne;
    }

    public static int leastCommonMultiple (int numberOne, int numberTwo) {
        return (numberOne * numberTwo / greatestCommonDivisor(numberOne, numberTwo));
    }
}