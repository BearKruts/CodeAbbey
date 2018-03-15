/**
*	Problem: Sum in Loop
*	URL: http://www.codeabbey.com/index/task_view/sum-in-loop
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Scanner;

public class SumInLoop {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();
        int sumOfNumbers = 0;

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
        	if (reader.hasNextInt()) {
            	sumOfNumbers += reader.nextInt();
        	}
        }

        System.out.println(sumOfNumbers);
        reader.close();
	}
}