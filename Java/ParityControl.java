/**
*    Problem: Parity Control
*    URL: http://www.codeabbey.com/index/task_view/parity-control
*    Autor: Mykhailo Kruts
*    Date: 19 March 2018
*/

import java.util.Scanner;

public class ParityControl {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final String[] ASCII_CODE_NUMBERS = reader.nextLine().split(" ");

        for (String el : ASCII_CODE_NUMBERS){
        	int number = Integer.parseInt(el);
			char letter;
            
            if (isMultipleOfTwoBits(number)) continue;
            letter = getLetter(number);
        	System.out.print(letter);
        }

        reader.close();
    }

    public static char getLetter (int num) {
    	num %= 128;

    	return (char) num;
    }

    public static boolean isMultipleOfTwoBits (int num) {
        int bits = 0;

        while (num > 0) {
            if (num % 2 > 0) bits++;
            num >>= 1;
        }

        return (bits % 2 > 0) ? true : false;
    }
}