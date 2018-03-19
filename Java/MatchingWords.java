/**
*    Problem: Matching Words
*    URL: http://www.codeabbey.com/index/task_view/matching-words
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MatchingWords {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        String result = matchingWords(reader.nextLine());

        System.out.println(result);
        reader.close();
    }

    public static String matchingWords (String text) {
        ArrayList<String> repeat = new ArrayList<String>();

        for (String el : text.split(" ")) {
            if(text.length() - text.replace(el, "").length() > 3) {
                repeat.add(el);
            }
            text = text.replace(el, "");
        }

        Collections.sort(repeat);

        return String.join(" ", repeat);
    }
}