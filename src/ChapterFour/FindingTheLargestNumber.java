package ChapterFour;

import java.util.Scanner;

public class FindingTheLargestNumber {
    public static void main(String[] args) {
        int maximumNumber = 0;
        int counter = 1;
       int number = 0;
        while(counter <= 10) {
            Scanner input = new Scanner ( System.in );
            System.out.println ( "Input 10 numbers" );
            number = input.nextInt ();

            if (number > maximumNumber) {
                maximumNumber = number;

            }
            counter++;
        }
            System.out.println ( "Maximum number is: " + maximumNumber + "\nLast Number Entered is: " + number );

    }
}
