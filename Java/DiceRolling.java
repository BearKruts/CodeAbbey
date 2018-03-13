/* 
*	Problem: Dice Rolling
*	Url: http://www.codeabbey.com/index/task_view/dice-rolling
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Locale;
import java.util.Scanner;

public class DiceRolling {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		int count = scan.nextInt();
		String result = new String();

		for(int i=0; i<count; i++){
			result += (int)Math.ceil(scan.nextDouble() * 6) + " ";
		}

		System.out.println(result);
	}
}