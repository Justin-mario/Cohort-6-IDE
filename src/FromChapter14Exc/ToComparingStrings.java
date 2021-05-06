package FromChapter14Exc;

import java.util.Scanner;

public class ToComparingStrings {

    public static void CompareTwoStrings(String name1, String name2){
        int answer;


        answer = name1.compareTo ( name2 );

        System.out.println (answer);

        if (answer == 0)
            System.out.println (name1 + "\tis equal to:\t" + name2);
        else if (answer < 0)
            System.out.println (name1 + "\tis less than:\t" + name2);
        else if (answer > 0)
            System.out.println (name1 + "\tis greater than:\t" + name2);

    }
    public static void main(String[] args) {
        String name1;
        String  name2;
        Scanner input = new Scanner ( System.in );

        System.out.print ("Enter a word: ");
        name1 = input.nextLine ();
        System.out.print ("Enter another word: ");
        name2 = input.nextLine ();
        CompareTwoStrings ( name1, name2 );

    }

}
