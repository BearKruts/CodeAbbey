/**
*    Problem: Bicycle Race
*    Url: http://www.codeabbey.com/index/task_view/bicycle-race
*    Autor: Mykhailo Kruts
*    Date: 18 March 2018
*/

import java.util.Scanner;

public class BicycleRace {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        final int AMOUNT_OF_PAIRS = reader.nextInt();

        for (int i = 0; i < AMOUNT_OF_PAIRS; i++) {
           	double result = distancesBetweenFirstCity(Double.parseDouble(reader.next()), Double.parseDouble(reader.next()), Double.parseDouble(reader.next()));

            System.out.printf("%f ", result);
        }
        
        reader.close();
    }

    public static double distancesBetweenFirstCity (double distance, double speedFirstBicyclist, double speedSecondBicyclist) {
    	double estimatedTimeOfArrivala = distance / (speedFirstBicyclist + speedSecondBicyclist);

        return estimatedTimeOfArrivala * speedFirstBicyclist;
    }
}