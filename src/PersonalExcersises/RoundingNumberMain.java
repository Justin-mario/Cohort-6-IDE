package PersonalExcersises;

import java.util.Scanner;

public class RoundingNumberMain {
    public static void main(String[] args) {
        Scanner input =  new Scanner ( System.in );
        System.out.print ( "Enter Number to round Off: " );
        double number = input.nextDouble ();
        System.out.println ( "Number to round off is:  " + number );
        System.out.println ( "Rounded off : " + NumberRounding.roundToInteger ( number ));
        System.out.println ( "Rounded to Tenths: " + NumberRounding.roundToTenths ( number ));
        System.out.println ( "Rounded to Hundredths: " + NumberRounding.roundToHundredths ( number ) );
        System.out.println ( "Rounded to Thousandths: " + NumberRounding.roundToThousandths ( number ));
    }
}
