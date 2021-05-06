package FromChapter14Exc;

import java.util.Scanner;

public class DisplayingStringsInUpperAndLowerCase {

    public  static void upperAndLowerCase(String userInput){
        String upperCase;
        String lowerCase;

        upperCase = userInput.toUpperCase ();
        lowerCase = upperCase.toLowerCase ();

        System.out.println ("\nUpper case of " + userInput + " is " + upperCase + "\n");
        System.out.println ("Lower case of " + upperCase + " is " +lowerCase);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        String userInput;

        System.out.print ("Input a word in Lowercase: ");
        userInput = input.nextLine ();
        upperAndLowerCase ( userInput );

    }
}
