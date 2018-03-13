/* 
*	Problem: Sort with Indexes
*	Url: http://www.codeabbey.com/index/task_view/sort-with-indexes
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class SortWithIndexes {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];
		
		for(int i = 0; i < arr.length; i++) 
			arr[i] = scan.nextInt();

		int[] arrN = arr.clone();

		for(int i = 0; i < arr.length; i++){
			int tmp;
			for(int k = 0; k < arr.length-1; k++){
				if(arr[k] > arr[k+1]){
					tmp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = tmp;
				}
			}
		}

		for(int i = 0; i < arr.length; i++){
			for(int k = 0; k < arr.length; k++){
				if(arr[i] == arrN [k]) System.out.printf("%s ", k+1);
			}

		}
	}
}
