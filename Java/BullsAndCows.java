/**
*    Problem: Bulls and Cows
*    URL: http://www.codeabbey.com/index/task_view/bulls-and-cows
*    Autor: Mykhailo Kruts
*    Date: 19 March 2018
*/

import java.util.Scanner;
import java.util.Arrays;

public class BullsAndCows {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final char[] SECRET_VALUE = reader.next().toCharArray();
        final int AMOUNT_OF_NUMBERS = Integer.parseInt(reader.next());

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            char[] number = reader.next().toCharArray();
            int bulls = 0;
            int cows = 0;

            for(int j = 0; j < 4; j++){
                if(number[j] == SECRET_VALUE[j]){
                    bulls++;
                } else if (String.valueOf(SECRET_VALUE).contains(String.valueOf(number[j]))) {
                    cows++;
                }
            }

            System.out.printf("%d-%d ", bulls, cows);
        }

        reader.close();
    }
}