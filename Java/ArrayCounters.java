/* 
*	Problem: Array Counters
*	Url: http://www.codeabbey.com/index/task_view/array-counters
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class ArrayCounters {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] num = new int[scan.nextInt()];
		int[] numCount = new int[scan.nextInt()];

		for(int i=0; i<num.length; i++){
			num[i] = scan.nextInt();
			numCount[num[i]-1] += 1;
		}

		for(int el : numCount){
			System.out.print(el+" ");
		}

	}
}