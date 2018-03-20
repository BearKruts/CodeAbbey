/**
*    Problem: Integer Factorization
*    URL: http://www.codeabbey.com/index/task_view/integer-factorization
*    Autor: Mykhailo Kruts
*    Date: 20 March 2018
*/

import java.util.Scanner;
import java.util.ArrayList;

public class IntegerFactorization {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
        	String result = String.join("*", integerFactorization(reader.nextLong()));

        	System.out.printf("%s ", result);
        }

        reader.close();
    }

    public static ArrayList<String> integerFactorization(long number) { 
    	ArrayList<String> primeNumbers = new ArrayList<String>();  

    	for (int i = 2; i <= number; i++) { 
    		if (number % i == 0) { 
    			primeNumbers.add(String.valueOf(i));
    			number /= i; 
    			i--;
    		} 
    	} 

    	return primeNumbers; 
    }
}