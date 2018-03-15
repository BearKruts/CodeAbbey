/**
*	Problem: Dice Rolling
*	URL: http://www.codeabbey.com/index/task_view/dice-rolling
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Locale;
import java.util.Scanner;

public class DiceRolling {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();

		for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
			int diceRolling = (int) Math.ceil(reader.nextDouble() * 6);

			System.out.printf("%d ", diceRolling);
		}

		reader.close();
	}
}