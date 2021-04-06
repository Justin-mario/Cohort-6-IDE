package ChapterFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 55; counter++) {
            System.out.print ( "* " );
            if (counter == 1 || counter == 3 || counter == 6 || counter == 10 || counter == 15 || counter == 21 ||
                    counter == 28 || counter == 36 || counter == 45 || counter == 55) {
                System.out.println ();
            }
        }
        System.out.println ();
        for (int counter = 54; counter >=0 ; counter--) {
            System.out.print ( "* " );
            if (counter == 55 || counter == 45 || counter == 36 || counter == 28 || counter == 21 || counter == 15 ||
                    counter == 10 || counter == 6 || counter == 3 || counter == 1) {
                System.out.println ();
            }
        }

        System.out.println ();
        for (int counter = 54; counter >=0 ; counter--) {

            System.out.print (" *");
            if (counter == 55 || counter == 45 || counter == 36 || counter == 28 || counter == 21 || counter == 15 ||
                    counter == 10 || counter == 6 || counter == 3 || counter == 1) {

                System.out.println ();
            }
        }

    }
}