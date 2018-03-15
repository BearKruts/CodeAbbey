/**
*	Problem: Maximum of array
*	URL: http://www.codeabbey.com/index/task_view/maximum-of-array
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Scanner;

public class MaximumOfArray {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = 300;
		int tmp = reader.nextInt();
		int max = tmp;
		int min = tmp;

		for (int i = 1; i < AMOUNT_OF_NUMBERS; i++) {
			tmp = reader.nextInt();
			max = Math.max(tmp, max);
			min = Math.min(tmp, min);
		}

		System.out.printf("%d %d", max, min);
		reader.close();
	}
}