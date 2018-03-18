/**
*    Problem: Matching Brackets
*    URL: http://www.codeabbey.com/index/task_view/matching-brackets
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;
import java.util.ArrayList;

public class MatchingBrackets {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_LINES = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < AMOUNT_OF_LINES; i++) {
            System.out.printf("%d ", isValidate(reader.nextLine()));
        }

        reader.close();
    }

    public static int isValidate (String s) {
        s = s.replaceAll("[^\\(\\)\\{\\}\\[\\]<>]", "");
        int oldLength = s.length() + 1;

        while (s.length() < oldLength) {
            oldLength = s.length();
            s = s.replace("()","").replace("{}","").replace("[]","").replace("<>","");
        }

        return (s.length() > 0) ? 0 : 1;
    }
}