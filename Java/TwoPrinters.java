/**
*    Problem: Two Printers
*    Url: http://www.codeabbey.com/index/task_view/two-printers
*    Autor: Mykhailo Kruts
*    Date: 19 March 2018
*/

import java.util.Scanner;

public class TwoPrinters {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
           	int result = getPrinter(reader.nextInt(), reader.nextInt() ,reader.nextInt());

            System.out.printf("%d ", result);
        }
        
        reader.close();
    }

    public static int getPrinter (int x, int y, int n) {
    	    int xMin = (int) Math.floor(n * y / (double) (x + y));
            int xMax = (int) Math.ceil(n * y / (double) (x + y));
            int yMin = (int) Math.floor(n * x / (double) (x + y));
            int yMax = (int) Math.ceil(n * x / (double) (x + y));
            int xResult = Math.max(xMin * x, yMax * y);
            int yResult = Math.max(xMax * x, yMin * y);

            return Math.min(xResult, yResult);
    }
}