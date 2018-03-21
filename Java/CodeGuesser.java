/**
*    Problem: Code Guesser
*    URL: http://www.codeabbey.com/index/task_view/code-guesser
*    Autor: Mykhailo Kruts
*    Date: 21 March 2018
*/

import java.util.Scanner;
import java.util.Arrays;

public class CodeGuesser {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();
        int[][] dataOfNumber = new int[4][AMOUNT_OF_PAIRS];
        int[] guessedQuantity = new int[AMOUNT_OF_PAIRS];
        boolean[][] poolOfUsedNumbers = new boolean[4][10];
        String result = new String();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int number = reader.nextInt();
            guessedQuantity[i] = reader.nextInt();

            for (int j = 1; j < 5; j++) {
                dataOfNumber[4 - j][i] = number % 10;
                number /= 10;
            }
        }

        reader.close();
        markInvalidNumbers (dataOfNumber, guessedQuantity, poolOfUsedNumbers, AMOUNT_OF_PAIRS);
        result = lookingForNumber (dataOfNumber, guessedQuantity, poolOfUsedNumbers, AMOUNT_OF_PAIRS);
        
        System.out.println(result);
    }

    public static void markInvalidNumbers (int[][] number, int[] quantity, boolean[][] used, int max) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < max; j++) {
                int temp = number[i][j];
                if (quantity[j] == 0 && temp >= 0) {
                    for (int k = 0; k < max; k++) if (k != j && temp == number[i][k]) number[i][k] = -1;
                    number[i][j] = -1;
                    used[i][temp] = true;
                }
            }
        }
    }

    public static String lookingForNumber (int[][] number, int[] quantity, boolean[][] used, int max) {
        int[] answer = {-1, -1, -1, -1};
        int count = 0;

        while (count < 4) {
            for (int i = 0; i < max; i++) {
                if (quantity[i] > 0) {
                    int m = 0;
                    for (int j = 0; j < 4; j++) if (number[j][i] >= 0) m++;
                    if (m == quantity[i]) {
                        for (int j = 0; j < 4; j++) {
                            int temp = number[j][i];
                            if (temp >= 0) {
                                answer[j] = temp;
                                count++;
                                for (int k = 0; k < max; k++) {
                                    if (number[j][k] == temp && quantity[k] > 0) quantity[k]--;
                                    number[j][k] = -1;
                                }
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                if (answer[i] == -1) {
                    int temp = -1;
                    for (int j = 0; j < used[i].length; j++) {
                        if (!used[i][j]) {
                            if (temp < 0) {
                                temp = j;
                            } else {
                                temp = -1;
                                break;
                            }
                        }
                    }
                    if (temp >= 0) {
                        answer[i] = temp;
                        count++;
                    }
                }
            }

        };

        return Arrays.toString(answer).replaceAll("[^\\d]","");
    }
}