/* 
*	Problem: Reverse String
*	Url: http://www.codeabbey.com/index/task_view/reverse-string
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[] src = (scan.nextLine()).toCharArray();
		for(int i=src.length; i > 0; i--){
			System.out.print(src[i-1]);
		}
	}
}