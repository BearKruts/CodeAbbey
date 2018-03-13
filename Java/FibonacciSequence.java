/* 
*	Problem: Fibonacci Sequence
*	Url: http://www.codeabbey.com/index/task_view/fibonacci-sequence
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();

		for(int i = 0; i < count; i++){
			result +=  indexFibonacci(new BigDecimal(scan.next())) + " ";
			
		}

		System.out.println(result);
	}

	public static int indexFibonacci(BigDecimal a) {
		a = a.multiply(new BigDecimal("5"));
		a = a.add(new BigDecimal("0.5"));
		int index = (int) (Math.log(a.doubleValue()) / Math.log(1.61803398875)) - 1;
		index = (index < 0) ? 0 : index;
        return index;
    }
}