/* 
*	Problem: Bubble Sort
*	Url: http://www.codeabbey.com/index/task_view/bubble-sort
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];
		int iter = 0;
		int swaps = 0;
		
		for(int i = 0; i < arr.length; i++) 
			arr[i] = scan.nextInt();

		for(int i = 0; i < arr.length; i++){
			int tmp;
			int iterTmp = 0;
			iter++;

			for(int k = 0; k < arr.length-1; k++){
				if(arr[k] > arr[k+1]){
					tmp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = tmp;
					swaps++;
					iterTmp++;
				}
			}

			if(iterTmp == 0) break;	
		}

		System.out.printf("%s %s", iter, swaps);
	}
}
