package FromChapter14Exc;

import java.util.Scanner;

public class TotalOccurrenceOfCharacter {

    public static void occurrenceOfLetter(String userInput, char occurrence) {
        int total = 0;
        int count = 0;

        for (; count < userInput.length (); count++) {
            if (occurrence == userInput.charAt ( count ))
                total++;
        }
        System.out.println ( total );
    }

    public static void occurrenceOfWords(String userInput, String occurrenceOfWords){
        int totalOccurrence = 0;
        int counter = 0;

        for ( ; counter < userInput.length (); counter++){
            if (userInput.regionMatches ( 0, occurrenceOfWords, 0, occurrenceOfWords.length () )){
                totalOccurrence++;
            }
        }
        System.out.println (totalOccurrence);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        String userInput;
        String newUserInput;
        char occurrence;
        String occurrenceOfWords;

        /*System.out.print ( "Enter a word: " );
        userInput = input.nextLine ();
        System.out.print ( "Input the letter to search: " );
        occurrence = input.next ().charAt ( 0 );
        //occurrenceOfLetter ( userInput, occurrence );*/

        System.out.print ( "Enter some words: " );
        newUserInput = input.nextLine ();
        System.out.print ( "Input the word to search: " );
        occurrenceOfWords = input.nextLine ();
        //occurrenceOfLetter ( userInput, occurrence );
        occurrenceOfWords ( newUserInput, occurrenceOfWords );

    }
}