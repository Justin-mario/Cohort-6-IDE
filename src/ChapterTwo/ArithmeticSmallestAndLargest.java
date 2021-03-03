package ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" First Number: ");
        int firstNumber = input.nextInt();

        System.out.print(" Second Number: ");
        int secondNumber = input.nextInt();

        System.out.print(" Third Number: ");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        int product = firstNumber * secondNumber * thirdNumber;

        System.out.println(" sum is: " + sum + " Average is: " + average + " Product is: " + product);

            if(sum > average && sum > product){
                System.out.println("Largest Number  " + sum);}
            if(average > product && average > sum ){
                System.out.println("Largest Number  " + average);}

            if(product > sum && product > average);{
                System.out.println("Largest Number  " + product);}








    }
}
