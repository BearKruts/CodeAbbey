/**
*    Problem: King and Queen
*    Url: http://www.codeabbey.com/index/task_view/king-and-queen
*    Autor: MyKhailo Kruts
*    Date: 20 March 2018
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class KingAndQueen {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = Integer.parseInt(reader.next());

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            String result = isWin(reader.next(), reader.next());
            
            System.out.printf("%s ", result);
        }
        
        reader.close();
    }

    public static String isWin (String kingPosition, String queenPosition) {
        char xK = kingPosition.charAt(0);
        char yK = kingPosition.charAt(1);
        char xQ = queenPosition.charAt(0);
        char yQ = queenPosition.charAt(1);

        return (xK == xQ || yQ == yK || Math.abs(yK - yQ) == Math.abs(xK - xQ)) ? "Y" : "N";
    }
}