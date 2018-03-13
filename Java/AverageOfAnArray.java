/* 
*	Problem: Average of an array
*	Url: http://www.codeabbey.com/index/task_view/average-of-array
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class AverageOfAnArray {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		String result = new String();

		for(int i=0; i<count; i++){
			result += avg(scan.nextLine()) + " ";
		}

		System.out.println(result);
	}

	public static int avg(String s){
		int avg = 0;
		String strArr[] = s.split(" ");
		for (int i=0; i<strArr.length; i++){
			avg += Integer.parseInt(strArr[i]);
		}
		avg = (int)Math.round((double)avg / (strArr.length-1));
		return avg;
	}
}