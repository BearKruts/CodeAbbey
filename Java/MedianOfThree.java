/* 
*	Problem: Median of Three
*	Url: http://www.codeabbey.com/index/task_view/median-of-three
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class MedianOfThree {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();

		for(int i=0; i<count; i++){
			scan.nextLine();
			result += median(scan.nextInt(), scan.nextInt(), scan.nextInt()) + " ";
		}

		System.out.println(result);
	}

	public static int min(int a, int b){
		return (a<b) ? a : b;
	} 

	public static int max(int a, int b){
		return (a<b) ? b : a;
	}

	public static int median(int a, int b, int c){
		return (a+b+c) - max(a,max(b,c)) - min(a,min(b,c));
	}
}