package ChapterSix;

import java.util.Scanner;

public class ReversingDigits {
    public static void reverseNumbers(int number) {
        int temporaryVariable;
        int remainder;
        int reversal = 0;

        temporaryVariable = number;

        while (temporaryVariable > 0) {
            remainder = temporaryVariable % 10;
            reversal = reversal * 10 + remainder;
            temporaryVariable /= 10;
        }
        System.out.println ( "For\t" + number + "\tThe reverse is\t" + reversal );

    }
        public static void main (String[]args){
            Scanner input = new Scanner ( System.in );
            System.out.print ( "Input Number: " );
            int number = input.nextInt ();
            reverseNumbers ( number );

        }
    }
