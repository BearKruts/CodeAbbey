/**
*    Problem: Palindromes
*    Url: http://www.codeabbey.com/index/task_view/palindromes
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class Palindromes {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_LINES = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < AMOUNT_OF_LINES; i++) {
            String result = isPalindrome(reader.nextLine()) ? "Y" : "N";

            System.out.printf("%s ", result);
        }
        
        reader.close();
    }

    public static boolean isPalindrome (String text) {
        String textComparison = text.toLowerCase().replaceAll("[^a-zA-Z]", "");
        String reversTextComparison = new StringBuilder(textComparison).reverse().toString();

        return (textComparison.equals(reversTextComparison));
    }
}