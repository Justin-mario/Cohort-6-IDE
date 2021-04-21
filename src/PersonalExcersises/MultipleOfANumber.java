package PersonalExcersises;

public class MultipleOfANumber {

    public static boolean isMultipleOfTwoNumbers(int firstNumber, int secondNumber) {
        if (secondNumber == 0 || firstNumber == 0 || firstNumber < secondNumber) {
            throw new ArithmeticException  ( "Arithmetic Error, Check That Neither First Number Nor second Number Is Zero" );
        }
        else return firstNumber % secondNumber == 0 && firstNumber != secondNumber;
    }
}
