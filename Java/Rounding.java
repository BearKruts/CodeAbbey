/**
*	Problem: Rounding
*	URL: http://www.codeabbey.com/index/task_view/rounding
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Scanner;

public class Rounding {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int AMOUNT_OF_PAIRS = reader.nextInt();

		for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
			float resultOfDivision = (float) reader.nextInt() / reader.nextInt();
			int roundResultOfDivision = Math.round(resultOfDivision);

		    System.out.printf("%d ", roundResultOfDivision);
		}

		reader.close();
	}
}