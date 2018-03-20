/**
*    Problem: Selection Sort
*    URL: http://www.codeabbey.com/index/task_view/selection-sort
*    Autor: Mykhailo Kruts
*    Date: 20 March 2018
*/

import java.util.Scanner;

public class SelectionSort {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++)
            numbers[i] = reader.nextInt();

        while (n > 1) {
            int max = getMaxIndex(numbers, n);
            n--;
            swapValues(numbers, n, max);
            
            System.out.printf("%d ", max);
        }

        reader.close();
    }

    public static int getMaxIndex (int[] arr, int endIndex) {
        int max = 0;

        for (int i = 1; i < endIndex; i++)
            if (arr[i] > arr[max]) max = i;

        return max;
    }

    public static void swapValues (int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
}