/* 
*	Problem: Sum of digits
*	Url: http://www.codeabbey.com/index/task_view/vowel-count
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();

		for(int i=0; i<count; i++){
			scan.nextLine();
			result += sumOfDigits(scan.nextInt(), scan.nextInt(), scan.nextInt()) + " ";
		}

		System.out.println(result);
	}

	public static int sumOfDigits(int a, int b, int c){
		int tmp = (a * b) + c;
		int sum = 0;
		while(tmp > 0) {
			sum += tmp % 10;
			tmp /= 10;
		}
		return sum;
	} 
}