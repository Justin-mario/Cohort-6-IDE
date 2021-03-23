package ChapterThree;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        HealthProfile profile = new HealthProfile ( " ", " ", " " );

        System.out.print ( "Enter First Name " );
        String firstName = input.nextLine ();
        profile.setFirstName ( firstName );
        System.out.print ( "Enter Last Name " );
        String lastName = input.nextLine ();
        profile.setLastName ( lastName );
        System.out.print ( "Enter Gender " );
        String gender = input.nextLine ();

        profile.setGender ( gender );
        System.out.print ( "Enter Date of Birth DD/MM/YYYY " );
        int day = input.nextInt ();
        profile.setDayOfBirth ( day );
        System.out.print ( " " );
        int month = input.nextInt ();
        profile.setMonthOfBirth ( month );
        System.out.print ( " " );
        int year = input.nextInt ();
        profile.setYearOfBirth ( year );

        System.out.print ( "Enter Height in Inches " );
        double height = input.nextDouble ();
        profile.setHeight ( height );

        System.out.print ( "Enter weight in pounds " );
        double weight = input.nextDouble ();
        profile.setWeight ( weight );

        System.out.println ( "User Full Name Is: " + profile.getFirstName () + " " + profile.getLastName () );

        System.out.println ( "SEX: " + profile.getGender () + " Height: " + profile.getHeight () + " Weight " + profile.getWeight () );
        System.out.println ( "Date Of Birth:" + profile.getDayOfBirth () + "/" + profile.getMonthOfBirth () +
                "/" + profile.getYearOfBirth () );
        System.out.println ( "Age:" + profile.getAge () );
        System.out.println ( "Maximum heart rate is: " + profile.getMaximumHeartRate ());
        System.out.println ( "Target heart is:" + profile.getTargetHeartRate () );
        System.out.printf ( "B.M.I is: %s%n", profile.getBMI ());
        System.out.println ( "Underweight: less than 18.5\nNormal: between 18.5 and 24.9\n " +
                "Overweight: between 25 and 29.9\nObese: 30 or greater" );


    }
}
