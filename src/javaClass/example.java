package javaClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now ();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern ( "yyyy" );
        String formattedDate = myDateTime.format ( myFormatObj);
        /*double amount;
        double principal = 1000.0;
        double rate = 0.06;
        for (int year = 2; year < 11; year++) {

            amount = principal * Math.pow ( 1 + rate, year );
            System.out.println ( year + " \t\t" + amount );
        }*/
        double y;
        double x;

        Scanner input = new Scanner ( System.in );
        x = input.nextDouble ();
        System.out.println ( formattedDate );
        y = Math.floor(x * 1000 + 0.5) / 1000;
        System.out.printf ("%f%s%d", x,"\t", (int)y);


    }
}