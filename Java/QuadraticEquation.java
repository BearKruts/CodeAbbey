/**
*    Problem: Quadratic Equation
*    Url: http://www.codeabbey.com/index/task_view/quadratic-equation
*    Autor: Mykhailo Kruts
*    Date: 20 March 2018
*/

import java.util.Scanner;

public class QuadraticEquation {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int a = reader.nextInt(); 
            int b = reader.nextInt(); 
            int c = reader.nextInt();
            int d = (int) Math.pow(b, 2) - 4 * a * c;
            String x1;
            String x2;

            if (d >= 0) {
                x1 = (int) (-b + Math.sqrt(d)) / (2 * a) + "";
                x2 = (int) (-b - Math.sqrt(d)) / (2 * a) + "";
            } else {
                d = (int) Math.sqrt(-d);
                x1 = -b / (2 * a) + "+" + d / (2 * a) + "i";
                x2 = -b / (2 * a) + "-" + d / (2 * a) + "i";
            }

            System.out.printf("%s %s; ", x1, x2);
        }
        
        reader.close();
    }
}