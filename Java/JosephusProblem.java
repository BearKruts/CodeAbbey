/**
*    Problem: Josephus Problem
*    URL: http://www.codeabbey.com/index/task_view/josephus-problem
*    Autor: Mykhailo Kruts
*    Date: 16 March 2018
*/

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int winner = josephusWinner(reader.nextInt(), reader.nextInt());

        System.out.println(winner);
        reader.close();
    }

    public static int josephusWinner (int numberOfPeople, int step) {
        ArrayList<Integer> peopleArrays = new ArrayList<Integer>(numberOfPeople);
        int index = 0;

        for( int i = 0; i < numberOfPeople; i++) {
            peopleArrays.add(i);
        }

        while (peopleArrays.size() > 1) {
            index = (index + step - 1) % peopleArrays.size();
            peopleArrays.remove(index);
        }

        return peopleArrays.get(0) + 1;
    }
}