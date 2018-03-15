/**
*    Problem: Fibonacci Sequence
*    URL: http://www.codeabbey.com/index/task_view/fibonacci-sequence
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_LINES = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_LINES; i++) {
            int result = indexFibonacci(new BigDecimal(reader.next()));
            
            System.out.printf("%d ", result);
        }

        reader.close();
    }

    public static int indexFibonacci (BigDecimal number) {
        int indexFibonacci;

        number = number.multiply(new BigDecimal("5")).add(new BigDecimal("0.5"));
        indexFibonacci = (int) (Math.log(number.doubleValue()) / Math.log(1.61803398875)) - 1;
        indexFibonacci = (indexFibonacci < 0) ? 0 : indexFibonacci;
        
        return indexFibonacci;
    }
}