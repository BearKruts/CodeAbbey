/**
*	Problem: Sums in Loop
*	Url: http://www.codeabbey.com/index/task_view/sums-in-loop
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Scanner;

public class SumsInLoop {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
        	int sumOfNumbers = reader.nextInt() + reader.nextInt();
           
        	System.out.printf("%d ", sumOfNumbers);
        }
        
        reader.close();
	}
}