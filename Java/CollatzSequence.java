/* 
*	Problem: Collatz Sequence
*	Url: http://www.codeabbey.com/index/task_view/collatz-sequence
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int countFor = scan.nextInt();
		String result = new String();

		for(int i = 0; i < countFor; i++){
			int x = scan.nextInt();
			int count = 0;
			while(x != 1){
				if(x % 2 == 0){
					x /= 2;
				} else {
					x = 3 * x + 1;
				}
				count++;
			}
			result += count + " ";
		}

		System.out.println(result);
	}
}