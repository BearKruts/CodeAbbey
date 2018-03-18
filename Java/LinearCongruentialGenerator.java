/**
*    Problem: Linear Congruential Generator
*    Url: http://www.codeabbey.com/index/task_view/linear-congruential-generator
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class LinearCongruentialGenerator {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int xNext = linearCongruentialGenerator(reader.nextInt(), reader.nextInt(), reader.nextInt(), reader.nextInt(), reader.nextInt());

            System.out.printf("%d ", xNext);
        }
        
        reader.close();
    }

    public static int linearCongruentialGenerator (int a, int c, int m, int x, int n) {
        for (int i = 0; i < n; i++){
            x = (a * x + c) % m;
        }

        return x;
    }
}