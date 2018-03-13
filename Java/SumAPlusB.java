/* 
*	Problem: Sum "A+B"
*	Url: http://www.codeabbey.com/index/task_view/sum-of-two
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class SumAPlusB{
	public static void main(String[] args){
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			sum += scan.nextInt();
		}

		System.out.println(sum);
	}
}