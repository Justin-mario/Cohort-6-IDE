package TDD;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
        private Calculator calculator;
    @BeforeEach
    void startAllTestsWith() {
        calculator = new Calculator();
    }

    @Test
    void addTwoNumbersTest(){
        //Calculator calculator = new Calculator();
        int sum = calculator.add(3,2);
        assertEquals(5, sum);
        assertEquals(9, calculator.add(5,4));

    }
    @Test
    @DisplayName("Multiple Two Number")
    void multiplyTwoNumber(){
        //Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2,2));

    }

    @Test
    @DisplayName("Division of two numbers")
            void divideTwoNumbers(){
        //Calculator calculator = new Calculator();
        assertEquals( 2, calculator.divide(6,3));
        assertEquals(10, calculator.divide(100,10));

    }

    @Test
    @DisplayName("Float return")
        void floatNumberTest(){
        //Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5,2));
    }

    @Test
    @DisplayName("Division by zero returns zero")
        void divisionByZero(){
        //Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.divide(5, 0));
    }

    @Test
    @DisplayName("Finding Difference of two numbers")
        void difference_canBECalculated(){
        assertEquals(10, calculator.subtract(20,10));
    }

    @Test
    @DisplayName("Difference will produce absolute number")
        void difference_willProduceAbsoluteResult(){
        assertEquals(5, calculator.subtract(5,10));
    }



    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void calculatorCanCalculateAge(){
        LocalDate bessieDob = LocalDate.of(2018, 5,8);
        assertEquals(2, calculator.calculateAge(bessieDob));
    }
}
