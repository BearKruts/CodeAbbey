/** 
*    Problem: Sum "A+B"
*    URL: http://www.codeabbey.com/index/task_view/sum-of-two
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class SumAPlusB {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int sumOfNumbers = 0;

        while (reader.hasNextInt()) {
            sumOfNumbers += reader.nextInt();
        }

        System.out.println(sumOfNumbers);
        reader.close();
    }
}