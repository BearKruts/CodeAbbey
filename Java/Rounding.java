/* 
*	Problem: Rounding
*	Url: http://www.codeabbey.com/index/task_view/rounding
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class Rounding {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String result = new String();
		int count = scan.nextInt();

		for(int i=0; i< count; i++){
			scan.nextLine();
			result += Math.round((double)scan.nextInt()/(double)scan.nextInt()) + " ";
		}

		System.out.println(result);
	}
}