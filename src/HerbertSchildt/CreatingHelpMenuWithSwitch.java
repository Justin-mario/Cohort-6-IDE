package HerbertSchildt;

import java.util.Scanner;

public class CreatingHelpMenuWithSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );

        String prompt = """
                --> press 1 for Help on IF Statement.
                --> press 2 for SWITCH Statement.
                --> press 3  to Exit.
                """;
        int userChoice = 0;
        while(userChoice != 3){
            System.out.println ( "Help Desk" );
            System.out.println ( prompt );
             userChoice = input.nextInt ();
            switch (userChoice){
                case 1:
                    System.out.println ( "The IF: condition Statement\n Else condition statement" );
                    break;
                case 2:
                    System.out.println ( "The Switch :\n Switch (expressions) {\t\ncase constant:\t\nstatement sequence" );
                    break;
                case 3:
                    break;
                default:
                    System.out.println ( "Selection not found" );

            }
        }
    }
}
