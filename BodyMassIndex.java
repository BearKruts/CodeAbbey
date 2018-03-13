/* 
*	Problem: Body Mass Index
*	Url: http://www.codeabbey.com/index/task_view/body-mass-index
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Locale;
import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		int count = scan.nextInt();
		String result = new String();

		for(int i=0; i<count; i++){
			scan.nextLine();
			double bmi = scan.nextInt() / Math.pow(scan.nextDouble(), 2);
			
			if(bmi < 18.5){
				result += "under ";
			} else if(bmi >= 18.5 && bmi < 25.0){
				result += "normal ";
			} else if(bmi >= 25.0 && bmi < 30.0){
				result += "over ";
			} else {
				result += "obese ";
			}
		}

		System.out.println(result);
	}
}