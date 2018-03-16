/**
*    Problem: Linear Function
*    URL: http://www.codeabbey.com/index/task_view/linear-function
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.Scanner;

public class LinearFunction {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            int c = reader.nextInt();
            int d = reader.nextInt();
            int x = getSlope(a, b, c, d);
            int y = getIntercept (a, b, x);
            
            System.out.printf("(%d %d) ", x, y);
        }
        
        reader.close();
    }

    public static int getSlope (int a, int b, int c, int d) {
        return (d - b) / (c - a);
    }

    public static int getIntercept (int a, int b, int x) {
        return (b - x * a);
    }
}