/**
*    Problem: Fool's Day 2014
*    Url: http://www.codeabbey.com/index/task_view/fools-day-2014
*    Autor: Mykhailo Kruts
*    Date: 19 March 2018
*/

import java.util.Scanner;

public class FoolsDay2014 {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int sumOfNumbers = 0;

            for (String el : reader.nextLine().split(" ")) {
            	sumOfNumbers += Math.pow(Integer.parseInt(el), 2);
            }
           
            System.out.printf("%d ", sumOfNumbers);
        }
        
        reader.close();
    }
}