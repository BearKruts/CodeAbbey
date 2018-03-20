/**
*    Problem: Cards Shuffling
*    URL: http://www.codeabbey.com/index/task_view/cards-shuffling
*    Autor: Mykhailo Kruts
*    Date: 20 March 2018
*/

import java.util.Scanner;

public class CardsShuffling {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] cardDeck = getCardDeck();

        for (int i = 0; i < 52; i++) {
            int to = reader.nextInt() % 52;

            swapValues(cardDeck, i, to);      
        }

        for (String el : cardDeck) 
            System.out.printf("%s ", el);

        reader.close();
    }

    public static String[] getCardDeck () {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        String[] suits = {"C", "D", "H", "S"};
        String[] cardDeck = new String[52];        
        int i = 0;
        
        for (String suit : suits) {
            for (String rank : ranks) {
                cardDeck[i] = suit + rank;
                i++;
            }
        }

        return cardDeck;
    }

    public static void swapValues (String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}