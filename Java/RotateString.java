/**
*    Problem: Rotate String
*    Url: http://www.codeabbey.com/index/task_view/rotate-string
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class RotateString {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
        	String result = rotateString(reader.nextInt(), reader.next());
           
            System.out.printf("%s ", result);
        }
        
        reader.close();
    }

    public static String rotateString (int index, String text) {
    	int finishIndex = text.length();
    	String rotateText;

    	if (index < 0) {
    		index += text.length();
    	}

    	return new String(text.substring(index, text.length()) + text.substring(0, index));
    }
}