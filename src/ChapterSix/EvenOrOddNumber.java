package ChapterSix;

import java.util.Scanner;

public class EvenOrOddNumber {
        public static int isEven(int number){
            if (number % 2 == 0)
                System.out.println (true);

            else
               System.out.println (false);
            return number;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.print ("input an integer value: ");
        int number = input.nextInt ();
        isEven ( number);

    }
    }

