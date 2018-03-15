/**
*	Problem: Vowel Count
*	URL: http://www.codeabbey.com/index/task_view/vowel-count
*	Autor: Mykhailo Kruts
*	Date: 15 March 2018
*/

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int AMOUNT_OF_STRINGS = Integer.parseInt(reader.nextLine());
		
		for (int i = 0; i < AMOUNT_OF_STRINGS; i++) {
			int result = vowelCount(reader.nextLine()); 

			System.out.printf("%d ", result);
		}

		reader.close();
	}

	public static int vowelCount(String s) {
		int vowelCount = 0;

		for (char el : s.toCharArray()) {
			switch (el) {
			    case 'a':
			    case 'o':
			    case 'u':
			    case 'i':
			    case 'e':
			    case 'y':
			    	vowelCount++;
			}
		}

		return vowelCount;
	}
}