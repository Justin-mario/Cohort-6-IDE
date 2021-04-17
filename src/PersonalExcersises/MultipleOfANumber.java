package PersonalExcersises;

public class MultipleOfANumber {

    public static boolean isMultipleOfTwoNumbers(int firstNumber, int secondNumber) {
        if (secondNumber == 0 || firstNumber == 0) {
            throw new ArithmeticException  ( "Zero Can Not Be Multiple Of Any Number" );
        }
        else return firstNumber % secondNumber == 0 && firstNumber != secondNumber;

    }
}
