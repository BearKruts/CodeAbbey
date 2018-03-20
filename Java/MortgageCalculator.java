/**
*    Problem: Mortgage Calculator
*    Url: http://www.codeabbey.com/index/task_view/mortgage-calculator
*    Autor: Mykhailo Kruts
*    Date: 20 March 2018
*/

import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        double p = reader.nextDouble(); 
        double r = 1 + (reader.nextDouble() / 100) / 12;
        double l = reader.nextDouble();
        int m = (int) Math.ceil(p * Math.pow(r, l) * (r - 1) / (Math.pow(r, l) - 1));

        System.out.println(m);
        reader.close();
    }
}