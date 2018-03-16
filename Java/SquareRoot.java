/**
*    Problem: Square Root
*    Url: http://www.codeabbey.com/index/task_view/square-root
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.Locale;
import java.util.Scanner;

public class SquareRoot {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
        	int x = reader.nextInt();
        	int n = reader.nextInt();
        	double r = 1.0;

        	for (int j = 0; j < n; j++) {
        		double d = x / r;
                r = (r + d) / 2;
           	}
            
            String result = (r % 1 == 0) ? String.format(Locale.US, "%.0f", r) : Double.toString(r);

            System.out.printf("%s ", result);
        }
        
        reader.close();
    }
}