/**
*    Problem: Card Names
*    URL: http://www.codeabbey.com/index/task_view/card-names
*    Autor: Mykhailo Kruts
*    Date: 19 March 2018
*/

import java.util.Scanner;

public class CardNames {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();
        final String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
        final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            int cardValue = reader.nextInt();
            int suitValue = cardValue / 13;
            int rankValue = cardValue % 13;

            System.out.printf("%s-of-%s ", ranks[rankValue], suits[suitValue]);
        }

        reader.close();
    }
}