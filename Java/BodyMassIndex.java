/**
*	Problem: Body Mass Index
*	URL: http://www.codeabbey.com/index/task_view/body-mass-index
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Locale;
import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in).useLocale(Locale.US);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

		for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
			double bodyMassIndex = reader.nextInt() / Math.pow(reader.nextDouble(), 2);
			String result;
			
			if (bodyMassIndex < 18.5) {
				result = "under";
			} else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25.0) {
				result = "normal";
			} else if (bodyMassIndex >= 25.0 && bodyMassIndex < 30.0) {
				result = "over";
			} else {
				result = "obese";
			}

			System.out.printf("%s ", result);
		}

		reader.close();
	}
}