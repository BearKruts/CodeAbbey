/**
*    Problem: Prime Numbers Generation
*    URL: http://www.codeabbey.com/index/task_view/prime-numbers-generation
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersGeneration {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();
        ArrayList<Integer> primes = getPrimesList(3000000);

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            System.out.printf("%d ", primes.get(reader.nextInt() - 1));
        }

        reader.close();
    }

    public static ArrayList<Integer> getPrimesList (int numberTo) {
        final boolean[] nonPrime = new boolean[numberTo + 1];

        for (int i = 2; i <= Math.sqrt(numberTo); ++i) {
            if (!nonPrime[i]) {
                for (int j = i * 2; j <= numberTo; j += i) {
                    nonPrime[j] = true;
                }
            }
        }

        final ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= numberTo; ++i) {
            if (!nonPrime[i]) primes.add(i);
        }

        return primes;
    }
}