/* 
*	Problem: Modulo and time difference
*	Url: http://www.codeabbey.com/index/task_view/modulo-and-time-difference
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class ModuloAndTimeDifference {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();

		for(int i = 0; i < count; i++){
			int day1 = (scan.nextInt()*24*60*60) + (scan.nextInt() * 60 * 60) + (scan.nextInt() * 60) + scan.nextInt();
			int day2 = (scan.nextInt()*24*60*60) + (scan.nextInt() * 60 * 60) + (scan.nextInt() * 60) + scan.nextInt();
			int difference = day2 - day1;
			int differenceDay = ((difference/60)/60) / 24;
			int differenceHours = ((difference/60)/60) % 24;
			int differenceMinutes = (difference/60) % 60;
			int differenceSeconds = difference % 60;
			result += String.format("(%s %s %s %s) ", differenceDay, differenceHours, differenceMinutes, differenceSeconds);
		}

		System.out.println(result);
	}
}