/**
*    Problem: Bubble Sort
*    URL: http://www.codeabbey.com/index/task_view/bubble-sort
*    Autor: Mykhailo Kruts
*    Date: 13 March 2018
*/

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbersArray = new int[reader.nextInt()];
        int steps = 0;
        int swaps = 0;
        
        for (int i = 0; i < numbersArray.length; i++) { 
            numbersArray[i] = reader.nextInt();
        }

        for (int i = 0; i < numbersArray.length; i++) {
            int numberTemp;
            int stepsTemp = 0;

            for (int j = 0; j < numbersArray.length-1; j++) {
                if (numbersArray[j] > numbersArray[j + 1]) {
                    numberTemp = numbersArray[j];
                    numbersArray[j] = numbersArray[j + 1];
                    numbersArray[j + 1] = numberTemp;
                    swaps++;
                    stepsTemp++;
                }
            }

            steps++;

            if (stepsTemp == 0) break;
        }

        System.out.printf("%s %s", steps, swaps);
        reader.close();
    }
}