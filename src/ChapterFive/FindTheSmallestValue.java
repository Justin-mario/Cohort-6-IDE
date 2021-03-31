package ChapterFive;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
         int minimumNumber;
         int number;
        System.out.println ("enter number");
        minimumNumber = input.nextInt ();

        for(int counter = 1; counter <= 5; counter++) {
            System.out.print ( "Input Number: " );
            number = input.nextInt ();

            if ( number < minimumNumber) {
                minimumNumber = number;
            }


        }
        System.out.println ( "minimum Number is: " + minimumNumber );

    }
}
