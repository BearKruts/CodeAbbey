/**
*    Problem: Static Web Page
*    URL: http://www.codeabbey.com/index/task_view/static-web-page
*    Autor: Mykhailo Kruts
*    Date: 21 March 2018
*/

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class StaticWebPage {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final String TEXT = "Secret value is " + reader.next();
        final String fileName = "simple.txt";

        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.println(TEXT);
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }

        reader.close();
    }
}