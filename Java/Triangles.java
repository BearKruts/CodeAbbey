/* 
*	Problem: Triangles
*	Url: http://www.codeabbey.com/index/task_view/triangles
*	Autor: Mykhailo Kruts
*	Date: 13 March 2018
*/

import java.util.Scanner;

public class Triangles {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String result = new String();

		for(int i=0; i<count; i++){
			scan.nextLine();
			result += isTriangles(scan.nextInt(), scan.nextInt(), scan.nextInt()) + " ";
		}

		System.out.println(result);
	}

	public static int isTriangles(int a, int b, int c){
		return (a+b>c && a+c>b && b+c>a) ? 1 : 0;
	}
}