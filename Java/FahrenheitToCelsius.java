/**
*    Problem: Fahrenheit to Celsius
*    URL: http://www.codeabbey.com/index/task_view/fahrenheit-celsius
*    Autor: Mykhailo Kruts
*    Date: 15 March 2018
*/

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final float NINE_FIFTHS = 5.0f / 9;
        final int AMOUNT_OF_NUMBERS = reader.nextInt();
        
        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            int celsiusTemperature = Math.round(NINE_FIFTHS * (reader.nextInt() - 32));

            System.out.printf("%d ", celsiusTemperature);
        }

        reader.close();
    }
}