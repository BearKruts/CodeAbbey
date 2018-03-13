/* 
*	Problem: Fahrenheit to Celsius
*	Url: http://www.codeabbey.com/index/task_view/fahrenheit-celsius
*	Autor: Mykhailo Kruts
*	Date: 12 March 2018
*/

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args){
		final double NINE_FIFTHS = (double)5/(double)9;
		String result = new String();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for(int i = 0; i < count; i++){
			result += Math.round(NINE_FIFTHS * (scan.nextInt()-32)) + " ";
		}

		System.out.println(result);
	}
}