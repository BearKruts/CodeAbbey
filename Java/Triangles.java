/**
*    Problem: Triangles
*    URL: http://www.codeabbey.com/index/task_view/triangles
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class Triangles {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int result = isTriangles(reader.nextInt(), reader.nextInt(), reader.nextInt());

            System.out.printf("%d ", result);
        }

        reader.close();
    }

    public static int isTriangles (int a, int b, int c) {
        return ((a + b > c) && (a + c > b) && (b + c > a)) ? 1 : 0;
    }
}