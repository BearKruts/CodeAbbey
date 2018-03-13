/* 
*	Problem: Vowel Count
*	Url: http://www.codeabbey.com/index/task_view/vowel-count
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();
		scan.nextLine();
		
		for(int i=0; i<count; i++){
			result += vowelCount(scan.nextLine()) + " ";
		}

		System.out.println(result);
	}

	public static int vowelCount(String str){
		int vowelCount = 0;
		for (char element : str.toCharArray()){
			switch(element){
			    case 'a':
			    case 'o':
			    case 'u':
			    case 'i':
			    case 'e':
			    case 'y':
			    	vowelCount++;
			}
		}
		return vowelCount;
	}
}