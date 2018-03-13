/* 
*	Problem: Sum in Loop
*	Url: http://www.codeabbey.com/index/task_view/sum-in-loop
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class SumInLoop{
	public static void main(String[] args){
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();

		for(int i=0; i < count; i++){
			sum += scan.nextInt();
		}

		System.out.println(sum);
	}
}