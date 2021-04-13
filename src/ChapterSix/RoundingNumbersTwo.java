package ChapterSix;

import java.util.Scanner;

public class RoundingNumbersTwo {
    public static void roundToInteger(double number){
        double roundedOffNumber = Math.floor ( number + 0.5 );
        System.out.println ( number + "\tWas Rounded Off to\t" + (int)roundedOffNumber );
    }

    public static void roundToTenths(double number){
       double roundedOffNumber = Math.floor ( number * 10 + 0.5 )/10;
        System.out.println ( number + "\tWas Rounded Off to\t" + (int)roundedOffNumber );
    }
    public static void roundToHundredths(double number){
        double roundedOffNumber = Math.floor ( number * 100 + 0.5 )/100;
        System.out.println ( number + "\tWas Rounded Off to\t" + (int)roundedOffNumber );
    }

    public static void roundToThousandths(double number){
        double roundedOffNumber = Math.floor ( number * 1000 + 0.5 )/1000;
        System.out.println ( number + "\tWas Rounded Off to\t" + (int)roundedOffNumber );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.print ("Input a Value of type double: ");
        double number = input.nextDouble ();

        roundToInteger ( number );
        roundToTenths ( number );
        roundToHundredths ( number );
        roundToThousandths ( number );


    }
}
