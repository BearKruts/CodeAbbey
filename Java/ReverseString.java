/**
*    Problem: Reverse String
*    URL: http://www.codeabbey.com/index/task_view/reverse-string
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        char[] textArray = reader.nextLine().toCharArray();

        for (int i = textArray.length; i > 0; i--) {
            System.out.print(textArray[i - 1]);
        }

        reader.close();
    }
}