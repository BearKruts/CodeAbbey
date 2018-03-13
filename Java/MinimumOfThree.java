/* 
*	Problem: Minimum of Three
*	Url: http://www.codeabbey.com/index/task_view/min-of-three
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class MinimumOfThree {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String result = new String();
		int count = scan.nextInt();

		for(int i=0; i< count; i++){
			scan.nextLine();
			result += minOfTwo(minOfTwo(scan.nextInt(), scan.nextInt()), scan.nextInt())  + " ";
		}

		System.out.println(result);
	}

	public static int minOfTwo(int a, int b){
		return (a < b) ? a : b;
	}
}