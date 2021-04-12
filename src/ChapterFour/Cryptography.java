package ChapterFour;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        int fourDigitNumber;
        int firstDigitDivision;
        int firstDigitModulo;
        int secondDigitDivision;
        int secondDigitModulo;
        int thirdDigitDivision;
        int thirdDigitModulo;
        int holdingVariable;
        int secondHoldingVariable;

        System.out.print ("Input Four Digit Integer: ");
        fourDigitNumber = input.nextInt ();

        firstDigitDivision = ((fourDigitNumber / 1000) + 7) % 10;
        firstDigitModulo = fourDigitNumber % 1000;
        secondDigitDivision = ((firstDigitModulo / 100) + 7) % 10;
        secondDigitModulo = firstDigitModulo % 100;
        thirdDigitDivision = ((secondDigitModulo / 10) + 7) % 10;
        thirdDigitModulo = ((secondDigitModulo % 10) + 7) % 10;

        holdingVariable = firstDigitDivision;
        firstDigitDivision = thirdDigitDivision;
        thirdDigitDivision = holdingVariable;

        secondHoldingVariable = secondDigitDivision;
        secondDigitDivision = thirdDigitModulo;
        thirdDigitModulo = secondHoldingVariable;


        System.out.println (firstDigitDivision + " " + secondDigitDivision +" " + thirdDigitDivision + " " + thirdDigitModulo);

        secondHoldingVariable = thirdDigitModulo;
        thirdDigitModulo = secondDigitDivision;
        secondDigitDivision = secondHoldingVariable;

        holdingVariable = thirdDigitDivision;
        thirdDigitDivision = firstDigitDivision;
        firstDigitDivision = holdingVariable;

       firstDigitDivision = (firstDigitDivision + 10) - 7;
       secondDigitDivision = (secondDigitDivision + 10) - 7;
       thirdDigitDivision = (thirdDigitDivision + 10) - 7;
       thirdDigitModulo = (thirdDigitModulo + 10) -7;

        System.out.println (firstDigitDivision + " " + secondDigitDivision + " " + thirdDigitDivision + " " + thirdDigitModulo);

    }
}
