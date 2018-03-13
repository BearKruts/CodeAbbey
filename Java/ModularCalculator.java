/* 
*	Problem: Modular Calculator
*	Url: http://www.codeabbey.com/index/task_view/modular-calculator
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.math.BigInteger;
import java.util.Scanner;

public class ModularCalculator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BigInteger result = new BigInteger(scan.next());
		BigInteger tmp;
		boolean isTrue = true;

		while(isTrue){
		    switch(scan.next()){
				case "+":
					result = result.add(new BigInteger(scan.next()));
					break;
				case "*":
					result = result.multiply(new BigInteger(scan.next()));
					break;
				case "%":
					result =  result.mod(new BigInteger(scan.next()));
					isTrue = false;
					break;
			}
		}
		
		System.out.println(result);
	}
}