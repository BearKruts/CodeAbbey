/**
*    Problem: Smoothing the Weather
*    URL: http://www.codeabbey.com/index/task_view/smoothing-the-weather
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.Locale;
import java.util.Scanner;

public class SmoothingTheWeather {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
        double[] temperature = new double[reader.nextInt()];

        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = reader.nextDouble();
        }

        double[] temperatureClone = temperature.clone();

        for (int i = 0; i < temperature.length; i++) {
            if ((i > 0) && (i < temperature.length - 1)) {
                temperature[i] = (temperatureClone[i - 1] + temperatureClone[i] + temperatureClone[i + 1]) / 3;
            }

            System.out.printf("%s ", temperature[i]);
        }

        reader.close();
    }
}