/**
*    Problem: Blackjack Counting
*    Url: http://www.codeabbey.com/index/task_view/blackjack-counting
*    Autor: Mykhailo Kruts
*    Date: 19 March 2018
*/

import java.util.Scanner;

public class BlackjackCounting {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            String[] cards = reader.nextLine().split(" ");
            int sumOfCards = 0;
            int aceCount = 0;

            for (String card : cards) {
                switch (card) {
                    case "A":
                        sumOfCards += 11;
                        aceCount++;
                        break;
                    case "T":
                    case "J":
                    case "Q":
                    case "K":
                        sumOfCards += 10;
                        break;
                    default:
                        sumOfCards += Integer.parseInt(card);
                }
            }

            if (sumOfCards > 21 && aceCount > 0) {
                sumOfCards -= 11 * aceCount;
                sumOfCards += aceCount;
            }
            System.out.printf("%s ", (sumOfCards > 21) ? "Bust" : sumOfCards);
        }
        
        reader.close();
    }
}