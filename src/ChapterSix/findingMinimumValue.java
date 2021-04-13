package ChapterSix;

import java.util.Scanner;

public class findingMinimumValue {
    public static void minimum3(double firstNumber, double secondNumber, double thirdNumber){
        double minimumNumber = Math.min ( firstNumber,Math.min ( secondNumber, thirdNumber ) );
        System.out.println ("Minimum Number is: " + "\t" + minimumNumber);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.print ("Input three numbers: ");
        double firstNumber = input.nextDouble ();
        double secondNumber = input.nextDouble ();
        double thirdNumber = input.nextDouble ();

        minimum3 ( firstNumber, secondNumber, thirdNumber );
    }
}
