package PersonalExcersises;

import java.util.Scanner;

public class multipleOfNumberMain {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner input = new Scanner ( System.in );

        System.out.print ( "Input First Numbers: " );
        firstNumber = input.nextInt ();

        while(firstNumber != -1){
            System.out.print ( "Input Second Number" );
            secondNumber = input.nextInt ();
            System.out.println ( "Is\t" + secondNumber + "\tMultiple Of " + firstNumber + "?\t" +
                    MultipleOfANumber.isMultipleOfTwoNumbers ( firstNumber, secondNumber ) );
            System.out.print ( "Input First Numbers: " );
            firstNumber = input.nextInt ();
                if(firstNumber == -1){
                    break;}
            System.out.print ( "Input Second Numbers: " );
            secondNumber = input.nextInt ();

        System.out.println ( "Is\t" + secondNumber + "\tMultiple Of " + firstNumber + "?\t" +
                MultipleOfANumber.isMultipleOfTwoNumbers ( firstNumber, secondNumber ) );
        }
    }
}
