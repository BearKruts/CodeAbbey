/**
*    Problem: Savings Calculator
*    Url: http://www.codeabbey.com/index/task_view/savings-calculator
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class SavingsCalculator {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int result = savingsCalculator(Double.parseDouble(reader.next()), reader.nextInt(), reader.nextInt());
           
            System.out.printf("%d ", result);
        }
        
        reader.close();
    }

    public static int savingsCalculator (double s, int r, int p) {
        double rate = (p / 100.0) + 1;
        int year = 0;

        while (s < r) {
            s *= rate;
            year++;
        }

        return year;
    }
}