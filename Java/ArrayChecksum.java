/* 
*	Problem: Array Checksum
*	Url: http://www.codeabbey.com/index/task_view/array-checksum
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class ArrayChecksum {
	public static void main(String[] args){
		long checksum = 0;
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		final int SEED = 113;
		final int LIMIT = 10000007;

		for(int i=0; i<count; i++){
			checksum = (long)(checksum + scan.nextInt()) * SEED;
			if(i > 2) checksum = checksum % LIMIT;
		}

		System.out.println(checksum);
	}
}