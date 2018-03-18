/**
*    Problem: Double Dice Roll
*    Url: http://www.codeabbey.com/index/task_view/double-dice-roll
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class DoubleDiceRoll {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
           	int a = (reader.nextInt() % 6) + 1;
	        int b = (reader.nextInt() % 6) + 1;
	        int c = a + b;

            System.out.printf("%d ", c);
        }
        
        reader.close();
    }
}