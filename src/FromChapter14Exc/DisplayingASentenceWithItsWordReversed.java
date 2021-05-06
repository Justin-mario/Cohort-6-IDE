package FromChapter14Exc;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayingASentenceWithItsWordReversed {
    public static void reverseWord(String userInput){
        char[] result;

        String[] token =  userInput.split ( "" );
        StringBuilder reversed = new StringBuilder ();
        int i ;
        for (i = userInput.length (); i >= 0; i--) {
            userInput.charAt ( i);
        }
        System.out.println ( token);
        System.out.println (userInput);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        String userInput;

        System.out.println ("Enter a word: ");
        userInput = input.nextLine ();
        reverseWord ( userInput );

    }
}
