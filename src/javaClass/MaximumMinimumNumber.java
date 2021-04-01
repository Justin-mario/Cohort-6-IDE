package javaClass;

import java.util.Scanner;

public class MaximumMinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int counter = 1;
       double number = 0;
       double max = 0;
       double min = 0;

       while(counter <= 5){
          // System.out.println("Enter Max and Min Numbers: ");
           //number = input.nextDouble();
           max = Math.max(counter,max);
           min = Math.min(counter, min);
        counter++;
       }
        System.out.println("Maximum number is: " + max + "Minimum Number is: " + min);
    }

}
