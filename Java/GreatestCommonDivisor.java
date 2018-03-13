/* 
*	Problem: Greatest Common Divisor
*	Url: http://www.codeabbey.com/index/task_view/greatest-common-divisor
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();

		for(int i = 0; i < count; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			result += String.format("(%s %s) ", gcd(a, b), lcm(a, b));
		}

		System.out.println(result);
	}

	public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a,int b) {
		return a * b / gcd(a, b);
   	}
}
