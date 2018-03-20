/**
*    Problem: Tic-Tac-Toe
*    Url: http://www.codeabbey.com/index/task_view/tic-tac-toe
*    Autor: Mykhailo Kruts
*    Date: 20 March 2018
*/

import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToe {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
        	ArrayList<Integer> progresX = new ArrayList<Integer>();
        	ArrayList<Integer> progresO = new ArrayList<Integer>();
        	String[] moves = reader.nextLine().split(" ");
        	int step = 0;

        	for (int j = 0; j < moves.length; j++) {
        		ArrayList<Integer> progres = (j % 2 == 0) ? progresX : progresO;
        		progres.add(Integer.parseInt(moves[j]));

        		if(isEndGame (progres)){
        			step = j + 1;
        			break;
        		}
        	}
        	
        	System.out.printf("%d ", step);
        }
        
        reader.close();
    }

    public static boolean isEndGame (ArrayList<Integer> progres) {
    	String[] winCombinations = {"123", "456", "789", "147", "258", "369", "159", "357"};
    	boolean isEndGame = false;

    	for (String combination : winCombinations) {
    		int a = progres.indexOf(Character.getNumericValue(combination.charAt(0)));
    		int b = progres.indexOf(Character.getNumericValue(combination.charAt(1)));
    		int c = progres.indexOf(Character.getNumericValue(combination.charAt(2)));

    		if(a >= 0 && b >= 0 && c >= 0) {
    			isEndGame = true;
    		}
    	}

    	return isEndGame;
    }
}