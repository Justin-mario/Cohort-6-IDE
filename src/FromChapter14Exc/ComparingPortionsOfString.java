package FromChapter14Exc;

import java.util.Scanner;

public class ComparingPortionsOfString {
    public static void ComparePortionsOfString(String firstInput, String secondInput){
        boolean answer;

        answer = firstInput.regionMatches ( 0, secondInput, 0, 4);
        System.out.println (answer);
        if (answer == true)
            System.out.println (firstInput + " is equals " + secondInput);
        else if(!answer)
            System.out.println (firstInput + " is not equals to  " + secondInput);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        String firstInput;
        String secondInput;

        System.out.print ("Enter first word to compare: ");
        firstInput = input.nextLine ();
        System.out.print ("Enter second word to compare: ");
        secondInput = input.nextLine ();
        ComparePortionsOfString ( firstInput,secondInput );

    }
}
