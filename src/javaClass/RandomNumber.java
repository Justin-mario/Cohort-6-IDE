package javaClass;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis()/ 7 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print("what is " + number1 + " + " + number2 + " ?");

        int number = input.nextInt();
        int answer = 0;
        System.out.println(number1 + " + " + number2 + " = " + answer + "is " + (number1 + number2 == answer));

    }
}
