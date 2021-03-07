package ChapterTwo;

import java.util.Scanner;

public class multiplesOfTwoIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number ");
        int number1 = input.nextInt();

        System.out.print("Enter second number ");
        int number2 = input.nextInt();

        if(number1 % number2 == 0){
            System.out.println("First number is a multiple of Second number");
        }
        else{
            System.out.println("First number is not a multiple of second number");
        }
    }
}
