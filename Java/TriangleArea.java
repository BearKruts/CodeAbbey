/**
*    Problem: Triangle Area
*    URL: http://www.codeabbey.com/index/task_view/triangle-area
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class TriangleArea {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            double x1 = Double.parseDouble(reader.next());
            double y1 = Double.parseDouble(reader.next());
            double x2 = Double.parseDouble(reader.next());
            double y2 = Double.parseDouble(reader.next());
            double x3 = Double.parseDouble(reader.next());
            double y3 = Double.parseDouble(reader.next());
            double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
            double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
            double p = (a + b + c) / 2.0;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            
            System.out.printf("%f ", area);
        }

        reader.close();
    }

}