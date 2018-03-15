/**
*    Problem: Modular Calculator
*    URL: http://www.codeabbey.com/index/task_view/modular-calculator
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.math.BigInteger;
import java.util.Scanner;

public class ModularCalculator {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        BigInteger result = new BigInteger(reader.next());
        boolean isEndOfOperations = true;

        while (isEndOfOperations) {
            switch (reader.next()) {
                case "+":
                    result = result.add(new BigInteger(reader.next()));
                    break;
                case "*":
                    result = result.multiply(new BigInteger(reader.next()));
                    break;
                case "%":
                    result = result.mod(new BigInteger(reader.next()));
                    isEndOfOperations = false;
                    break;
            }
        }

        System.out.printf("%s", result);
        reader.close();
    }
}