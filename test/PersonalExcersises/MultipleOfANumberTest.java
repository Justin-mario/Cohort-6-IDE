package PersonalExcersises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleOfANumberTest {

    @Test
    void checkIfSecondNumberIsMultipleOfFirstNumber(){
        assertTrue ( MultipleOfANumber.isMultipleOfTwoNumbers (400, 2));
    }

    @Test
    void checkThatANumberCannotBeMultipleOfItself(){
        assertFalse ( MultipleOfANumber.isMultipleOfTwoNumbers (400, 400));
    }

    @Test
    void checkThatZeroCannotBeMultipleOfANumber() {

        assertThrows ( ArithmeticException.class, () -> assertTrue ( MultipleOfANumber.isMultipleOfTwoNumbers ( 400, 0 ) ) );
        }

    @Test
    void checkThatNoNumberCanBeMultipleOfZero() {

        assertThrows ( ArithmeticException.class, () -> assertTrue ( MultipleOfANumber.isMultipleOfTwoNumbers ( 0, 400 ) ) );
    }

}