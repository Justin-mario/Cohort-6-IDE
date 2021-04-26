package javaClass;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int total = 0;
        int average;
        int counter = 0;
        System.out.println ("Enter any integer that is not zero");
        int number = input.nextInt ();
        while (number != 0){
            if (number > 0){
                positiveNumbers ++;}
            else{
                negativeNumbers ++;}

            total += number;

        System.out.println ("Enter any integer that is not zero");
         number = input.nextInt ();
            counter++;
        }
        average = total/counter;

        System.out.println (positiveNumbers + " \n" + negativeNumbers + "\nTotal is " + total + " \nAverage is " + average );
    }
}
