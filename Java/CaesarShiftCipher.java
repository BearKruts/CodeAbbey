/**
*    Problem: Caesar Shift Cipher
*    URL: http://www.codeabbey.com/indexCaesar/task_view/caesar-shift-cipher
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;
import java.util.Arrays;

public class CaesarShiftCipher {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_LINES = reader.nextInt();
        final int STEP = reader.nextInt();
        reader.nextLine();

        for (int i = 0; i < AMOUNT_OF_LINES; i++) {
            for (char el : reader.nextLine().toCharArray()) {
            	System.out.printf("%s", Character.isLetter(el) ? caesarShiftCipher (Character.toString(el), STEP) : el);
            }

            System.out.print(" ");
        }

        reader.close();
    }

 	public static String caesarShiftCipher (String el, int k) {
 		String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
 		String[] lettersCaesar = new String[26];
 		int index;

 		for (int i = 0; i < 26; i++){
 			int indexCaesar = i + k;

 			if(indexCaesar > 25){
 				indexCaesar = Math.abs(26 - indexCaesar);
 			}

 			lettersCaesar[i] = letters[indexCaesar];

 		}

 		index = Arrays.asList(lettersCaesar).indexOf(el);

 		return letters[index];
 	}
}