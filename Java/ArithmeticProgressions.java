/* 
*	Problem: Arithmetic Progressions
*	Url: http://www.codeabbey.com/index/task_view/arithmetic-progression
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class ArithmeticProgressions {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();

		for(int i=0; i<count; i++){
			scan.nextLine();
			int total = 0;
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();

			for(int x=0; x<c; x++){
				total += a + (b*x);
			}

			result += total + " ";
		}

		System.out.println(result);
	}
}