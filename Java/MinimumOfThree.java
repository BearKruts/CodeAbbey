/**
*	Problem: Minimum of Three
*	URL: http://www.codeabbey.com/index/task_view/min-of-three
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Scanner;

public class MinimumOfThree {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int AMOUNT_OF_PAIRS = reader.nextInt();

    for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
      int minOfTwoNumbers = Math.min(reader.nextInt(), reader.nextInt());
      int minOfThreeNumbers = Math.min(minOfTwoNumbers, reader.nextInt());
           
      System.out.printf("%d ", minOfThreeNumbers);
    }
        
    reader.close();
  }
}