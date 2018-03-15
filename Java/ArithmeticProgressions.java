/**
*	Problem: Arithmetic Progressions
*	URL: http://www.codeabbey.com/index/task_view/arithmetic-progression
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Scanner;

public class ArithmeticProgressions {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int AMOUNT_OF_PAIRS = reader.nextInt();

		for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
			int arithmeticProgressions = 0;
			int numberOne = reader.nextInt();
			int numberTwo = reader.nextInt();
			int numberThree = reader.nextInt();

			for (int x = 0; x < numberThree; x++) {
				arithmeticProgressions += numberOne + (numberTwo * x);
			}

			System.out.printf("%d ", arithmeticProgressions);
		}

		reader.close();
	}
}