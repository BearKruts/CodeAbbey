/**
*    Problem: Modulo and time difference
*    URL: http://www.codeabbey.com/index/task_view/modulo-and-time-difference
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class ModuloAndTimeDifference {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int[] difference = moduloAndTimeDifference(new int[][]{{reader.nextInt(), reader.nextInt(), reader.nextInt(), reader.nextInt()},
                                                                        {reader.nextInt(), reader.nextInt(), reader.nextInt(), reader.nextInt()}});
  
            System.out.printf("(%s %s %s %s) ", difference[1], difference[2], difference[3], difference[4]);
        }

        reader.close();
    }

    public static int[] moduloAndTimeDifference (int[][] days) {
        int day[] = new int[2];
        int difference[] = new int[5];
        
        day[0] = (days[0][0] * 24 * 60 * 60) + (days[0][1] * 60 * 60) + (days[0][2] * 60) + days[0][3];
        day[1] = (days[1][0] * 24 * 60 * 60) + (days[1][1] * 60 * 60) + (days[1][2] * 60) + days[1][3];
        difference[0] = day[1] - day[0];
        difference[1] = ((difference[0] / 60) / 60) / 24;
        difference[2] = ((difference[0] / 60) / 60) % 24;
        difference[3] = (difference[0] / 60) % 60;
        difference[4] = difference[0] % 60;
        
        return difference;
    }
}