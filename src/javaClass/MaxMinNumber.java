package javaClass;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number = 0;
       int min = 0;
       int max = 0;
        for( ; counter <= 5; counter++){
            System.out.println(" Input no: ");
            number = input.nextInt();
           if(counter == 1){
                max = number ;
                 min = number;}
                if ( number > max){
                    max = number;}




                    if(number < min){
                         min = number;}
            }
                    System.out.println("maximum number is: " + max + "Minimum number is: " +  min);

    }
}
