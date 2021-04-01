package ChapterFour;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        int maximumNumber=0;
        int counter = 1;
        int number;
        int secondMaximumNumber = 0;
        Scanner input = new Scanner ( System.in );
        while (counter <= 5) {
            System.out.println ( "Input 9 numbers" );
            number = input.nextInt ();
            if (number > maximumNumber)
                if (number > secondMaximumNumber){
                maximumNumber = number;
                 secondMaximumNumber = maximumNumber;}
                 else
                     secondMaximumNumber = number;

            counter++;
        }
        System.out.println ( "Largest number is: " + maximumNumber + "\nSecond Largest Number Entered is: " + secondMaximumNumber );


    }
}