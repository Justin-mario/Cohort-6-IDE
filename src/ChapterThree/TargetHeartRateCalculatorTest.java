package ChapterThree;

import java.util.Scanner;

public class TargetHeartRateCalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        TargetHeartRateCalculator profile = new TargetHeartRateCalculator ( " ", " ");

        System.out.print ( "Enter First Name " );
        String firstName = input.nextLine ();
        profile.setFirstName ( firstName );
        System.out.print ( "Enter Last Name " );
        String lastName = input.nextLine ();
        profile.setLastName ( lastName );

        System.out.print ( "Enter Date of Birth DD/MM/YYYY " );
        int day = input.nextInt ();
        profile.setDayOfBirth ( day );
        System.out.print ( " " );
        int month = input.nextInt ();
        profile.setMonthOfBirth ( month );
        System.out.print ( " " );
        int year = input.nextInt ();
        profile.setYearOfBirth ( year );

        System.out.println ( "User Full Name Is: " + profile.getFirstName () + " " + profile.getLastName () );


        System.out.println ( "Date Of Birth:" + profile.getDayOfBirth () + "/" + profile.getMonthOfBirth () +
                "/" + profile.getYearOfBirth () );
        System.out.println ( "Age:" + profile.getAge () );
        System.out.println ( "Maximum heart rate is: " + profile.getMaximumHeartRate ());
        System.out.println ( "Target heart is:" + profile.getTargetHeartRate () );

    }
}
