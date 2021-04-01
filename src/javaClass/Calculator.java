package javaClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        int add, subtract, multiply;
        double divide;

        System.out.println(" input First and Second number");
        number1 = input.nextInt();
        number2 = input.nextInt();

        add = number1 + number2;
        subtract = number1 - number2;
        multiply = number1 * number2;
        divide = number1 / number2;

        System.out.println(" Addition is: " + add + " Subtraction is: " + subtract + " multiplication is: " + multiply
                + " division is: " + divide );

    }
}
