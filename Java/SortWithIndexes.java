/**
*    Problem: Sort with Indexes
*    URL: http://www.codeabbey.com/index/task_view/sort-with-indexes
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class SortWithIndexes {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbersOf = new int[reader.nextInt()];
        
        for (int i = 0; i < numbersOf.length; i++) {
            numbersOf[i] = reader.nextInt();
        }

        int[] numbersOfClone = numbersOf.clone();

        for (int i = 0; i < numbersOf.length; i++){
            int numberTemp;

            for(int j = 0; j < numbersOf.length-1; j++){
                if(numbersOf[j] > numbersOf[j + 1]){
                    numberTemp = numbersOf[j];
                    numbersOf[j] = numbersOf[j + 1];
                    numbersOf[j + 1] = numberTemp;
                }
            }
        }

        for(int i = 0; i < numbersOf.length; i++){
            for(int j = 0; j < numbersOf.length; j++){
                if(numbersOf[i] == numbersOfClone[j]){
                    System.out.printf("%s ", j + 1);
                }
            }
        }

        reader.close();
    }
}