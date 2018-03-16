/**
*    Problem: Combinations Counting
*    Url: http://www.codeabbey.com/index/task_view/combinations-counting
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.Scanner;
import java.math.BigInteger;

public class CombinationsCounting {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            BigInteger result = differentCombinations(reader.nextInt(), reader.nextInt());

            System.out.printf("%d ", result);
        }
        
        reader.close();
    }

    public static BigInteger differentCombinations (int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }

    public static BigInteger factorial (int n) {
        BigInteger ret = BigInteger.ONE;
        
        for (int i = 1; i <= n; ++i) {
        	ret = ret.multiply(BigInteger.valueOf(i));
        }

        return ret;
    }
}