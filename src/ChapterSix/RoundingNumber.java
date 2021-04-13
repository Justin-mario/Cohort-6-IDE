package ChapterSix;

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        double number = 0;
        double roundedOffNumber;

        while (number != -1) {
            System.out.print ( "Input a double value: " );
            number = input.nextDouble ();
            roundedOffNumber = Math.floor ( number + 0.5 );
            System.out.println ( number + "\tWas Rounded Off to\t" + (int)roundedOffNumber );
        }
    }
}