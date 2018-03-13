/* 
*	Problem: Weighted sum of digits
*	Url: http://www.codeabbey.com/index/task_view/weighted-sum-of-digits
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class WeightedSumOfDigits {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();

		for(int i=0; i<count; i++){
			result += weightedSumOfDigits(scan.nextInt()) + " ";
		}

		System.out.println(result);
	}

	public static int weightedSumOfDigits(int a){
		int wsd = 0;
		int i = 0;
		String tmp = a+"";
		
		for(char element : tmp.toCharArray()){
			i++;
			wsd += Character.getNumericValue(element) * i;
		}

		return wsd;
	}
}