/* 
*	Problem: Bubble in Array
*	Url: http://www.codeabbey.com/index/task_view/bubble-in-array
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class BubbleInArray {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = stringToIntArray(scan.nextLine());
		final int SEED = 113;
		final int LIMIT = 10000007;
		int swaps = 0;
		long checksum = 0;

		for (int i = 0; i < arr.length-1; i++) {
			int x = arr[i];
			int y = arr[i+1];
			if (x > y) {
				arr[i] = y;
				arr[i + 1] = x;
				swaps++;
			}
		}

		for(int i=0; i<arr.length; i++){
			checksum = (long)(checksum + arr[i]) * SEED;
			if(i > 2) checksum = checksum % LIMIT;
		}

		System.out.printf("\n %s %s ", swaps, checksum);

	}

	public static int[] stringToIntArray(String s){
		String strArr[] = s.split(" ");
		int intArr[] = new int[strArr.length-1];
		for (int i = 0; i < strArr.length; i++) {
			if(Integer.parseInt(strArr[i]) != -1)
				intArr[i] = Integer.parseInt(strArr[i]);
		}
		return intArr;
	}

}
