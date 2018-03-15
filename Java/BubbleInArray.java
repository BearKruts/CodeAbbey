/**
*    Problem: Bubble in Array
*    URL: http://www.codeabbey.com/index/task_view/bubble-in-array
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class BubbleInArray {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int SEED = 113;
        final int LIMIT = 10000007;
        int[] numbersArray = stringToIntArray(reader.nextLine());
        int swaps = 0;
        long checksum = 0;

        for (int i = 0; i < numbersArray.length - 1; i++) {
            int x = numbersArray[i];
            int y = numbersArray[i + 1];

            if (x > y) {
                numbersArray[i] = y;
                numbersArray[i + 1] = x;
                swaps++;
            }
        }

        for (int i = 0; i < numbersArray.length; i++){
            checksum = (long) (checksum + numbersArray[i]) * SEED;
            if (i > 2) checksum %= LIMIT;
        }

        System.out.printf("%s %s ", swaps, checksum);
        reader.close();
    }

    public static int[] stringToIntArray (String text){
        String[] stringArray = text.split(" ");
        int numbersArray[] = new int[stringArray.length - 1];

        for (int i = 0; i < stringArray.length; i++) {
            if (Integer.parseInt(stringArray[i]) != -1){
                numbersArray[i] = Integer.parseInt(stringArray[i]);
            }
        }

        return numbersArray;
    }
}