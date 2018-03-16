/**
*    Problem: Neumann's Random Generator
*    URL: http://www.codeabbey.com/index/task_view/neumanns-random-generator
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.ArrayList;
import java.util.Scanner;

public class NeumannsRandomGenerator {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_NUMBERS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            ArrayList<Integer> listNumbers = new ArrayList<Integer>();
            boolean isNoRepition = true;

            listNumbers.add(reader.nextInt());
            
            while (isNoRepition) {
                int numberTemp = listNumbers.get(listNumbers.size() - 1);
                numberTemp = getnumberTemp(numberTemp);
                
                if (listNumbers.contains(numberTemp)) {
                    isNoRepition = false;
                } else {
                    listNumbers.add(numberTemp);
                }
            }

            System.out.printf("%d ", listNumbers.size());
        }

        reader.close();
    }

    public static int getnumberTemp (int number) {
        String numberTemp = Integer.toString((int) Math.pow(number, 2));

        while (numberTemp.length() < 8) {
            numberTemp = 0 + numberTemp;
        }

        numberTemp = numberTemp.substring(2, 6);
        return Integer.parseInt(numberTemp);
    }
}