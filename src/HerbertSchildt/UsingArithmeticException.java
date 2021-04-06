package HerbertSchildt;

public class UsingArithmeticException {
    public static void main(String[] args) {
        int[] number1 = {10, 8, 6, 12, 18};
        int[] number2 = {2, 0, 6, 3, 0};
        for (int counter = 0; counter < number1.length; counter++) {
            try {

                System.out.println ( number1[counter] / number2[counter] );
            } catch (ArithmeticException e) {
                System.out.println ( "Can not be divided by zero" );
            }
        }
    }
}
