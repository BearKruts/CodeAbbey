/**
*    Problem: Rock Paper Scissors
*    Url: http://www.codeabbey.com/index/task_view/rock-paper-scissors
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int[] player = {0, 0};

            for (String el : reader.nextLine().split(" ")) {
                switch (el) {
                    case "RS":
                    case "PR":
                    case "SP":
                        player[0]++;
                        break;
                    case "SR":
                    case "RP":
                    case "PS":
                        player[1]++;
                        break;
                }
            }
           
            System.out.printf("%d ", (player[0] > player[1]) ? 1 : 2);
        }
        
        reader.close();
    }
}