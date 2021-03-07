package ChapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        int minimum = 0;
        int maximum = 0;

        System.out.print(" Enter Number: ");
         number = input.nextInt();
          maximum = number;
        System.out.print(" Enter Number: ");
        number = input.nextInt();
        minimum = number;

         if(maximum >  minimum){
             maximum = minimum;}
        if( maximum < minimum)
             minimum = maximum;
        System.out.print(" Enter Number: ");
        number = input.nextInt();
        if(number > maximum){
            maximum = number;
        }
        if(number < minimum){
            minimum = number;
        }
        System.out.print(" Enter Number: ");
        number = input.nextInt();

        if(number > maximum){
            maximum = number;
        }
        if(number < minimum){
            minimum = number;
        }

        System.out.print(" Enter Number: ");
        number = input.nextInt();
        if(number > maximum){
            maximum = number;
        }
        if(number < minimum){
            minimum = number;
        }

        System.out.println("maximum no is: " + maximum + " minimum number is: " + minimum);
    }
}
