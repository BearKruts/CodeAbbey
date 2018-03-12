/* 
*	Problem: Sums in Loop
*	Url: http://www.codeabbey.com/index/task_view/sums-in-loop
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class SumsInLoop{
	public static void main(String[] args){
		String result = new String();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for(int i=0; i < count; i++){
			scan.nextLine();
			result += scan.nextInt() + scan.nextInt() + " ";
		}

		System.out.println(result);
	}
}