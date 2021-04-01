package javaClass;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Number:  ");
         int number = input.nextInt();
         if(number > 0) {
             int counter = 1;

            while (counter <= number){// for (int counter = 2; counter <= number; counter++) {

                 if (number % counter == 0){

                     System.out.printf("factors of %s are:  %d\t", number, counter);
                     }
                counter++;
                }
             }

         else
             System.out.println("Input a Number above 0");
       }
}


