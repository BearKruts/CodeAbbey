/* 
*	Problem: Maximum of array
*	Url: http://www.codeabbey.com/index/task_view/maximum-of-array
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class MaximumOfArray {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int tmp = scan.nextInt();
		int max = tmp;
		int min = tmp;

		for(int i=1; i < 300; i++){
			tmp = scan.nextInt();
			max = (max < tmp) ? tmp : max;
			min = (min < tmp) ? min : tmp;
		}

		System.out.printf("%s %s", max, min);
	}
}