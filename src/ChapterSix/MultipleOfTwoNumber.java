package ChapterSix;

import java.util.Scanner;

public class MultipleOfTwoNumber {
    public static void isMultiple(int firstNumber, int secondNumber){
        if (firstNumber % secondNumber == 0){
            System.out.println (true);}
            else{
            System.out.println (false);}

    }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.print ("Input Two Numbers: ");
        int firstNumber = input.nextInt ();
        int secondNumber = input.nextInt ();
        isMultiple ( firstNumber,secondNumber );

    }
}
