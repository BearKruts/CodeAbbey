/**
*    Problem: Average of an array
*    URL: http://www.codeabbey.com/index/task_view/average-of-array
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class AverageOfAnArray {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int result = averageOfAnArray(reader.nextLine());

            System.out.printf("%d ", result);
        }

        reader.close();
    }

    public static int averageOfAnArray (String lineOfNumbers) {
        String[] arrayOfNumders = lineOfNumbers.split(" ");
        int result = 0;

        for (String el : arrayOfNumders) {
            result += Integer.parseInt(el);
        }

        result = (int) Math.round((double) result / (arrayOfNumders .length - 1));
        return result;
    }
}