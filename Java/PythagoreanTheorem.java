/**
*    Problem: Pythagorean Theorem
*    Url: http://www.codeabbey.com/index/task_view/pythagorean-theorem
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
            int catheters = (int) Math.pow(reader.nextInt(), 2) + (int) Math.pow(reader.nextInt(), 2);
            int hypotenuse = (int) Math.pow(reader.nextInt(), 2);

            String result = (hypotenuse == catheters) ? "R" : (hypotenuse < catheters) ? "A" : "O";

            System.out.printf("%s ", result);
        }
        
        reader.close();
    }
}