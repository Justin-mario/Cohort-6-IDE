package TDD;

public class Calculator {


    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public double divide(int number1, int number2) {
        if(number2== 0){
            return 0;
        }
        //return number1 / number2;
        return number1/(number2 * 1.0);
    }

    public int subtract(int number1, int number2) {
        if(number1 > number2)
            {
            return number1 - number2;
            }
        return number2 - number1;

    }
}
