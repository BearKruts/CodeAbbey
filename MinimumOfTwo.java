/* 
*	Problem: Minimum of Two
*	Url: http://www.codeabbey.com/index/task_view/min-of-two
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class MinimumOfTwo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String result = new String();
		int count = scan.nextInt();

		for(int i=0; i< count; i++){
			scan.nextLine();
			result += minOfTwo(scan.nextInt(), scan.nextInt()) + " ";
		}

		System.out.println(result);
	}

	public static int minOfTwo(int a, int b){
		return (a < b) ? a : b;
	}
}