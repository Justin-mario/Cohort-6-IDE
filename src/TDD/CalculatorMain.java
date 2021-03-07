package TDD;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInputCollector = new Scanner(System.in);
            int userChoice = 0;
            int counter = 0;
            String prompt = """
                      Hello User,
                      Welcome to lasu Calculator. 
                      -> Enter 1 for addition. 
                      -> Enter 2 for absolute subtraction. 
                      -> Enter 3 for multiplication. 
                      -> Enter 4 for division. 
                        Enter a number to perform task""";
        while(userChoice != -1) {
            System.out.println(prompt);
             userChoice = userInputCollector.nextInt();
            System.out.println("Enter First Number");
            int firstNumber = userInputCollector.nextInt();
            System.out.println("Enter second Number");
            int secondNumber = userInputCollector.nextInt();

            switch (userChoice) {
                case 1 -> System.out.println("Sum is: " + calculator.add( firstNumber, secondNumber));
                case 2 -> System.out.println("Difference is: " + calculator.subtract(firstNumber, secondNumber));
                case 3 -> System.out.println("Total is: " + calculator.multiply(firstNumber, secondNumber));
                case 4 -> System.out.println("Answer is: " + calculator.divide(firstNumber, secondNumber));
                default -> System.out.println("oga choose something Reasonable");
            }
            counter++;
        }

    }
}
